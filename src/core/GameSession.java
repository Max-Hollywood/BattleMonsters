package core;

// TODO: the game logic controlling everything

import interfaces.UserInterface;
import players.Player;
import system.Logging;

public class GameSession
{
	private GameBoard board;
	private Player player1;
	private Player player2;
	private UserInterface ui;
	private boolean running = true;
	
	public GameSession(UserInterface ui)
	{
		
		this.ui = ui;
	}
	
	public void newGame(Vector2 size, Player player1, Player player2) throws Exception
	{
		
		this.board = new GameBoard(size.x, size.y);
		this.player1 = player1;
		this.player2 = player2;

		// TODO: this is testing the system
		placeMonster(new Vector2(3, 3), MonsterFactory.createMonster(MonsterType.SQUARE_TAIL));
	}
	
	public Vector2 getBoardSize()
	{
		
		return board.getSize();
	}
	
	public void renderGameSession()
	{
		
		this.ui.drawBoard(this.board);
		
	}
	
	public void placeMonster(Vector2 position, Monster monster)
	{
		
		board.placeMonster(position, monster);
	}
	
	public void runGameLoop()
	{
		
		while (running == true)
		{
		/*
			1. Tell the next player it's their turn
			2. Ask where to attack
			3. Get the input to attack
			4. Attack that position
			5. Return the results
			6. Set the board and score and damage that monster
			7. Select the next player
		 */
			
			PlayerAction action = ui.askPlayerTurnNextAction();
			
			if (action.getActionType() == PlayerAction.PlayerActionType.EXIT_GAME)
			{
				running = false;
			}
			else if (action.getActionType() == PlayerAction.PlayerActionType.ATTACK_LOCATION)
			{
				ui.askPlayerTurnAttackLocation();
			}
		}
		
		Logging.Slog(this, "Game loop has ended.");
	}
}