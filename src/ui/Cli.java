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
		
		for (int iy = 0; iy < board.getSize().y; iy++)
		{
			for (int ix = 0; ix < board.getSize().x; ix++)
			{
				if (board.getCells()[ix][iy].getContents() == CellContents.EMPTY)
				{
					System.out.print(".");
				}
				else if (board.getCells()[ix][iy].getContents() == CellContents.TAKEN)
				{
					System.out.print(board.getCells()[ix][iy].getMonsterPart().getShape());
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