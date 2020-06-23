package core;

// TODO: the game logic controlling everything

import interfaces.UserInterface;
import players.Player;

public class GameSession
{
	private GameBoard board;
	private Player player1;
	private Player player2;
	private UserInterface ui;
	
	public GameSession(UserInterface ui)
	{
		
		this.ui = ui;
	}
	
	public void newGame(Vector2 size, Player player1, Player player2) throws Exception
	{
		
		this.board = new GameBoard(size.x, size.y);
		this.player1 = player1;
		this.player2 = player2;
		
		placeMonster(new Vector2(3, 3), MonsterFactory.createMonster(MonsterType.SQUARE_TAIL));
		
		runGameLoop();
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
	
	}
}