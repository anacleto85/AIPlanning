package org.coursera.aiplanning.problems.missionariesandcannibals;

import org.coursera.aiplanning.problems.missionariesandcannibals.search.MCProblemSolver;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.MCProblemSearchStrategy;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.MCProblemSearchStrategyFIFO;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.BoatPosition;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class Main 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// build initial state
		MCProblemState initialState = new MCProblemState();
		initialState.setBoatPosition(BoatPosition.LEFT_SHORE);
		initialState.setLeftShoreCannibalsCounter(3);
		initialState.setLeftShoreMissionariesCounter(3);
		initialState.setRightShoreCannibalsCounter(0);
		initialState.setRightShoreMissionariesCounter(0);
		
		// select strategy
//		MCProblemSearchStrategy strategy = new MCProblemSearchStrategyLIFO();
		MCProblemSearchStrategy strategy = new MCProblemSearchStrategyFIFO();
		// solve problem
		MCProblemSolver solver = new MCProblemSolver(initialState, strategy);
		solver.solve();
	}
}
