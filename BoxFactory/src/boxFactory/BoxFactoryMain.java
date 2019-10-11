package boxFactory;

public class BoxFactoryMain
{

	public static void main(String[] args)
	{
		
		//variables
		
		boolean playing = true;
		boolean loose = false;
		String gameSelection = "";
		
		//action
		
		SetScreenSize.setScreenSize();
		
		while(playing = true)
		{
			
			playing = TitleScreen.titleScreen();
			
			if(playing = true)
			{
				
				//gameSelection = GameSelect.gameSelect(); //getLoadGameDataInfo
				//loose = Game.game(gameSelection); //loadGameData, game, loose.true exit.false
				
				if (loose = true)
				{
					
					//Loose.loose(gameSelection); //deleteGameData
					
				}
				
			}
			
		}
        
		//Goodbye.goodbye();
		
	}
	
}
