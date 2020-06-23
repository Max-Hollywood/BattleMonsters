package core;

// TODO: the board that holds the data

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
		this.cells = new Cell[this.width][this.height];
		
		for (int iy = 0; iy < getSize().y; iy++)
		{
			for (int ix = 0; ix < getSize().x; ix++)
			{
				this.cells[ix][iy] = new Cell();
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
		
		this.cells[position.x][position.y].setContents(shape);
	}
	
	public void placeMonster(Vector2 position, Monster monster)
	{
		
		for (int iy = 0; iy < monster.height; iy++)
		{
			for (int ix = 0; ix < monster.width; ix++)
			{
				if (monster.parts[ix][iy] != null)
				{
					// TODO: add vector2 adding to vector2 class
					setCell(new Vector2(position.x + ix, position.y + iy), monster.parts[ix][iy]);
				}
			}
		}
	}
}