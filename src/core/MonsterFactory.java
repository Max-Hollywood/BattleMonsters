package core;

/**
 * Instantiate Monsters from templates, or procedurally generate random shaped monsters.  Null references fill the voids.
 *
 * ─ │
 * ┌ ┐ └ ┘ ├ ┤ ┬ ┴ ┼
 * ═ ║
 * ╒ ╓ ╔ ╕ ╖ ╗
 * ╘ ╙ ╚ ╛ ╜ ╝
 * ╞ ╟ ╠ ╡ ╢ ╣
 * ╤ ╥ ╦ ╧ ╨ ╩
 * ╪ ╫ ╬
 * ▀ ▄ █ ▌ ▐
 * ░ ▒ ▓
 */
public class MonsterFactory
{
	public static Monster createMonster(MonsterType type)
	{
		
		Monster monster = null;
		/* SQUARE_TAIL:
			╓╖
			╙╢
		 */
		if (type == MonsterType.SQUARE_TAIL)
		{
			monster = new Monster(2, 2, new MonsterPart[][]{
					{new MonsterPart("╓"), new MonsterPart("╖")},
					{new MonsterPart("╙"), new MonsterPart("╢")}
			});
		}
		
		return monster;
	}
}
