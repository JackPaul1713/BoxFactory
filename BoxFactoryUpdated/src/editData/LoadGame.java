package editData;

import java.io.IOException;
import java.util.ArrayList;

import game.*;
import editData.*;
import windows.*;
import things.*;
import mobs.*;

public class LoadGame
{

	public static Game loadGame(String gameSelection) throws IOException
	{
		
		Game game;
		
		ArrayList<Window> windows = new ArrayList<Window>();
		ArrayList<Upgrade> upgrades = new ArrayList<Upgrade>();
		ArrayList<Item> items = new ArrayList<Item>();
		ArrayList<Food> foods = new ArrayList<Food>();
		ArrayList<Junk> junk = new ArrayList<Junk>();
		
		windows = LoadData.initializeWindows();
		upgrades = LoadData.initializeUpgrades();
		items = LoadData.initializeItems();
		foods = LoadData.initializeFood();
		junk = LoadData.initializeJunk();
		
		game = LoadSave.loadSave(gameSelection, windows, upgrades, items, foods, junk);
		
		game.setDirectoryLocation("1");
		
		return(game);
		
	}
	
}
