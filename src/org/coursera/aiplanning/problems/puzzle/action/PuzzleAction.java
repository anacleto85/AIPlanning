package org.coursera.aiplanning.problems.puzzle.action;

import org.coursera.aiplanning.problems.puzzle.search.PuzzleSearchNode;
import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public abstract class PuzzleAction 
{
	private double cost;
	private PuzzleActionType type;
	
	/**
	 * 
	 * @param type
	 */
	public PuzzleAction(PuzzleActionType type) {
		this.type = type;
		this.cost = 1.0;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public PuzzleActionType getType() {
		return type;
	}

	public void setType(PuzzleActionType type) {
		this.type = type;
	}

	/**
	 * 
	 * @param state
	 * @return
	 */
	public abstract boolean isApplicable(PuzzleSearchNode node);

	/**
	 * 
	 * @param state
	 * @return
	 */
	public abstract PuzzleState applyTo(PuzzleState state); 
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "[PuzzleAction: type="+this.type.getDescription()+", cost="+this.cost+"]";
	}
}
