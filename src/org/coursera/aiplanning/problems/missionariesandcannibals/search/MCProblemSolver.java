package org.coursera.aiplanning.problems.missionariesandcannibals.search;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

import org.coursera.aiplanning.problems.missionariesandcannibals.action.MCProblemAction;
import org.coursera.aiplanning.problems.missionariesandcannibals.action.MCProblemActionType;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.exception.InconsistentNodeException;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.MCProblemSearchStrategy;
import org.coursera.aiplanning.problems.missionariesandcannibals.search.strategy.exception.EmptyFringeException;
import org.coursera.aiplanning.problems.missionariesandcannibals.state.MCProblemState;


/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemSolver 
{
	private MCProblemSearchStrategy strategy;
	private MCProblemSearchNode rootNode;
	private final int MAX_DEPTH_LIMIT = 11;
	private int nodeCounter;
	
	/**
	 * 
	 * @param initialNode
	 * @param strategy
	 */
	public MCProblemSolver(MCProblemState initialState, MCProblemSearchStrategy strategy) {
		this.strategy = strategy;
		this.nodeCounter = 0;
		
		// make root node
		this.rootNode = new MCProblemSearchNode();
		this.rootNode.setAction(null);
		this.rootNode.setParent(null);
		this.rootNode.setDepth(0);
		this.rootNode.setCost(0);
		this.rootNode.setId(this.nodeCounter);
		this.rootNode.setState(initialState);
	}
	
	/**
	 * 
	 */
	public void solve() 
	{
		boolean run = true;
		int stepCounter = 0;
		MCProblemSearchNode solution = null;
		// add the root node to the fringe
		this.strategy.addToFringe(this.rootNode);
		
		// start search
		while (run) {
			stepCounter++;
			System.err.println("[MCProblemSolver] Step " + stepCounter);
			try {
				MCProblemSearchNode current = this.strategy.getNextNode();
				System.err.println("[MCProblemSolver] Expanding node\n" + current);
				// check node
				if (this.goalTestFunctino(current)) {
					// solution node
					solution = current;
					run = false;
				}
				else {
					// check depth limit
					if (current.getDepth() <= this.MAX_DEPTH_LIMIT) { 
						// not solution node - go on with search
						for (MCProblemSearchNode node : this.expandNode(current)) {
							// add node to the fringe
							this.strategy.addToFringe(node);
						}
					}
				}
			}
			catch (InconsistentNodeException ex) {
				System.err.println(ex.getMessage());
				// go on with search
			}
			catch (EmptyFringeException ex) {
				System.err.println(ex.getMessage());
				// no solution found
				solution = null;
				// stop search
				run = false;
			}
		}
		
		if (solution != null) {
			System.err.println("\n\n[MCProblemSolver] Solution found after " + stepCounter + "steps");
			
			Stack<MCProblemSearchNode> path = new Stack<>();
			MCProblemSearchNode pathNode = solution;
			while (pathNode != null) {
				// get parent node
				path.push(pathNode);
				pathNode = pathNode.getParent();
			}
			
			System.out.println("\n################## PROBLEM SOLUTION PATH ################");
			boolean end = false;
			while (!end) {
				try {
					MCProblemSearchNode spn = path.pop();
					System.out.println("\n" + spn + "\n");
				}
				catch (EmptyStackException ex) {
					// end printing solution path
					end = true;
				}
			}
		}
		else {
			System.err.println("\n\n[MCProblemSolver] No solution found after " + stepCounter + " steps");
		}
	}
	
	/**
	 * @param node
	 * @return
	 * @throws InconsistentNodeException
	 */
	private boolean goalTestFunctino(MCProblemSearchNode node) throws InconsistentNodeException {
		if (node.getState().isInconsistent()) {
			throw new InconsistentNodeException("[MCProblemSolver] Inconsistent node status");
		}
		return node.getState().isSolution();
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	private List<MCProblemSearchNode> expandNode(MCProblemSearchNode node) 
	{
		List<MCProblemSearchNode> childs = new ArrayList<>();
		// check applicable actions to the node status and generate child nodes
		for (MCProblemActionType actionType : MCProblemActionType.values()) {
			// check if the action is applicable to the current node status
			if (node.getState().isApplicable(actionType)) {
				// get action
				MCProblemAction action = MCProblemActionType.getAction(actionType);
				// get next node
				MCProblemState next = action.applyTo(node.getState());
				// make child node
				MCProblemSearchNode child = new MCProblemSearchNode();
				child.setDepth(node.getDepth() + 1);
				child.setCost(node.getCost() + 1);
				child.setParent(node);
				child.setAction(action);
				child.setState(next);
				child.setId(this.nodeCounter++);
				
				// add child to the list
				childs.add(child);
			}
		}
		
		return childs;
	}
}
