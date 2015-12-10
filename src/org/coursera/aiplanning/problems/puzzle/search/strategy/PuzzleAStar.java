package org.coursera.aiplanning.problems.puzzle.search.strategy;

import java.util.Collections;

import org.coursera.aiplanning.problems.puzzle.search.PuzzleSearchNode;
import org.coursera.aiplanning.problems.puzzle.search.exception.EmptyFringeException;
import org.coursera.aiplanning.problems.puzzle.search.heuristic.PuzzleHeuristic;
import org.coursera.aiplanning.problems.puzzle.search.heuristic.PuzzleHeuristicFactory;
import org.coursera.aiplanning.problems.puzzle.search.heuristic.PuzzleHeuristicType;


/**
 * 
 * @author alessandroumbrico
 *
 */
public final class PuzzleAStar extends PuzzleSearchStrategy
{
	private PuzzleHeuristic heuristic;
	
	/**
	 * 
	 * @param htype
	 */
	public PuzzleAStar(PuzzleHeuristicType htype) {
		super();
		this.heuristic = PuzzleHeuristicFactory.getInstance().getHeuristic(htype);
	}

	/**
	 * 
	 */
	@Override
	public void addToFringe(PuzzleSearchNode node) 
	{
		// get node cost
		double gvalue = node.getCost();
		// get node status evaluation
		double hvalue = this.heuristic.evaluate(node.getState());
		// compute evaluation function value
		double fvalue = gvalue + hvalue;
		// set value
		node.setValue(fvalue);
		// add to fringe
		this.fringe.add(node);
		// sort fringe according to the f value of nodes
		Collections.sort(this.fringe);
	}

	/**
	 * 
	 */
	@Override
	public PuzzleSearchNode getNextToExpand() throws EmptyFringeException 
	{
		// check fringe size
		if (this.fringe == null || this.fringe.isEmpty()) {
			// no elemet to extract
			throw new EmptyFringeException("[PuzzleA*] Empty fringe - no nodes to expand");
		}
		// remove the first element of the fringe
		return this.fringe.remove(0);
	}
}
