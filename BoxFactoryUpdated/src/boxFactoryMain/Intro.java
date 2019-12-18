package boxFactoryMain;

import java.util.Scanner;

import windows.*;

public class Intro
{
	
	public static String getFactoryName()
	{

		String factoryName;
		Scanner strInput = new Scanner(System.in);
		Questionare newFactoryName = new Questionare("[][][][][][][][][][][] New Factory  [][][][][][][][][][][][]", "Enter a new factory name.", 17);
		
		newFactoryName.display();
		factoryName = strInput.nextLine();
		return(factoryName);
		
	}
	
	public static String getCharacterName()
	{
		
		String characterName;
		Scanner strInput = new Scanner(System.in);
		Questionare newCharacterName = new Questionare("[][][][][][][][][][][] New Character  [][][][][][][][][][][]", "Enter a new character name.", 17);
		
		newCharacterName.display();
		characterName = strInput.nextLine();
		return(characterName);
		
	}
	
	public static void intro()
	{
		
		
		
	}
	
}
