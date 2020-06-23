package core;

import players.Player;

public class Monster
{
	// TODO: these shouldn't be so public
	private Player owner;
	public MonsterPart[][] parts;
	public int width;
	public int height;
	
	public Monster(int width, int height, MonsterPart[][] parts)
	{
		this.width = width;
		this.height = height;
		this.parts = parts;
	}
	
	
}
