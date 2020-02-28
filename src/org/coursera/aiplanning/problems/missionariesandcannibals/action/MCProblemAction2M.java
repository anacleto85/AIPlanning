package org.coursera.aiplanning.problems.missionariesandcannibals.action;

import org.coursera.aiplanning.problems.missionariesandcannibals.state.BoatPosition;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemAction2M extends MCProblemAction
{
	/**
	 * 
	 * @param type
	 */
	public MCProblemAction2M() {
		super(MCProblemActionType.ACTION_2M);
	}
	
	/**
	 * 
	 */
	@Override
	public MCProblemState applyTo(MCProblemState current) 
	{
		MCProblemState next = new MCProblemState();
		// invariant 
		next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter());
		next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter());
		
		// check current state
		if (current.getBoatPosition().equals(BoatPosition.LEFT_SHORE)) {
			// left shore
			next.setBoatPosition(BoatPosition.RIGTH_SHORE);
			next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter() - 2);
			next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter() + 2);
		}
		else {
			// right shore
			next.setBoatPosition(BoatPosition.LEFT_SHORE);
			next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter() - 2);
			next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter() + 2);
		}
		return next;
	}
}
