package org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy;

import org.coursera.aiplanning.problems.missionariesandcannibals.search.MCProblemSearchNode;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.exception.EmptyFringeException;

/**
 * 
 * @author alessandroumbrico
 *
 */
public interface MCProblemSearchStrategy 
{
	/**
	 * 
	 * @return
	 * @throws EmptyFringeException
	 */
	public MCProblemSearchNode getNextNode() throws EmptyFringeException;
	
	/**
	 * 
	 * @param node
	 */
	public void addToFringe(MCProblemSearchNode node);
}
