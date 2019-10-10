package boxFactory;

import java.util.Scanner;

public class TitleScreen
{

	public static boolean titleScreen()
	{
		
		//variables
		
		boolean playing = true;
		String responce = "";
		Scanner strInput = new Scanner(System.in);
		
		//action
		
		System.out.println("Box Factory TM");
		System.out.println("");
		System.out.println("factoryImageHere");
		System.out.println("");
		System.out.println("Press enter to play.");
		System.out.print("Press esc to exit.");
		
		responce = strInput.nextLine();
		responce = responce.toLowerCase();
		
		if(responce.equals("enter"))
		{
			
			playing = true;
			
		}
		else if(responce.equals("esc"))
		{
			
			playing = false;
			
		}
		
		//return
		
		return(playing);
		
	}
	
}
