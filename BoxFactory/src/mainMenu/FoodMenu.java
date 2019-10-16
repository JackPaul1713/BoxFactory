package mainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import objects.Game;
import objects.Factory;
import objects.Character;
import objects.Food;

public class FoodMenu
{

	public static Game foodMenu(Game game)
	{
		
		//variables
		
				int foodMenuSelection = 0;
				boolean foodMenu = true;
				
				Factory factory = game.getFactory();
				Character character = game.getCharacter();
				ArrayList<Food> foods = character.getFoods();
				
				int possibleFoodsNumb = 10;
				int foodsNumb = foods.size();
				
				Scanner intInput = new Scanner(System.in);
				
				//action
				
				while (foodMenu == true)
				{
					
					System.out.println("[][][][][][][][][][][][] Food Menu  [][][][][][][][][][][][]");
					System.out.println("");
					System.out.println("Select a food to use it.");
					System.out.println("");
					
					for (int f = 0; f < foodsNumb; f++)
					{
						
						System.out.println("(" + (f + 1) + ") " + foods.get(f).getName() + "(s): " + foods.get(f).getQuanity());
						
					}
					
					System.out.println("(" + (foodsNumb + 1) + ") Exit");
					
					for (int b = 0; b < possibleFoodsNumb - foodsNumb; b++)
					{
						
						System.out.println("");
						
					}
					
					System.out.println("");
					System.out.print("Input: ");
					foodMenuSelection = intInput.nextInt();
					
					if (foodMenuSelection == 1)
					{
						
						
						
					}
					else if (foodMenuSelection == 2)
					{
						
						
						
					}
					else if (foodMenuSelection == 3)
					{
						
						
						
					}
					else if (foodMenuSelection == 4)
					{
						
						
						
					}
					else if (foodMenuSelection == 5)
					{
						
						foodMenu = false;
						
					}
					
				}
				
				//return
				
				game.setFactory(factory);
				game.setCharacter(character);
				
				return(game);
		
	}
	
}
