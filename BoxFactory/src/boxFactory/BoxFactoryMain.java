package boxFactory;

import java.io.IOException;

import game.Game;

public class BoxFactoryMain
{

	public static void main(String[] args) throws IOException
	{
		
		//variables
		
		boolean playing = true;
		boolean game = true;
		String gameSelection = "";
		
		//action
		
		SetScreenSize.setScreenSize();
		
		while(playing = true)
		{
			
			playing = TitleScreen.titleScreen();
			
			if(playing = true)
			{
				
				gameSelection = GameSelect.gameSelect(); //getLoadGameDataInfo
				game = Game.game(gameSelection); //loadGameData, game, loose.true exit.false
				
				if (game = false)
				{
					
					//Loose.loose(gameSelection); //deleteGameData
					
				}
				
			}
			
		}
        
		//Goodbye.goodbye();
		
	}
	
}
