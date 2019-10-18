package boxFactory;

import java.io.IOException;

import game.BoxFactoryGame;

public class BoxFactoryMain
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		//variables
		
		boolean playing = true;
		String gameSelection = "";
		
		//action
		
		SetScreenSize.setScreenSize();
		
		while(playing)
		{
			
			playing = TitleScreen.titleScreen();
			
			if(playing)
			{
				
				gameSelection = GameSelect.gameSelect(); //getLoadGameDataInfo
				BoxFactoryGame.boxFactoryGame(gameSelection); //loadGameData, game, loose.true exit.false
				
			}
			
		}
        
		//Goodbye.goodbye();
		
	}
	
}
