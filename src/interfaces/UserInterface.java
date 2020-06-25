package interfaces;

// TODO: the interface for implementing graphical components

import core.GameBoard;
import core.PlayerAction;

public interface UserInterface
{
	/**
	 * Draw the board in the display.
	 *
	 * @param board
	 */
	public void drawBoard(GameBoard board);
	
	/**
	 * What does the player want to do?  Select a different weapon?  Move a monster?  Attack a location?
	 */
	public PlayerAction askPlayerTurnNextAction();
	
	/**
	 * Ask where the player wants to attack, initiating the attack.
	 */
	public void askPlayerTurnAttackLocation();
}