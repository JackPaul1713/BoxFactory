package mainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import objects.Game;
import objects.Factory;
import objects.Character;
import objects.*;

public class OpenBox
{

	public static Game openBox(Game game) throws InterruptedException
	{
		
		//variables
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		
		int speed = (factory.getOpeningSpeed() * 1000) / 10;
		String enterToContinue;
		
		Scanner strInput = new Scanner(System.in);
		
		//action
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                          ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                          ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                           __                               ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                         __--__                             ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                           __                               ");
		System.out.println("                       __--  --__                           ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                         __  __                             ");
		System.out.println("                     __--      --__                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                         _-  -_                             ");
		System.out.println("                       _-      -_                           ");
		System.out.println("                     _-          -_                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                        /      \\                            ");
		System.out.println("                       /        \\                           ");
		System.out.println("                      /          \\                          ");
		System.out.println("                     /            \\                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                     |            |                         ");
		System.out.println("                     |            |                         ");
		System.out.println("                     |            |                         ");
		System.out.println("                     |            |                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                 \\                    /                     ");
		System.out.println("                  \\                  /                      ");
		System.out.println("                   \\                /                       ");
		System.out.println("                    \\              /                        ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("               -_                      _-                   ");
		System.out.println("                 -_                  _-                     ");
		System.out.println("                   -_              _-                       ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Opening Box...");
		
		Thread.sleep(speed);
		
		System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("               -_                      _-                   ");
		System.out.println("                 -_                  _-                     ");
		System.out.println("                   -_              _-                       ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("                     [][][][][][][]                         ");
		System.out.println("_____________________[][][][][][][]_________________________");
		System.out.println("                                                            ");
		System.out.print("Box Opened! Press enter to continue.");
		
		factory.setNumbOfBoxes(factory.getNumbOfBoxes() - 1);
		
		enterToContinue = strInput.nextLine();
		
		//collectStuffInside
		
		game = collectStuffInside(game);
		
		//return
		
		game.setFactory(factory);
		game.setCharacter(character);
		
		return(game);
		
	}
	
	public static Game collectStuffInside(Game game)
	{
		
		//variables
		
		Factory factory = game.getFactory();
		Character character = game.getCharacter();
		int mobNumb = factory.getMobLikelyhood();
		int moneyNumb = factory.getMoneyLikelyhood() + mobNumb;
		int junkNumb = factory.getJunkLikelyhood() + moneyNumb;
		int itemNumb = factory.getItemLikelyhood() + junkNumb;
		int totalLikelyhood = factory.getMobLikelyhood() + factory.getMoneyLikelyhood() + factory.getJunkLikelyhood() + factory.getItemLikelyhood();
		
		int randomNumber = (int) (Math.random() * totalLikelyhood + 1);
		
		int randomMoney;
		int moneyAmmount = 0;
		int randomJunk; 
		Junk junk;
		int randomItem; 
		ArrayList<Item> items = character.getItems();
		Item item;
		
		Scanner strInput = new Scanner(System.in);
		String enterToContinue;
		
		//action
		
		if (randomNumber <= mobNumb)
		{
			
			//mob = generateMob();
			//mob.diplay();
			//mobFight(charater, mob);
			
		}
		else if (randomNumber <= moneyNumb && randomNumber > mobNumb)
		{
			
			randomMoney = (int) (Math.random() * 10 + 1);
			
			if (randomMoney >= 1 && randomMoney <= 5)
			{
				
				moneyAmmount = 5;
				
			}
			else if (randomMoney >= 6 && randomMoney <= 9)
			{
				
				moneyAmmount = 10;
				
			}
			else if (randomMoney == 10)
			{
				
				moneyAmmount = 40;
				
			}
			
			System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
			System.out.println("");
			System.out.println("------------------------------------------------------------");
			System.out.println("                                                            ");
			System.out.println("                                                            ");
			System.out.println("                      M M MMMM M M                          ");
			System.out.println("                      M  $ OO $  M                          ");
			System.out.println("               -_     M  $ OO $  M     _-                   ");
			System.out.println("                 -_   M M MMMM M M   _-                     ");
			System.out.println("                   -_              _-                       ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("_____________________[][][][][][][]_________________________");
			System.out.println("                                                            ");
			System.out.print("You got $" + moneyAmmount + "! Press enter to continue.");
			
			character.setMoney(character.getMoney() + moneyAmmount);
			
			enterToContinue = strInput.nextLine();
			
		}
		else if (randomNumber <= junkNumb && randomNumber > moneyNumb)
		{
			
			randomJunk = (int) (Math.random() * character.getJunk().size());
			
			junk = character.getJunk().get(randomJunk);
			
			System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
			System.out.println("");
			System.out.println("------------------------------------------------------------");
			System.out.println("                                                            ");
			System.out.println("                                                            ");
			System.out.println("                        LK bls sdM                          ");
			System.out.println("                       X d dds s dc                         ");
			System.out.println("               -_      v fsf ds l      _-                   ");
			System.out.println("                 -_     B ksd do    _-                     ");
			System.out.println("                   -_              _-                       ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("_____________________[][][][][][][]_________________________");
			System.out.println("                                                            ");
			System.out.print("Oof, you got a useless " + junk.getName() + ". Press enter to continue.");
			
			enterToContinue = strInput.nextLine();
			
		}
		else if (randomNumber > junkNumb)
		{
			
			randomItem = (int) (Math.random() * character.getItems().size());
			
			item = character.getItems().get(randomItem);
			
			System.out.println("\n[][][][][][][][][][][][] Open Box [][][][][][][][][][][][][]");
			System.out.println("");
			System.out.println("------------------------------------------------------------");
			System.out.println("                             ____                           ");
			System.out.println("                            -____-                          ");
			System.out.println("                           _-    |                          ");
			System.out.println("                       ----     -                           ");
			System.out.println("               -_     | |      -       _-                   ");
			System.out.println("                 -_    --------      _-                     ");
			System.out.println("                   -_              _-                       ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("                     [][][][][][][]                         ");
			System.out.println("_____________________[][][][][][][]_________________________");
			System.out.println("                                                            ");
			System.out.print("You got a " + item.getName() + "! Press enter to continue.");
			
			item.setOwned(true);
			items.set(randomItem, item);
			character.setItems(items);
			
			enterToContinue = strInput.nextLine();
			
		}
		
		//return
		
		game.setFactory(factory);
		game.setCharacter(character);
		
		return(game);
		
	}
	
}
