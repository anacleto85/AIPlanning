package org.coursera.aiplanning.problems.puzzle.search.heuristic;

import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class WrongPositionCounterHeuristic implements PuzzleHeuristic 
{
	/**
	 * 
	 */
	protected WrongPositionCounterHeuristic() {}

	/**
	 * 
	 */
	@Override
	public double evaluate(PuzzleState state) 
	{
		double errorCounter = 0.0;
		int valCounter = 0;
		for (int i = 0; i < state.getMatrixSize(); i++) {
			for (int j = 0; j < state.getMatrixSize(); j++) {
				// check value
				if (state.getElementAt(i, j) != valCounter) {
					errorCounter++;
				}
				// next expected value
				valCounter++;
			}
		}
		return errorCounter;
	}
}
