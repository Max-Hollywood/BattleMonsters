package core;

/**
 * A simple vector class for holding `int`.
 */
public class Vector2
{
	public int x;
	public int y;
	
	public Vector2(int x, int y)
	{
		
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		
		return this.x + "," + this.y;
	}
}
