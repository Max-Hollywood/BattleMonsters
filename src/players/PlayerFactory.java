package players;

import controllers.*;
import core.Vector2;

// TODO: factory to create players

public class PlayerFactory
{
	public static Player createAiEasy(Vector2 boardSize)
	{
		return new Player(new BrainsDumbfire(boardSize));
	}
}