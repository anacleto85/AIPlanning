package org.coursera.aiplanning.problems.puzzle.action;

/**
 * 
 * @author alessandroumbrico
 *
 */
public class PuzzleActionFactory 
{
	private static PuzzleActionFactory INSTANCE = null;
	
	private PuzzleActionFactory() {}
	
	/**
	 * 
	 * @return
	 */
	public static PuzzleActionFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PuzzleActionFactory();
		}
		return INSTANCE;
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public PuzzleAction getAction(PuzzleActionType type) 
	{
		PuzzleAction action;
		if (type.equals(PuzzleActionType.MOVE_DOWN)) {
			action = new PuzzleMoveDowAction();
		}
		else if (type.equals(PuzzleActionType.MOVE_UP)) {
			action = new PuzzleMoveUpAction();
		}
		else if (type.equals(PuzzleActionType.MOVE_LEFT)) {
			action = new PuzzleMoveLeftAction();
		}
		else {
			action = new PuzzleMoveRightAction();
		}
		return action;
	}
}
