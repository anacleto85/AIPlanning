package org.coursera.aiplanning.problems.puzzle;

import org.coursera.aiplanning.problems.puzzle.search.PuzzleSolver;
import org.coursera.aiplanning.problems.puzzle.search.heuristic.PuzzleHeuristicType;
import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class Main 
{
	private static final int MATRIX_SIZE = 3;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int [][] matrix = new int[][]{	{8, 1, 7}, {4, 5, 6}, {2, 0, 3} };
		int emptyTileRow = 2;
		int emptyTileColumn = 1;
		// create the initial state
		PuzzleState initialState = new PuzzleState(matrix, MATRIX_SIZE, emptyTileRow, emptyTileColumn);
		System.out.println("PuzzleProblem: Initial State\n"+initialState);
//		PuzzleSolver solver = new PuzzleSolver(initialState, PuzzleHeuristicType.WRONG_POSITION_COUNTER);
		PuzzleSolver solver = new PuzzleSolver(initialState, PuzzleHeuristicType.MANHATTAN_DISTANCE);
		solver.solve();
	}
}
