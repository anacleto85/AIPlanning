package org.coursera.aiplanning.problems.missionariesandcannibals.state;

import org.coursera.aiplanning.problems.missionariesandcannibals.action.MCProblemActionType;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class MCProblemState 
{
	private int leftShoreMissionariesCounter;
	private int leftShoreCannibalsCounter;
	private int rightShoreMissionariesCounter;
	private int rightShoreCannibalsCounter;
	private BoatPosition boatPosition;

	public int getLeftShoreMissionariesCounter() {
		return leftShoreMissionariesCounter;
	}
	
	public void setLeftShoreMissionariesCounter(int leftShoreMissionariesCounter) {
		this.leftShoreMissionariesCounter = leftShoreMissionariesCounter;
	}
	
	public int getLeftShoreCannibalsCounter() {
		return leftShoreCannibalsCounter;
	}
	
	public void setLeftShoreCannibalsCounter(int leftShoreCannibalsCounter) {
		this.leftShoreCannibalsCounter = leftShoreCannibalsCounter;
	}
	
	public int getRightShoreMissionariesCounter() {
		return rightShoreMissionariesCounter;
	}
	
	public void setRightShoreMissionariesCounter(int rightShoreMissionariesCounter) {
		this.rightShoreMissionariesCounter = rightShoreMissionariesCounter;
	}
	
	public int getRightShoreCannibalsCounter() {
		return rightShoreCannibalsCounter;
	}
	
	public void setRightShoreCannibalsCounter(int rightShoreCannibalsCounter) {
		this.rightShoreCannibalsCounter = rightShoreCannibalsCounter;
	}
	
	public BoatPosition getBoatPosition() {
		return boatPosition;
	}
	
	public void setBoatPosition(BoatPosition boatPosition) {
		this.boatPosition = boatPosition;
	}
	
	/**
	 * 
	 * @param actionType
	 * @return
	 */
	public boolean isApplicable(MCProblemActionType actionType) 
	{
		boolean applicable = false;
		// check action type
		if (actionType.equals(MCProblemActionType.ACTION_2C)) {
			// action 2C
			// check boat position
			if (this.boatPosition.equals(BoatPosition.LEFT_SHORE)) {
				// boat on the left shore
				applicable = (this.leftShoreCannibalsCounter >= 2);
			}
			else {
				// boat on the right shore
				applicable = (this.rightShoreCannibalsCounter >= 2);
			}
		}
		else if (actionType.equals(MCProblemActionType.ACTION_2M)) {
			// action 2M
			// check boat position
			if (this.boatPosition.equals(BoatPosition.LEFT_SHORE)) {
				// boat on the left shore
				applicable = (this.leftShoreMissionariesCounter >= 2);
			}
			else {
				// boat on the right shore
				applicable = (this.rightShoreMissionariesCounter >= 2);
			}
		}
		else if (actionType.equals(MCProblemActionType.ACTION_1C1M)) {
			// action 1C1M
			// check boat position
			if (this.boatPosition.equals(BoatPosition.LEFT_SHORE)) {
				// boat on the left shore
				applicable = (this.leftShoreCannibalsCounter >= 1 && this.leftShoreMissionariesCounter >= 1);
			}
			else {
				// boat on the right shore
				applicable = (this.rightShoreCannibalsCounter >= 1 && this.rightShoreMissionariesCounter >= 1);
			}
		}
		else if (actionType.equals(MCProblemActionType.ACTION_1C0M)) {
			// action 1C0M
			// check boat position
			if (this.boatPosition.equals(BoatPosition.LEFT_SHORE)) {
				// boat on the left shore
				applicable = (this.leftShoreCannibalsCounter >= 1);
			}
			else {
				// boat on the right shore
				applicable = (this.rightShoreCannibalsCounter >= 1);
			}
		}
		else {
			// action 0C1M
			// check boat position
			if (this.boatPosition.equals(BoatPosition.LEFT_SHORE)) {
				// boat on the left shore
				applicable = (this.leftShoreMissionariesCounter >= 1);
			}
			else {
				// boat on the right shore
				applicable = (this.rightShoreMissionariesCounter >= 1);
			}
		}
 		return applicable;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isInconsistent() {
		return (	(this.leftShoreMissionariesCounter > 0 && this.leftShoreCannibalsCounter > this.leftShoreMissionariesCounter) ||
					(this.rightShoreMissionariesCounter > 0 && this.rightShoreCannibalsCounter > this.rightShoreMissionariesCounter));
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSolution() {
		return (	this.leftShoreCannibalsCounter == 0 && 
					this.leftShoreMissionariesCounter == 0 &&
					this.rightShoreCannibalsCounter == this.rightShoreMissionariesCounter);
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String str = "[MCProblemState] problem status:";
		str += "\n\t- boat position= "+this.boatPosition.getDescription();
		str += "\n\t- left-shore= "+this.leftShoreCannibalsCounter+" cannibals, "+this.leftShoreMissionariesCounter+" missionaries";
		str += "\n\t- right-shore= "+this.rightShoreCannibalsCounter+" cannibals, "+this.rightShoreMissionariesCounter+" missionaries";
		return str;
	}
}
