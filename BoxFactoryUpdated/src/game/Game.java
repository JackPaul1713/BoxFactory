package game;

import java.util.ArrayList;

import windows.*;

public class Game
{

	//variables
	
	private Factory factory;
	private Character character;
	private String gameSelection;
	private String directoryLocation = "";
	
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
	
	public String getDirectoryLocation()
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
	
	public void setDirectoryLocation(String locationChange)
	{
		if (locationChange.equals("cls"))
		{
			this.directoryLocation = "1";
		}
		else if (locationChange.equals("e"))
		{
			this.directoryLocation = this.directoryLocation.substring(0, this.directoryLocation.length()-1);
		} 
		else
		{
			this.directoryLocation = this.directoryLocation + locationChange;
		}
	}
	
	public void setWindows(ArrayList<Window> windows)
	{
		this.windows = windows;
	}

}
