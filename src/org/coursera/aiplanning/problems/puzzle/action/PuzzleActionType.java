package org.coursera.aiplanning.problems.puzzle.action;

/**
 * 
 * @author alessandroumbrico
 *
 */
public enum PuzzleActionType
{
	/**
	 * 
	 */
	MOVE_UP("Moving Empty tile Up"),
	
	/**
	 * 
	 */
	MOVE_LEFT("Moving Empty tile Lef"),
	
	/**
	 * 
	 */
	MOVE_DOWN("Moving Empty tile Down"),
	
	/**
	 * 
	 */
	MOVE_RIGHT("Moving Empty tile Right");
	
	private String description;
	
	/**
	 * 
	 * @param desc
	 */
	private PuzzleActionType(String desc) {
		this.description = desc;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "[PuzzleActionType: action="+this.name()+" - "+this.description+"]";
	}
}
