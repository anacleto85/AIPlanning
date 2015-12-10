package org.coursera.aiplanning.problems.puzzle.search;

import org.coursera.aiplanning.problems.puzzle.action.PuzzleActionType;
import org.coursera.aiplanning.problems.puzzle.state.PuzzleState;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class PuzzleSearchNode implements Comparable<PuzzleSearchNode> 
{
	private int id;
	private int depth;
	private int cost;
	private double value;
	private PuzzleState state;
	private PuzzleSearchNode parent;
	private PuzzleActionType generatorAction;
	
	
	public int getId() {
		return id;
	}

	public int getDepth() {
		return depth;
	}

	public int getCost() {
		return cost;
	}

	public double getValue() {
		return value;
	}

	public PuzzleState getState() {
		return state;
	}

	public PuzzleSearchNode getParent() {
		return parent;
	}


	public PuzzleActionType getGeneratorAction() {
		return generatorAction;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setState(PuzzleState state) {
		this.state = state;
	}

	public void setParent(PuzzleSearchNode parent) {
		this.parent = parent;
	}

	public void setGeneratorAction(PuzzleActionType generatorAction) {
		this.generatorAction = generatorAction;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSolution() 
	{
		boolean goalTest = true;
		int expectedValue = 0;
		for (int i = 0; i < this.state.getMatrixSize(); i++) {
			for (int j = 0; j < this.state.getMatrixSize(); j++) {
				if (this.state.getElementAt(i, j) != expectedValue) {
					goalTest = false;
					break;
				}
				// next expected value
				expectedValue++;
			}
		}
		return goalTest;
	}

	/**
	 * 
	 */
	@Override
	public int compareTo(PuzzleSearchNode o) {
		int result;
		if (this.value < o.getValue()) {
			result = -1;
		}
		else if (this.value > o.getValue()){
			result = 1;
		}
		else {
			result = 0;
		}
		return result;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "[PuzzleSearchNode: id="+this.id+", cost="+this.cost+", value="+this.value+", depth="+this.depth+"]\n- generator action: "+this.generatorAction+"\n"+this.state;
	}
}
