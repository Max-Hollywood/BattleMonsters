package core;

import java.util.Random;

public class RandomVec2
{
	private static Random random = new Random();
	
	public RandomVec2()
	{
	}
	
	public static Vector2 getRandomVec(Vector2 bounds)
	{
		
		return new Vector2(RandomVec2.random.nextInt(bounds.x), RandomVec2.random.nextInt(bounds.y));
	}
}
