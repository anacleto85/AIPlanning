package org.coursera.aiplanning.problems.missionariesandcannibals.action;

import org.coursera.aiplanning.problems.missionariesandcannibals.state.BoatPosition;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemAction0C1M extends MCProblemAction
{
	/**
	 * 
	 */
	public MCProblemAction0C1M() {
		super(MCProblemActionType.ACTION_0C1M);
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
			next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter() - 1);
			next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter() + 1);
		}
		else {
			// right shore
			next.setBoatPosition(BoatPosition.LEFT_SHORE);
			next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter() + 1);
			next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter() - 1);
		}
		return next;
	}
}
