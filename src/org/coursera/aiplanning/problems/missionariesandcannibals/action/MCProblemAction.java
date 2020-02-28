package org.coursera.aiplanning.problems.missionariesandcannibals.action;

import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public abstract class MCProblemAction 
{
	protected MCProblemActionType actionType;
	
	/**
	 * 
	 * @param type
	 */
	public MCProblemAction(MCProblemActionType type) {
		this.actionType = type;
	}
	
	/**
	 * 
	 * @param state
	 * @return
	 */
	public abstract MCProblemState applyTo(MCProblemState state);
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return this.actionType.getDescription();
	}
}
