package org.coursera.aiplanning.problems.missionariesandcannibals.action;

import org.coursera.aiplanning.problems.missionariesandcannibals.state.BoatPosition;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemAction1C0M extends MCProblemAction
{
	/**
	 * 
	 */
	public MCProblemAction1C0M() {
		super(MCProblemActionType.ACTION_1C0M);
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
			next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter() - 1);
			next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter() + 1);
		}
		else {
			// right shore
			next.setBoatPosition(BoatPosition.LEFT_SHORE);
			next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter() + 1);
			next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter() - 1);
		}
		return next;
	}
}
