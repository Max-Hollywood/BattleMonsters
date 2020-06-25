package core;

// TODO: the board that holds the data

import system.Logging;

public class GameBoard
{
	private int width;
	private int height;
	private Cell[][] cells;
	
	/**
	 * Instantiate an empty board.
	 *
	 * @param width  int width of the board
	 * @param height int height of the board
	 */
	public GameBoard(int width, int height)
	{
		
		this.width = width;
		this.height = height;
		this.cells = new Cell[this.height][this.width];
		
		for (int iy = 0; iy < getSize().y; iy++)
		{
			for (int ix = 0; ix < getSize().x; ix++)
			{
				this.cells[iy][ix] = new Cell();
			}
		}
	}
	
	public Vector2 getSize()
	{
		
		return new Vector2(width, height);
	}
	
	/**
	 * Debug test function - should never be directly called.
	 *
	 * @return
	 */
	public Cell[][] getCells()
	{
		
		return this.cells;
	}
	
	public void setCell(Vector2 position, MonsterPart shape)
	{
		
		this.cells[position.y][position.x].setContents(shape);
	}
	
	public void placeMonster(Vector2 position, Monster monster)
	{
		
		for (int iy = 0; iy < monster.height; iy++)
		{
			for (int ix = 0; ix < monster.width; ix++)
			{
				if (monster.parts[iy][ix] != null)
				{
					// TODO: add vector2 adding to vector2 class
					setCell(new Vector2(position.x + ix, position.y + iy), monster.parts[iy][ix]);
				}
			}
		}
	}
}