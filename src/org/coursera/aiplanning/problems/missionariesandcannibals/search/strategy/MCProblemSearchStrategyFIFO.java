package org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

import org.coursera.aiplanning.problems.missionariesandcannibals.search.MCProblemSearchNode;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.exception.EmptyFringeException;


public class MCProblemSearchStrategyFIFO implements MCProblemSearchStrategy
{
	private Queue<MCProblemSearchNode> fringe;
	
	/**
	 * 
	 */
	public MCProblemSearchStrategyFIFO() {
		this.fringe = new LinkedList<>();
	}

	/**
	 * 
	 */
	@Override
	public MCProblemSearchNode getNextNode() throws EmptyFringeException {
		MCProblemSearchNode next = null;
		try {
			// extract the top of the stack
			next = this.fringe.remove();
		}
		catch(EmptyStackException ex) {
			throw new EmptyFringeException("[MCProblemSearchStrategyLIFO] No more elements into the fringe");
		}
		return next;
	}

	/**
	 * 
	 */
	@Override
	public void addToFringe(MCProblemSearchNode node) {
		// add the node on top of the stack
		this.fringe.add(node);
	}
}
