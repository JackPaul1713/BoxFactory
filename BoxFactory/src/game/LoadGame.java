package game;

import java.util.ArrayList;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

import objects.Game;
import objects.Factory;
import objects.Character;

import objects.Upgrade;
import objects.Item;
import objects.Food;

public class LoadGame
{
	
	public static Game loadGame(String gameSelection, ArrayList<Upgrade> upgrades, ArrayList<Item> items, ArrayList<Food> foods) throws IOException
	{
		
		//variables
		
		Game game;
		Factory factory;
		Character character;
		
		String factoryName = "";
		String characterName = "";
		
		int numbOfBoxes = 0;
		int makeSpeed = 20;
		int openSpeed = 20;
		int mobLikelyhood = 10;
		int moneyLikelyhood = 100;
		int junkLikelyhood = 10;
		int itemLikelyhood = 10;
		int totalLikelyhood = 130;
		int numbOfBoxesMade = 1;
		
		int money = 0;
		int health = 100;
		int maxHealth = 100;
		int strength = 10;
		int defence = 10;
		int toughness = 10;
		int speed = 10;
		
		//fileReader
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
		FileReader fileReader = null;
		
		if(gameSelection.substring(0, 1).equals("l"))
		{
			
			if(gameSelection.substring(1, 2).equals("1"))
			{
				
				fileReader = new FileReader(savedGame1);
				
			}
			else if(gameSelection.substring(1, 2).equals("2"))
			{

				fileReader = new FileReader(savedGame2);
				
			}
			else if(gameSelection.substring(1, 2).equals("3"))
			{
				
				fileReader = new FileReader(savedGame3);
				
			}
			
		}
		else if (gameSelection.substring(0, 1).equals("n"))
		{
			
			fileReader = new FileReader(defaultSave);
			
		}
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//getSubObjectVars
		
		if (gameSelection.substring(0,1).equals("n"))
		{
			
			factoryName = GetNames.getFactoryName(); bufferedReader.readLine();
			characterName = GetNames.getCharacterName(); bufferedReader.readLine();
			
		}
		else
		{
			
			factoryName = bufferedReader.readLine();
			characterName = bufferedReader.readLine();
			
		}

		bufferedReader.readLine();

		numbOfBoxes = Integer.parseInt(bufferedReader.readLine());
		makeSpeed = Integer.parseInt(bufferedReader.readLine());
		openSpeed = Integer.parseInt(bufferedReader.readLine());
		mobLikelyhood = Integer.parseInt(bufferedReader.readLine());
		moneyLikelyhood = Integer.parseInt(bufferedReader.readLine());
		junkLikelyhood = Integer.parseInt(bufferedReader.readLine());
		itemLikelyhood = Integer.parseInt(bufferedReader.readLine());
		numbOfBoxesMade = Integer.parseInt(bufferedReader.readLine());

		bufferedReader.readLine();

		money = Integer.parseInt(bufferedReader.readLine());
		health = Integer.parseInt(bufferedReader.readLine());
		maxHealth = Integer.parseInt(bufferedReader.readLine());
		strength = Integer.parseInt(bufferedReader.readLine());
		defence = Integer.parseInt(bufferedReader.readLine());
		toughness = Integer.parseInt(bufferedReader.readLine());
		speed = Integer.parseInt(bufferedReader.readLine());

		bufferedReader.readLine();
		
		//setArrayObjects

		for (int us = 0; us < upgrades.size(); us++)
		{

			upgrades.get(us).loadOwned(Boolean.parseBoolean(bufferedReader.readLine()));
			// upgrades.set(us, upgrades.get(us)); //Unnessisary?

		}

		bufferedReader.readLine();

		for (int is = 0; is < items.size(); is++)
		{

			items.get(is).setOwned(Boolean.parseBoolean(bufferedReader.readLine()));
			// items.set(is, items.get(is)); //Unnessisary?

		}

		bufferedReader.readLine();

		for (int is = 0; is < items.size(); is++)
		{

			items.get(is).loadEquiped(Boolean.parseBoolean(bufferedReader.readLine()));
			// items.set(is, items.get(is)); //Unnessisary?

		}

		bufferedReader.readLine();

		for (int fs = 0; fs < foods.size(); fs++)
		{

			foods.get(fs).setQuanity(Integer.parseInt(bufferedReader.readLine()));
			// foods.set(fs, foods.get(fs)); //Unnessisary?

		}

		//fillSubObjects
		
		factory = new Factory(factoryName, numbOfBoxes, makeSpeed, openSpeed, mobLikelyhood, moneyLikelyhood, junkLikelyhood, itemLikelyhood, totalLikelyhood, numbOfBoxesMade, upgrades);
		character = new Character(characterName, money, health, maxHealth, strength, defence, toughness, speed, items, foods);
		
		//fillObject
		
		game = new Game(factory, character);
		
		//closeFileReader
		
		bufferedReader.close();
		
		//return
		
		return(game);
		
	}

}
