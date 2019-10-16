package objects;

public class Game
{

	//variables
	
	private Factory factory;
	private Character character;
	private String gameSelection;
	
	public Game(Factory f, Character c, String gs)
	{
		
		setFactory(f);
		setCharacter(c);
		setGameSelection(gs);
		
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
	
	public String getGameSelection()
	{
		return gameSelection;
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
	
	public void setGameSelection(String gameSelection)
	{
		this.gameSelection = gameSelection;
	}

}
