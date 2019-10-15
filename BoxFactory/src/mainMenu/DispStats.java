package mainMenu;

import java.io.IOException;
import java.util.Scanner;

import objects.Game;
import objects.Factory;
import objects.Character;

public class DispStats
{

	public static void dispStatsMenu(Game game) throws IOException
	{
		
		//variables
		
		int choice;
		boolean mainMenu = true;
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		
		Scanner intInput = new Scanner(System.in);
		
		//menu
		
		while (mainMenu = true)
		{

			System.out.println("[][][][][][][][][][][] Display Stats  [][][][][][][][][][][]");
			System.out.println("");
			System.out.println("(1) Factory Stats");
			System.out.println("(2) Character Stats");
			System.out.println("(3) Exit");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("Input: ");

			choice = intInput.nextInt();

			// dispStats

			if (choice == 1)
			{

				dispFactoryStats(factory);

			} else if (choice == 2)
			{

				dispCharacterStats(character);

			} else if (choice == 3)
			{

				mainMenu = false;
				MainMenu.mainMenu(game);

			}

		}
		
	}
	
	public static void dispFactoryStats(Factory factory)
	{
	
		//variables
		
		Scanner strInput = new Scanner(System.in);
		String enterToContinue;
		
		//displayFactoryStats
		
		System.out.println("[][][][][][][][][][][] Factory Stats  [][][][][][][][][][][]");
		System.out.println("");
		System.out.println("Name: " + factory.getName());
		System.out.println("");
		System.out.println("Boxes: " + factory.getNumbOfBoxes());
		System.out.println("Make box speed: " + factory.getMakeSpeed());
		System.out.println("Open box speed: " + factory.getOpeningSpeed());
		System.out.println("Mob likelyhood: " + factory.getMobLikelyhood());
		System.out.println("Money likelyhood: " + factory.getMoneyLikelyhood());
		System.out.println("Junk likelyhood: " + factory.getJunkLikelyhood());
		System.out.println("Item likelyhood: " + factory.getItemLikelyhood());
		System.out.println("Number of boxes made: " + factory.getNumbOfBoxesMade());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("Press enter to go back.");
		
		enterToContinue = strInput.nextLine();
		
	}
	
	public static void dispCharacterStats(Character character)
	{
	
		//variables
		
		Scanner strInput = new Scanner(System.in);
		String enterToContinue;
		
		//displayFactoryStats
		
		System.out.println("[][][][][][][][][][][] Character Stats  [][][][][][][][][][]");
		System.out.println("");
		System.out.println("Name: " + character.getName());
		System.out.println("");
		System.out.println("Money: " + character.getMoney());
		System.out.println("Health: " + character.getHealth());
		System.out.println("MaxHealth: " + character.getMaxHealth());
		System.out.println("Strength: " + character.getStrength());
		System.out.println("Defence: " + character.getDefence());
		System.out.println("Toughness: " + character.getToughness());
		System.out.println("Speed: " + character.getSpeed());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("Press enter to go back.");
		
		enterToContinue = strInput.nextLine();
		
	}
	
}
