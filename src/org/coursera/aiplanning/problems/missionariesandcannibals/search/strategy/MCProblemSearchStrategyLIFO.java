package org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy;

import java.util.EmptyStackException;
import java.util.Stack;

import org.coursera.aiplanning.problems.missionariesandcannibals.search.MCProblemSearchNode;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.exception.EmptyFringeException;


/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemSearchStrategyLIFO implements MCProblemSearchStrategy
{
	private Stack<MCProblemSearchNode> fringe;
	
	/**
	 * 
	 */
	public MCProblemSearchStrategyLIFO() {
		this.fringe = new Stack<>();
	}

	/**
	 * 
	 */
	@Override
	public MCProblemSearchNode getNextNode() throws EmptyFringeException {
		MCProblemSearchNode next = null;
		try {
			// extract the top of the stack
			next = this.fringe.pop(); 
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
		this.fringe.push(node);
	}

}
