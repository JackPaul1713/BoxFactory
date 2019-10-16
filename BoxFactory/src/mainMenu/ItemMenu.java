package mainMenu;

import java.util.Scanner;

import objects.Game;

public class ItemMenu
{

	public static Game itemMenu(Game game)
	{
		
		//variables
		
		int itemMenuSelection = 0;
		boolean itemMenu = true;
		
		Scanner intInput = new Scanner(System.in);
		
		//action
		
		while (itemMenu == true)
		{
			
			System.out.println("[][][][][][][][][][][][] Item Menu  [][][][][][][][][][][][]");
			System.out.println("");
			System.out.println("(1) Hats");
			System.out.println("(2) Clothing");
			System.out.println("(3) Shoes");
			System.out.println("(4) Weapons");
			System.out.println("(5) Sheilds");
			System.out.println("(6) Exit");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("Input: ");
			itemMenuSelection = intInput.nextInt();
			
			if (itemMenuSelection == 1)
			{
				
				//game = hatMenu(game);
				
			}
			else if (itemMenuSelection == 2)
			{
				
				//game = clothingMenu(game);
				
			}
			else if (itemMenuSelection == 3)
			{
				
				//game = shoeMenu(game);
				
			}
			else if (itemMenuSelection == 4)
			{
				
				//game = weaponMenu(game);
				
			}
			else if (itemMenuSelection == 5)
			{
				
				//game = sheildMenu(game);
				
			}
			else if (itemMenuSelection == 6)
			{
				
				itemMenu = false;
				
			}
			
		}
		
		//return
		
		return(game);
		
	}
	
}
