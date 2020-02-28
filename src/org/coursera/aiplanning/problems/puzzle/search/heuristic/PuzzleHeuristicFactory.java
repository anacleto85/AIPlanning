package org.coursera.aiplanning.problems.puzzle.search.heuristic;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class PuzzleHeuristicFactory 
{
	private static PuzzleHeuristicFactory INSTANCE = null;
	
	private PuzzleHeuristicFactory() {}
	
	/**
	 * 
	 * @return
	 */
	public static PuzzleHeuristicFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PuzzleHeuristicFactory();
		}
		return INSTANCE;
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public PuzzleHeuristic getHeuristic(PuzzleHeuristicType type) 
	{
		PuzzleHeuristic h;
		// check type
		if (type.equals(PuzzleHeuristicType.MANHATTAN_DISTANCE)) {
			// manhattan distance 
			h = new ManhattanDistanceHeuristic();
		}
		else {
			// wrong position counter
			h = new WrongPositionCounterHeuristic();
		}
		return h;
	}
}
