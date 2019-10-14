package game;

import java.util.Scanner;

public class MainMenu
{

	public static int mainMenu()
	{
		
		//variables
		
		int mainMenuSelection = 0;
		
		Scanner intInput = new Scanner(System.in);
		
		//action
		
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("[][][][][][][][][] Box Factory Main Menu  [][][][][][][][][]");
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("*Basic Stats*");
		System.out.println("");
		System.out.println("(1) Stats");
		System.out.println("(2) Make Box");
		System.out.println("(3) Open Box");
		System.out.println("(4) My Items");
		System.out.println("(5) Upgrades");
		System.out.println("(6) Shop");
		System.out.println("(7) Boss Fight [Locked]");
		System.out.println("(8) Save");
		System.out.println("(9) Exit");
		System.out.println("");
		System.out.print("Input: ");
		mainMenuSelection = intInput.nextInt();
		
		//return
		
		return(mainMenuSelection);
		
	}
	
}
