package mainMenu;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import objects.Game;
import objects.Item;
import objects.Upgrade;
import objects.Factory;
import objects.Food;
import objects.Character;

public class SaveGame
{

	public static void saveGame(Game game) throws IOException
	{
		
		//variables
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		String gameSelection = game.getGameSelection();
		
		ArrayList<Upgrade> upgrades = factory.getUpgrades(); 
		ArrayList<Item> items = character.getItems(); 
		ArrayList<Food> foods = character.getFoods();
		
		//fileWriter
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
		FileWriter fileWriter = null;
		
		if(gameSelection.substring(1, 2).equals("1"))
		{
				
			fileWriter = new FileWriter(savedGame1);
				
		}
		else if(gameSelection.substring(1, 2).equals("2"))
		{

			fileWriter = new FileWriter(savedGame2);
				
		}
		else if(gameSelection.substring(1, 2).equals("3"))
		{
				
			fileWriter = new FileWriter(savedGame3);
				
		}
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		//writeNames
		
		bufferedWriter.write(factory.getName()); bufferedWriter.newLine();
		bufferedWriter.write(character.getName()); bufferedWriter.newLine();
		
		bufferedWriter.newLine();
		
		//writeStats
		
		bufferedWriter.write(Integer.toString(factory.getNumbOfBoxes())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getMakeSpeed())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getOpeningSpeed())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getMobLikelyhood())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getMoneyLikelyhood())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getJunkLikelyhood())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getItemLikelyhood())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(factory.getNumbOfBoxesMade())); bufferedWriter.newLine();

		bufferedWriter.newLine();
		
		bufferedWriter.write(Integer.toString(character.getMoney())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(character.getHealth())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(character.getMaxHealth())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(character.getStrength())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(character.getDefence())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(character.getToughness())); bufferedWriter.newLine();
		bufferedWriter.write(Integer.toString(character.getSpeed())); bufferedWriter.newLine();

		bufferedWriter.newLine();
		
		//writeArrays
        
		for (int us = 0; us < upgrades.size(); us++)
		{

			bufferedWriter.write(Boolean.toString(upgrades.get(us).isOwned())); bufferedWriter.newLine();

		}

		bufferedWriter.newLine();

		for (int is = 0; is < items.size(); is++)
		{

			bufferedWriter.write(Boolean.toString(items.get(is).isOwned())); bufferedWriter.newLine();

		}

		bufferedWriter.newLine();

		for (int is = 0; is < items.size(); is++)
		{

			bufferedWriter.write(Boolean.toString(items.get(is).isEquiped())); bufferedWriter.newLine();

		}

		bufferedWriter.newLine();

		for (int fs = 0; fs < foods.size(); fs++)
		{

			bufferedWriter.write(Integer.toString(foods.get(fs).getQuanity())); bufferedWriter.newLine();
		}
		
		//closeFileWriter
		
		bufferedWriter.close();
		
	}

}
