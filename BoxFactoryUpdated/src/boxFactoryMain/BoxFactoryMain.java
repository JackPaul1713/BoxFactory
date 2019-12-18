package boxFactoryMain;

import java.io.IOException;
import java.util.ArrayList;

import game.*;
import editData.*;
import windows.*;
import things.*;
import mobs.*;

public class BoxFactoryMain
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		//variables
		
		String gameSelection = "";
		Game game;
		
		//action
		
		SetScreenSize.setScreenSize();
		TitleScreen.titleScreen();
		gameSelection = GameSelect.gameSelect(); //getLoadGameDataInfo
		
		game = LoadGame.loadGame(gameSelection);
		//BoxFactoryGame.boxFactoryGame(gameSelection); //loadGameData, game, loose.true exit.false

		//Goodbye.goodbye();
		
	}
	
}
