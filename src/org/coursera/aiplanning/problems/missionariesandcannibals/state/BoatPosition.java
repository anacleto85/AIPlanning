package org.coursera.aiplanning.problems.missionariesandcannibals.state;

/**
 * 
 * @author alessandroumbrico
 *
 */
public enum BoatPosition 
{
	RIGTH_SHORE("The boat is on the right shore"),
	
	LEFT_SHORE("The boat is on the left shore");
	
	private String description;
	
	/**
	 * 
	 * @param desc
	 */
	private BoatPosition(String desc) {
		this.description = desc;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}
}
