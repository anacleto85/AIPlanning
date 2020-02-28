package org.coursera.aiplanning.problems.missionariesandcannibals.search;

import org.coursera.aiplanning.problems.missionariesandcannibals.action.MCProblemAction;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemSearchNode 
{
	private int id;
	private MCProblemState state;
	private MCProblemSearchNode parent;
	private MCProblemAction action;
	private int depth;
	private int cost;
	
	public MCProblemState getState() {
		return state;
	}
	
	public void setState(MCProblemState state) {
		this.state = state;
	}
	
	public MCProblemSearchNode getParent() {
		return parent;
	}
	
	public void setParent(MCProblemSearchNode parent) {
		this.parent = parent;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public MCProblemAction getAction() {
		return action;
	}

	public void setAction(MCProblemAction action) {
		this.action = action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String str = "";
		str = "[MCProblemSearchNode] id= "+this.id+", depth= "+this.depth+", cost= "+this.cost;
		if (this.action != null) {
			str += "\n\tgenerator-action= "+this.action.toString();
		}
		
		str += "\n\t"+this.state;
		return str;
	}
}
