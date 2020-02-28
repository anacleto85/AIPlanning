package org.coursera.aiplanning.problems.puzzle.search.heuristic;

import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public interface PuzzleHeuristic 
{
	/**
	 * 
	 * @param state
	 * @return
	 */
	public double evaluate(PuzzleState state);
}
