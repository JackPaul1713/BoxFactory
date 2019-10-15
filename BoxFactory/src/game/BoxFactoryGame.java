package game;

import java.io.IOException;
import java.util.ArrayList;

import mainMenu.MainMenu;
import objects.Game;
import objects.Factory;
import objects.Character;
import objects.Upgrade;
import objects.Item;
import objects.Food;
import objects.Junk;

public class BoxFactoryGame
{

	public static void boxFactoryGame(String gameSelection) throws IOException
	{
		
		//variables
		
		Game game;
		Factory factory;
		Character character;
		
		ArrayList<Upgrade> upgrades = new ArrayList<Upgrade>();
		ArrayList<Item> items = new ArrayList<Item>();
		ArrayList<Food> foods = new ArrayList<Food>();
		ArrayList<Junk> junk = new ArrayList<Junk>();
		
		//loadData
		
		upgrades = InitializeObjects.initializeUpgrades();
		items = InitializeObjects.initializeItems();
		foods = InitializeObjects.initializeFood();
		junk = InitializeObjects.initializeJunk();
		
		game = LoadGame.loadGame(gameSelection, upgrades, items, foods);
		factory = game.getFactory();
		character = game.getCharacter();
		
		//game
		
		MainMenu.mainMenu();
		
	}
	
}
