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
		
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("[][][][][][][][][][][] Box Factory TM [][][][][][][][][][][]");
		System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
		System.out.println("");
		System.out.println("                  S S          s S        s S              ");
		System.out.println("                 S s          H-H        S S       ~       ");
		System.out.println("       ~        H-H           H-H       H-H                ");
		System.out.println("                H-H           H-H       H-H                ");
		System.out.println("                H-H        |EEEEEEEEEEEEEEEEEEE|           ");
		System.out.println("           |EEEEEEEEEEEEEEE|E E 0 E 0 0 E 0 E E|           ");
		System.out.println("           |E 0 E 0 E 0 E E E E 0 E E E E 0 E E|           ");
		System.out.println("           |E 0 E 0 E 0 E E E E E E|I:I|E E E E|           ");
		System.out.println("           |E E E E E E E E E E E E|I:I|E E E E|           ");
		System.out.println("    M M M M M M M M M M M M M M M M M M M M M M M M M M    ");
		System.out.println("");
		System.out.println("[][][][][][][][][] Press enter to play. [][][][][][][][][][]");
		System.out.print("[][][][][][][][][] Press esc to exit.   [][][][][][][][][][]");
		
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
