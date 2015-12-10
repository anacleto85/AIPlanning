package org.coursera.aiplanning.problems.puzzle.search;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

import org.coursera.aiplanning.problems.puzzle.action.PuzzleAction;
import org.coursera.aiplanning.problems.puzzle.action.PuzzleActionFactory;
import org.coursera.aiplanning.problems.puzzle.action.PuzzleActionType;
import org.coursera.aiplanning.problems.puzzle.search.exception.EmptyFringeException;
import org.coursera.aiplanning.problems.puzzle.search.heuristic.PuzzleHeuristicType;
import org.coursera.aiplanning.problems.puzzle.search.strategy.PuzzleAStar;
import org.coursera.aiplanning.problems.puzzle.search.strategy.PuzzleSearchStrategy;
import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;


/**
 * 
 * @author alessandroumbrico
 *
 */
public class PuzzleSolver 
{
	private PuzzleSearchStrategy strategy;
	private PuzzleSearchNode rootNode;
	private int nodeCounter;
	
	/**
	 * 
	 * @param initialNode
	 * @param strategy
	 */
	public PuzzleSolver(PuzzleState initialState, PuzzleHeuristicType htype) 
	{
		this.strategy = new PuzzleAStar(htype);
		this.nodeCounter = 1;
		
		// make root node
		this.rootNode = new PuzzleSearchNode();
		this.rootNode.setCost(0);
		this.rootNode.setDepth(0);
		this.rootNode.setGeneratorAction(null);
		this.rootNode.setParent(null);
		this.rootNode.setId(0);
		this.rootNode.setState(initialState);
	}
	
	/**
	 * 
	 */
	public void solve() 
	{
		boolean run = true;
		int stepCounter = 0;
		PuzzleSearchNode solution = null;
		// add the root node to the fringe
		this.strategy.addToFringe(this.rootNode);
		
		// start search
		while (run) {
			stepCounter++;
			System.err.println("[PuzzleSolver] Step " + stepCounter);
			try {
				PuzzleSearchNode current = this.strategy.getNextToExpand();
				System.err.println("[PuzzleSolver] Expanding node\n" + current);
				// check node
				if (current.isSolution()) {
					// solution node
					solution = current;
					run = false;
				}
				else {
					// not solution node - go on with search
					for (PuzzleSearchNode node : this.expandNode(current)) {
						// add node to the fringe
						this.strategy.addToFringe(node);
					}
				}
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
			System.err.println("\n\n[PuzzleSolver] Solution found after " + stepCounter + "steps");
			
			Stack<PuzzleSearchNode> path = new Stack<>();
			PuzzleSearchNode pathNode = solution;
			while (pathNode != null) {
				// get parent node
				path.push(pathNode);
				pathNode = pathNode.getParent();
			}
			
			System.out.println("\n################## PROBLEM SOLUTION PATH ################");
			boolean end = false;
			while (!end) {
				try {
					PuzzleSearchNode spn = path.pop();
					System.out.println("\n" + spn + "\n");
				}
				catch (EmptyStackException ex) {
					// end printing solution path
					end = true;
				}
			}
		}
		else {
			System.err.println("\n\n[PuzzleSolver] No solution found after " + stepCounter + " steps");
		}
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	private List<PuzzleSearchNode> expandNode(PuzzleSearchNode node) 
	{
		List<PuzzleSearchNode> childs = new ArrayList<>();
		PuzzleActionFactory factory = PuzzleActionFactory.getInstance();
		// check applicable actions to the node status and generate child nodes
		for (PuzzleActionType actionType : PuzzleActionType.values()) 
		{
			// get action
			PuzzleAction action = factory.getAction(actionType);
			// check if the action is applicable to the current node status
			if (action.isApplicable(node)) 
			{
				// get next node
				PuzzleState nextState = action.applyTo(node.getState());
				// make child node
				PuzzleSearchNode child = new PuzzleSearchNode();
				child.setDepth(node.getDepth() + 1);
				child.setCost(node.getCost() + 1);
				child.setParent(node);
				child.setGeneratorAction(actionType);
				child.setState(nextState);
				child.setId(this.nodeCounter++);
				
				// add child to the list
				childs.add(child);
			}
		}
		
		return childs;
	}
}
