package boxFactory;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameSelect
{

	public static String gameSelect() throws IOException
	{
		
		//variables
		
		String gameSelection = "";
		Scanner strInput = new Scanner(System.in);
		
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
		
		//action
		
		System.out.println("Choise new or load, then select the save. Ex:n1");
		System.out.println("");
		System.out.println("(1) " + bufferedReader1.readLine());
		System.out.println("(2) " + bufferedReader2.readLine());
		System.out.println("(3) " + bufferedReader3.readLine());
		System.out.println("");
		System.out.print("Input:");
		
		bufferedReader0.close();
		bufferedReader1.close();
		bufferedReader2.close();
		bufferedReader3.close();
		
		//return
		
		return("");
		
	}
	
}
