package core;

/**
 * A Command pattern-like object, where we can assign commands to the object and pass it around.
 */
public class PlayerAction
{
	public enum PlayerActionType
	{
		WAITING,
		MOVE_MONSTER,
		SELECT_WEAPON,
		ATTACK_LOCATION,
		SKIP_TURN,
		RETURN_TO_MAIN_MENU,
		EXIT_GAME
	}
	
	private PlayerActionType type;
	
	public PlayerAction(PlayerActionType type)
	{
		
		this.type = type;
	}
	
	public PlayerActionType getActionType()
	{
		
		return type;
	}
}
