package ui;

import core.CellContents;
import core.GameBoard;
import interfaces.UserInterface;

// TODO: command line interface

public class Cli implements UserInterface
{
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
	public void printMessage()
	{
	
	}
}