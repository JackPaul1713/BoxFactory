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
		
		boolean cont = true;
		String gameSelection = "";
		Game game;
		
		//startUp
		
		SetScreenSize.setScreenSize();
		TitleScreen.titleScreen();
		
		//game
		
		game = GameSelect.gameSelect();
		Directory.directory(game);
		
	}
	
}
