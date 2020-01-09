package boxFactoryMain;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import game.*;
import editData.LoadGame;

public class GameSelect
{

	public static Game gameSelect() throws IOException
	{
		
		//variables
		
		String gameSelection = "";
		Scanner strInput = new Scanner(System.in);
		
		Game game;
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
		FileReader fileReader0 = new FileReader(defaultSave);
		BufferedReader bufferedReader0 = new BufferedReader(fileReader0);
		
		FileReader fileReader1 = new FileReader(savedGame1);
		BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		
		FileReader fileReader2 = new FileReader(savedGame2);
		BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
		
		FileReader fileReader3 = new FileReader(savedGame3);
		BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
		
		//getSelection
		
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("[][][][][][][][][][][] Game Selection [][][][][][][][][][][]");
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("[][][][][][][][][][][] Saved Games [][][][][][][][][][][]");
		System.out.println("");
		System.out.println("(1) " + bufferedReader1.readLine());
		System.out.println("(2) " + bufferedReader2.readLine());
		System.out.println("(3) " + bufferedReader3.readLine());
		System.out.println("");
		System.out.println("Enter n for a new game and l to load a previous save.");
		System.out.println("Then input the game number, and press enter.");
		System.out.println("ExampleInput: \"n1\" or \"l2\"");
		System.out.println("");
		System.out.println("Note: selecting 'n' on a game will overwright its save.");
		System.out.println("");
		System.out.print("Input: ");
		gameSelection = strInput.nextLine();
		
		bufferedReader0.close();
		bufferedReader1.close();
		bufferedReader2.close();
		bufferedReader3.close();
		
		//checkSelection
		
		/*if (!gameSelection.substring(0).equals("n") && !gameSelection.substring(0).equals("l") && !gameSelection.substring(0).equals("d"))
		{
			
			if (!gameSelection.substring(1).equals("1") && !gameSelection.substring(1).equals("2") && !gameSelection.substring(1).equals("3"))
			{
				
				gameSelection = "";
				game = GameSelect.gameSelect();
				
			}
			
		}*/
		
		//loadSelection
		
		game = LoadGame.loadGame(gameSelection);
		
		//return
		
		return(game);
		
	}
	
}
