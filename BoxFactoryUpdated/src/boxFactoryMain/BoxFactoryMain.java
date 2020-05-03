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

	static Game game;
	
	public static void main(String[] args) throws IOException, InterruptedException
	{

		//startUp
		
		SetScreenSize.setScreenSize();
		TitleScreen.titleScreen();
		
		//game
		
		GameSelect.gameSelect();
		//Directory.directory();
		
	}
	
}
