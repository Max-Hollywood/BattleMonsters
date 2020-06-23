package system;

import core.GameSession;
import core.Vector2;
import players.PlayerFactory;
import ui.Cli;

/**
 * The driver class that runs the game.
 */
public class Main
{
	public static GameSession session;
//	public PlayerFactory playerFactory;
	
	public Main()
	{

//		playerFactory = new PlayerFactory();
	}
	
	public static void main(String[] args)
	{
		// TODO: add [slog][slag]
		// TODO: add [gamesession]
		// TODO: add [gameboard]
		// TODO: add [mvc]
		// TODO: add [ai]
		// TODO: add [weapons]
		// TODO: add [highscores]
		
		System.out.println("application running...");
		/*
			Pseudocode for game steps:
			1. create game session (with ui)
			2. ask for the controllers (with ai)
			3. ask for the size of the game board
			4. create the game board
			5. start the game (random chosen starting player)
			--------------------------------------------------------------------
			• have options to set
		 */
		
		Main main = new Main();
		main.runGame();
	}
	
	public void runGame()
	{
		try
		{
			session = new GameSession(new Cli());
			
			if (session != null)
			{
				Vector2 size = new Vector2(40, 6);
				session.newGame(size, PlayerFactory.createAiEasy(size), PlayerFactory.createAiEasy(size));
				
				session.renderGameSession();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("application ending...");
	}
}

