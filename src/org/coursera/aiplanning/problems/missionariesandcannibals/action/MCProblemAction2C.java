package org.coursera.aiplanning.problems.missionariesandcannibals.action;

import org.coursera.aiplanning.problems.missionariesandcannibals.state.BoatPosition;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemAction2C extends MCProblemAction
{
	/**
	 * 
	 * @param type
	 */
	public MCProblemAction2C() {
		super(MCProblemActionType.ACTION_2C);
	}
	
	/**
	 * 
	 */
	@Override
	public MCProblemState applyTo(MCProblemState current) 
	{
		MCProblemState next = new MCProblemState();
		// invariant 
		next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter());
		next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter());
		
		// check current state
		if (current.getBoatPosition().equals(BoatPosition.LEFT_SHORE)) {
			// left shore
			next.setBoatPosition(BoatPosition.RIGTH_SHORE);
			next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter() - 2);
			next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter() + 2);
		}
		else {
			// right shore
			next.setBoatPosition(BoatPosition.LEFT_SHORE);
			next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter() - 2);
			next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter() + 2);
		}
		return next;
	}
}
