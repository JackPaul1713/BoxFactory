package game;

import java.util.ArrayList;

import windows.*;

public class Game
{

	//variables
	
	private Factory factory;
	private Character character;
	private String gameSelection;
	private int directoryLocation = 0;
	
	private ArrayList<Window> windows = new ArrayList<Window>();
	
	public Game(Factory f, Character c, String gs, ArrayList<Window> w)
	{
		
		setFactory(f);
		setCharacter(c);
		setGameSelection(gs);
		setWindows(w);
		
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
	
	public int getDirectoryLocation()
	{
		return directoryLocation;
	}
	
	public ArrayList<Window> getWindows()
	{
		return windows;
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
	
	public void setDirectoryLocation(int directoryLocation)
	{
		this.directoryLocation = directoryLocation;
	}
	
	public void setWindows(ArrayList<Window> windows)
	{
		this.windows = windows;
	}

}
