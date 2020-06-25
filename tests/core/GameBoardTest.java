package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.Logging;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest
{
	
	@BeforeEach
	void setUp()
	{
		
		System.out.println("Starting [ GameBoard ] test.");
	}
	
	@AfterEach
	void tearDown()
	{
		
		System.out.println("Ending [ GameBoard ] test.");
	}
	
	@Test
	void GameBoardTest()
	{
		Vector2 size = new Vector2(16, 5);
		GameBoard board = new GameBoard(size.x, size.y);
		assert board.getSize().x == 16;
		assert board.getSize().y == 5;
//		/* Monster Shape:
//			╓╖
//			╙╢
//		 */
//		board.setCell(new Vector2(3, 3), new MonsterPart("╢"));
//		board.setCell(new Vector2(2, 3), new MonsterPart("╙"));
//		board.setCell(new Vector2(2, 2), new MonsterPart("╓"));
//		board.setCell(new Vector2(3, 2), new MonsterPart("╖"));
		Monster monster = MonsterFactory.createMonster(MonsterType.SQUARE_TAIL);
		board.placeMonster(new Vector2(2, 3), monster);
		Logging.Slag(this, "Size", new Integer[]{16, 5});
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
}