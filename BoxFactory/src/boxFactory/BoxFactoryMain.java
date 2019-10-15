package boxFactory;

import java.io.IOException;

import game.BoxFactoryGame;

public class BoxFactoryMain
{

	public static void main(String[] args) throws IOException
	{
		
		//variables
		
		boolean playing = true;
		String gameSelection = "";
		
		//action
		
		SetScreenSize.setScreenSize();
		
		while(playing = true)
		{
			
			playing = TitleScreen.titleScreen();
			
			if(playing = true)
			{
				
				gameSelection = GameSelect.gameSelect(); //getLoadGameDataInfo
				BoxFactoryGame.boxFactoryGame(gameSelection); //loadGameData, game, loose.true exit.false
				
			}
			
		}
        
		//Goodbye.goodbye();
		
	}
	
}
