package controllers;

import core.RandomVec2;
import interfaces.Brains;
import core.Vector2;

// TODO: dumbfire intelligence

/**
 * The easiest ai.  Fires randomly at positions on the board it hasn't already fired at.
 */
public class BrainsDumbfire implements Brains
{
	// The next place the ai should fire at
	private Vector2 attackPosition;
	// The size of the board (should not have access to the board itself)
	private Vector2 boardSize;
	
	public BrainsDumbfire(Vector2 boardSize)
	{
		this.attackPosition = new Vector2(0, 0);
		this.boardSize = boardSize;
	}
	
	@Override
	public void calculateNextAttack()
	{
		
		attackPosition = RandomVec2.getRandomVec(boardSize);
	}
	
	@Override
	public void attack()
	{
	
	}
}