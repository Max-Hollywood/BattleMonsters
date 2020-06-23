package core;

/**
 * Represents a cell on the game board array.  Can be EMPTY (points to null) or TAKEN (points to a monster).
 */
public class Cell
{
	private CellContents contents;
	private MonsterPart monsterPart;
	
	public Cell()
	{
		
		this.contents = CellContents.EMPTY;
		this.monsterPart = null;
	}
	
	/**
	 * Set the contents of the cell.
	 *
	 * @param monsterPart a part of a monster
	 */
	public void setContents(MonsterPart monsterPart)
	{
		
		if (monsterPart == null)
		{
			removeContents();
		}
		else
		{
			this.contents = CellContents.TAKEN;
			this.monsterPart = monsterPart;
		}
	}
	
	/**
	 * Clears the cell.
	 */
	public void removeContents()
	{
		
		this.contents = CellContents.EMPTY;
		this.monsterPart = null;
	}
	
	public CellContents getContents()
	{
		
		return this.contents;
	}
	
	public MonsterPart getMonsterPart()
	{
		
		return this.monsterPart;
	}
}
