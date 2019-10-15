package objects;

public class Game
{

	//variables
	
	private Factory factory;
	private Character character;
	
	public Game(Factory f, Character c)
	{
		
		setFactory(f);
		setCharacter(c);
		
	}

	//getters
	
	public Factory getFactory()
	{
		return factory;
	}
	
	public Character getCharacter()
	{
		return character;
	}
	
	//setters

	public void setFactory(Factory factory)
	{
		this.factory = factory;
	}
	
	public void setCharacter(Character character)
	{
		this.character = character;
	}

}
