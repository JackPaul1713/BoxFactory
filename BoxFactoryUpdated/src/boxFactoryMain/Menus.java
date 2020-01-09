package boxFactoryMain;

import java.io.IOException;
import java.util.Scanner;

import game.Game;
import windows.*;

public class Menus
{

	public static void dispStats(Game game) throws IOException, InterruptedException
	{
		
		String factoryName;
		Scanner strInput = new Scanner(System.in);
		String[] options = new String[] {"Factory Stats", "Character Stats"};
		Menu dispStats = new Menu("[][][][][][][][][][][] Display Stats  [][][][][][][][][][][]", options, 17);
		
		dispStats.display();
		game.setDirectoryLocation(strInput.nextLine());
		
		Directory.directory(game);
		
	}
	
}
