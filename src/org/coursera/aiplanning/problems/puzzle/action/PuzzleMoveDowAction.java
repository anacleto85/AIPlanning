package org.coursera.aiplanning.problems.puzzle.action;

import org.coursera.aiplanning.problems.puzzle.search.PuzzleSearchNode;
import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public final class PuzzleMoveDowAction extends PuzzleAction 
{
	/**
	 * 
	 */
	public PuzzleMoveDowAction() {
		super(PuzzleActionType.MOVE_DOWN);
	}

	/**
	 * 
	 */
	@Override
	public boolean isApplicable(PuzzleSearchNode node) 
	{
		boolean applicable = true;
		if (node.getGeneratorAction() != null && node.getGeneratorAction().equals(PuzzleActionType.MOVE_UP)) {
			applicable = false;
		}
		else {
			// get status
			PuzzleState state = node.getState();
			// check empty tile position
			int row = state.getEmptyCellRow();
			if (row >= (state.getMatrixSize() - 1)) {
				applicable = false;
			}
		}
		return applicable;
	}

	/**
	 * 
	 */
	@Override
	public PuzzleState applyTo(PuzzleState state) 
	{
		int[][] matrix = new int[state.getMatrixSize()][state.getMatrixSize()];
		// initialize new matrix
		for (int i = 0; i < state.getMatrixSize(); i++) {
			for (int j = 0; j < state.getMatrixSize(); j++) {
				matrix[i][j] = state.getElementAt(i, j); 
			}
		}
		
		// get empty tile position
		int row = state.getEmptyCellRow();
		int column = state.getEmptyCellColumn();
		
		// move empty tile
		matrix[row][column] = matrix[row+1][column]; 
		matrix[row+1][column] = 0;
				
		// create next state
		return new PuzzleState(matrix, state.getMatrixSize(), row+1, column);
	}
	
}
