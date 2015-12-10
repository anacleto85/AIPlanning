package org.coursera.aiplanning.problems.missionariesandcannibals.action;


/**
 * 
 * @author alessandroumbrico
 *
 */
public enum MCProblemActionType 
{
	ACTION_2C("The boat brings 2 Canniblas to the other shore"),
	
	ACTION_2M("The boat brings 2 Missionaries to the other shore"),
	
	ACTION_1C1M("The boat brings 1 Cannibal and 1 Missionary to the other shore"),
	
	ACTION_1C0M("The boat brings 1 Cannibal to the other shore"),
	
	ACTION_0C1M("The boat brings 1 Missionary to the other shore");
	
	private String description;
	
	private MCProblemActionType(String desc) {
		this.description = desc;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public static MCProblemAction getAction(MCProblemActionType type)
	{
		MCProblemAction action = null;
		if (type.equals(ACTION_2C)) {
			action = new MCProblemAction2C();
		}
		else if (type.equals(ACTION_2M)) {
			action = new MCProblemAction2M();
		}
		else if (type.equals(ACTION_1C1M)) {
			action = new MCProblemAction1C1M();
		}
		else if (type.equals(ACTION_1C0M)) {
			action = new MCProblemAction1C0M();
		}
		else {
			action = new MCProblemAction0C1M();
		}
		return action;
	}
}
