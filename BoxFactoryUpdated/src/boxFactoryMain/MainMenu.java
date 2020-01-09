package boxFactoryMain;

import java.io.IOException;
import java.util.Scanner;

import game.*;
import game.Character;
import editData.*;
import windows.*;
import things.*;
import mobs.*;

public class MainMenu
{

	public static void mainMenu(Game game) throws IOException, InterruptedException
	{
		
		//variables
		
		String mainMenuSelection;
		Scanner strInput = new Scanner(System.in);
		
		//action

		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("[][][][][][][][][] Box Factory Main Menu  [][][][][][][][][]");
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("Boxes: " + game.getFactory().getNumbOfBoxes() + " Health: " + game.getCharacter().getHealth() + "/" + game.getCharacter().getMaxHealth() + " Money: " + game.getCharacter().getMoney());
		System.out.println("");
		System.out.println("(1) Stats");
		System.out.println("(2) Make Box");
		System.out.println("(3) Open Box");
		System.out.println("(4) My Items");
		System.out.println("(5) Upgrades");
		System.out.println("(6) Shop");
		System.out.println("(7) Save");
		System.out.println("(e) Exit");
		System.out.println("");
		System.out.println("");
		System.out.print("Input: ");
		mainMenuSelection = strInput.nextLine();
		game.setDirectoryLocation(mainMenuSelection);
		
		Directory.directory(game);

	}
	
}
