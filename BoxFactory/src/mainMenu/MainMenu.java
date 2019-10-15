package mainMenu;

import java.io.IOException;
import java.util.Scanner;

import boxFactory.GameSelect;
import game.BoxFactoryGame;

import objects.Game;
import objects.Factory;
import objects.Character;

public class MainMenu
{

	public static void mainMenu(Game game) throws IOException
	{
		
		//variables
		
		int mainMenuSelection = 0;
		boolean mainMenu = true;
		String gameSelection = "";
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		
		Scanner intInput = new Scanner(System.in);
		
		//action
		
		while (mainMenu == true)
		{
			
			System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
			System.out.println("[][][][][][][][][] Box Factory Main Menu  [][][][][][][][][]");
			System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
			System.out.println("");
			System.out.println("Boxes: " + factory.getNumbOfBoxes() + " Health: " + character.getHealth() + " Money: " + character.getMoney());
			System.out.println("");
			System.out.println("(1) Stats");
			System.out.println("(2) Make Box");
			System.out.println("(3) Open Box");
			System.out.println("(4) My Items");
			System.out.println("(5) Upgrades");
			System.out.println("(6) Shop");
			System.out.println("(7) Save");
			System.out.println("(8) Exit");
			System.out.println("");
			System.out.println("");
			System.out.print("Input: ");
			mainMenuSelection = intInput.nextInt();
			
			//return
			
			if (mainMenuSelection == 1)
			{
				
				DispStats.dispStatsMenu(game);
				
			}
			else if (mainMenuSelection == 2)
			{
				
				//MakeBox.makebox();
				
			}
			else if (mainMenuSelection == 3)
			{
				
				
				//OpenBox.openBox();
				
			}
			else if (mainMenuSelection == 4)
			{
				
				//ItemMenu.itemMenu();
				
			}
			else if (mainMenuSelection == 5)
			{
				
				//UpgradeMenu.upgradeMenu();
				
			}
			else if (mainMenuSelection == 6)
			{
				
				//ShopMenu.shopMenu
				
			}
			else if (mainMenuSelection == 7)
			{
				
				SaveGame.saveGame();
				
			}
			else if (mainMenuSelection == 8)
			{
				
				mainMenu = false;
				gameSelection = GameSelect.gameSelect();
				BoxFactoryGame.boxFactoryGame(gameSelection);
				
			}
			
		}
		
	}
	
}
