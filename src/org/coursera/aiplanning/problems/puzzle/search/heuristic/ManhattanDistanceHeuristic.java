package org.coursera.aiplanning.problems.puzzle.search.heuristic;

import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class ManhattanDistanceHeuristic implements PuzzleHeuristic
{
	private final int[] correctRowPosition = new int[] {0, 0, 0, 1, 1, 1, 2, 2, 2};
	private final int[] correctColumnPosition = new int[] {0, 1, 2, 0, 1, 2, 0, 1, 2};
	
	/**
	 * 
	 */
	protected ManhattanDistanceHeuristic() {}

	/**
	 * 
	 */
	@Override
	public double evaluate(PuzzleState state) 
	{
		double hvalue = 0.0;
		// compute the manhattan distance for each element of the matrix
		for (int i = 0; i < state.getMatrixSize(); i++) {
			for (int j = 0; j < state.getMatrixSize(); j++) {
				// get [i,j] element
				int val = state.getElementAt(i, j);
				// check val position
				if (i != this.correctRowPosition[val] || j != this.correctColumnPosition[val]) {
					// compute manhattan distance
					int row_moves = Math.abs(i - this.correctRowPosition[val]);
					int col_moves = Math.abs(j - this.correctColumnPosition[val]);
					// update heuristic value
					hvalue += (row_moves + col_moves);
				}
			}
		}
		
		return hvalue;
	}
}
