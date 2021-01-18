package core;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import system.Logging;

//import static org.junit.jupiter.api.Assertions.*;

class RandomVec2Test
{
	
//	@BeforeEach
	void setUp()
	{
		
		System.out.println("Starting [ RandomVec2 ] test.");
	}
	
//	@AfterEach
	void tearDown()
	{
		
		System.out.println("Ending [ RandomVec2 ] test.");
	}
	
//	@Test
	void main()
	{
		Logging.Slog(this, "Random vector 2d (1,1)", RandomVec2.getRandomVec(new Vector2(1, 1)));
		Logging.Slog(this, "Random vector 2d (1,1)", RandomVec2.getRandomVec(new Vector2(1, 1)));
		Logging.Slog(this, "Random vector 2d (10,10)", RandomVec2.getRandomVec(new Vector2(10, 10)));
		Logging.Slog(this, "Random vector 2d (10,10)", RandomVec2.getRandomVec(new Vector2(10, 10)));
		Logging.Slog(this, "Random vector 2d (100,100)", RandomVec2.getRandomVec(new Vector2(100, 100)));
		Logging.Slog(this, "Random vector 2d (100,100)", RandomVec2.getRandomVec(new Vector2(100, 100)));
	}
}