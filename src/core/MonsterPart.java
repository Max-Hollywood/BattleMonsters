package core;

public class MonsterPart
{
	private Monster owner;
	private String shape;
	
	protected MonsterPart(String shape)
	{
		this.shape = shape;
	}
	
	public String getShape()
	{
		return this.shape;
	}
}
