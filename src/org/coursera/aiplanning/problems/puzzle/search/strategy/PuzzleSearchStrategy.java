package org.coursera.aiplanning.problems.puzzle.search.strategy;

import java.util.ArrayList;
import java.util.List;

import org.coursera.aiplanning.problems.puzzle.search.PuzzleSearchNode;
import org.coursera.aiplanning.problems.puzzle.search.exception.EmptyFringeException;


/**
 * 
 * @author alessandroumbrico
 *
 */
public abstract class PuzzleSearchStrategy 
{
	protected List<PuzzleSearchNode> fringe;
	
	/**
	 * 
	 */
	public PuzzleSearchStrategy() {
		this.fringe = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param node
	 */
	public abstract void addToFringe(PuzzleSearchNode node);
	
	/**
	 * 
	 * @return
	 * @throws EmptyFringeException
	 */
	public abstract PuzzleSearchNode getNextToExpand() throws EmptyFringeException;
}
