package boxFactoryMain;

import java.io.IOException;
import java.util.Scanner;

import game.*;
import game.Character;
import windows.Textbox;

public class Textboxes
{

	public static void dispFactoryStats(Game game) throws IOException, InterruptedException
	{
		
		Factory factory = game.getFactory();
		Scanner strInput = new Scanner(System.in);
		String[] text = new String[] {"Name: " + factory.getName(), "Boxes: " + factory.getNumbOfBoxes(), "Make box speed: " + factory.getMakeSpeed(), "Open box speed: " + factory.getOpeningSpeed(), "Mob likelyhood: " + factory.getMobLikelyhood(), "Money likelyhood: " + factory.getMoneyLikelyhood(), "Junk likelyhood: " + factory.getJunkLikelyhood(), "Item likelyhood: " + factory.getItemLikelyhood(), "Number of boxes made: " + factory.getNumbOfBoxesMade()};
		Textbox factoryStats = new Textbox("[][][][][][][][][][][] Factory Stats  [][][][][][][][][][][]", text, 17);
		
		factoryStats.display();
		strInput.nextLine();
		
		game.setDirectoryLocation("e");
		Directory.directory(game);
		
	}
	
	public static void dispCharacterStats(Game game) throws IOException, InterruptedException
	{
		
		Character character = game.getCharacter();
		Scanner strInput = new Scanner(System.in);
		String[] text = new String[] {"Name: " + character.getName(), "", "Money: " + character.getMoney(), "Health: " + character.getHealth(), "MaxHealth: " + character.getMaxHealth(), "Strength: " + character.getStrength(), "Defence: " + character.getDefence(), "Toughness: " + character.getToughness(), "Speed: " + character.getSpeed()};
		Textbox factoryStats = new Textbox("[][][][][][][][][][][] Factory Stats  [][][][][][][][][][][]", text, 17);
		
		factoryStats.display();
		strInput.nextLine();
		
		game.setDirectoryLocation("e");
		Directory.directory(game);
		
	}
	
}
