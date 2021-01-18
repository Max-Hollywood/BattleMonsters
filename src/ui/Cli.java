package ui;

import core.CellContents;
import core.GameBoard;
import core.PlayerAction;
import interfaces.UserInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: command line interface

public class Cli implements UserInterface
{
	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public Cli()
	{
	
	}
	
	@Override
	public void drawBoard(GameBoard board)
	{
		
		System.out.print("  ");
		for (int ix = 0; ix < board.getSize().x; ix++)
		{
			// TODO: make this not hard coded, it should be variable
			System.out.print(String.format("%3d", ix));
		}
		
		System.out.println();
		
		for (int iy = 0; iy < board.getSize().y; iy++)
		{
			// TODO: make this not hard coded, it should be variable
			System.out.print(String.format("%2d", iy));
			
			for (int ix = 0; ix < board.getSize().x; ix++)
			{
				if (board.getCells()[iy][ix].getContents() == CellContents.EMPTY)
				{
					System.out.print(String.format("%3s", "."));
				}
				else if (board.getCells()[iy][ix].getContents() == CellContents.TAKEN)
				{
					System.out.print(String.format("%3s", board.getCells()[iy][ix].getMonsterPart().getShape()));
				}
			}
			System.out.println();
		}
	}
	
	@Override
	public PlayerAction askPlayerTurnNextAction()
	{
		// TODO: ask what the player wants to do
		
		PlayerAction action = new PlayerAction(PlayerAction.PlayerActionType.WAITING);
		System.out.println(" > What do you want to do?");
		System.out.println("   (M)ove monster\n   (A)ttack a location\n   (S)elect weapon\n   (R)eturn to the main menu\n   (Q)uit the game");
		System.out.println(" > You have selected (Q)uit the game.");
		try
		{
			if (br.readLine().equals("a"))
			{
				action = new PlayerAction(PlayerAction.PlayerActionType.ATTACK_LOCATION);
			}
			else if (br.readLine().equals("q"))
			{
				action = new PlayerAction(PlayerAction.PlayerActionType.EXIT_GAME);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return action;
	}
	
	@Override
	public void askPlayerTurnAttackLocation()
	{
		System.out.println("attack...");
	}
}