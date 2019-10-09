package boxFactory;

import game.*;
import gameSelect.*;

public class BoxFactoryMain
{

	public static void main(String[] args)
	{
		
		//variables
		
		String nOrLGame = "";
		
		//intro
		
		SetScreenSize.setScreenSize();
		Intro.intro();
		nOrLGame = GameSelect.gameSelect();
		
		//gameSelect
		
		for (int gs = 0; gs < 1;)
		{

			if (nOrLGame.equals("new"))
			{

				NewGame.newGame();
				gs = 1;

			} 
			else if (nOrLGame.equals("load"))
			{

				LoadGame.loadGame();
				gs = 1;

			} 
			else
			{

				System.out.println("Invalid input. Type \"new\" or \"load\".");
				nOrLGame = GameSelect.gameSelect();

			}

		}
		
		//game
		
		game.Game();
		
	}
	
}
