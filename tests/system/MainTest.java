package system;

import core.GameSession;
import core.Vector2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.Player;
import players.PlayerFactory;
import ui.Cli;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{
	
	@BeforeEach
	void setUp()
	{
		System.out.println("Starting [ Main ] test.");
	}
	
	@AfterEach
	void tearDown()
	{
		System.out.println("Ending [ Main ] test.");
	}
	
	@Test
	void main()
	{
		// TODO: player tests
		
		// TODO: board tests
		
		// TODO: monster tests
		
		// TODO: brains tests
		
		// TODO: weapon tests
		
		// TODO: ui tests
		
		// TODO: session tests
		
		GameSession session = new GameSession(new Cli());
		Vector2 size = new Vector2(30, 20);
		Player p1 = PlayerFactory.createAiEasy(size);
		Player p2 = PlayerFactory.createAiEasy(size);
		try
		{
			session.newGame(size, p1, p2);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		Main main = new Main();
		main.runGame();
	}
}