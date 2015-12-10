package org.coursera.aiplanning.problems.missionariesandcannibals.action;

import org.coursera.aiplanning.problems.missionariesandcannibals.state.BoatPosition;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemAction1C1M extends MCProblemAction
{
	/**
	 * 
	 */
	public MCProblemAction1C1M() {
		super(MCProblemActionType.ACTION_1C1M);
	}

	/**
	 * 
	 */
	@Override
	public MCProblemState applyTo(MCProblemState current) 
	{
		MCProblemState next = new MCProblemState();
		// check current state
		if (current.getBoatPosition().equals(BoatPosition.LEFT_SHORE)) {
			// left shore
			next.setBoatPosition(BoatPosition.RIGTH_SHORE);
			next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter() - 1);
			next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter() + 1);
			next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter() - 1);
			next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter() + 1);
		}
		else {
			// right shore
			next.setBoatPosition(BoatPosition.LEFT_SHORE);
			next.setLeftShoreMissionariesCounter(current.getLeftShoreMissionariesCounter() + 1);
			next.setRightShoreMissionariesCounter(current.getRightShoreMissionariesCounter() - 1);
			next.setLeftShoreCannibalsCounter(current.getLeftShoreCannibalsCounter() + 1);
			next.setRightShoreCannibalsCounter(current.getRightShoreCannibalsCounter() - 1);
		}
		return next;
	}
}
