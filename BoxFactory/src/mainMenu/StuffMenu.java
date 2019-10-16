package mainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import objects.Game;
import objects.Character;
import objects.Factory;

public class StuffMenu
{

	public static Game stuffMenu(Game game)
	{
		
		//variables
		
		int stuffMenuSelection = 0;
		boolean stuffMenu = true;
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		
		Scanner intInput = new Scanner(System.in);
		
		//action
		
		while (stuffMenu == true)
		{
			
			System.out.println("[][][][][][][][][][][][] Stuff Menu [][][][][][][][][][][][]");
			System.out.println("");
			System.out.println("(1) Items");
			System.out.println("(2) Food");
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
			stuffMenuSelection = intInput.nextInt();
			
			if (stuffMenuSelection == 1)
			{
				
				game = ItemMenu.itemMenu(game);
				
			}
			else if (stuffMenuSelection == 2)
			{
				
				game = FoodMenu.foodMenu(game);
				
			}
			else if (stuffMenuSelection == 3)
			{
				
				stuffMenu = false;
				
			}
			
		}
		
		//return
		
		game.setFactory(factory);
		game.setCharacter(character);
		
		return(game);
		
	}
	
}
