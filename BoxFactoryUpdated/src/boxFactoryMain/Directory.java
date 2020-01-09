package boxFactoryMain;

import java.io.IOException;

import game.*;
import actions.*;
import editData.SaveData;

public class Directory
{

	public static Game directory(Game game) throws IOException, InterruptedException
	{
		
		if (game.getDirectoryLocation().contentEquals(""))
		{
			
			game = GameSelect.gameSelect();
			Directory.directory(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("1"))
		{
		
			MainMenu.mainMenu(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("11"))
		{
			
			Menus.dispStats(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("111"))
		{
			
			Textboxes.dispFactoryStats(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("112"))
		{
			
			Textboxes.dispCharacterStats(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("12"))
		{
			
			MakeBox.makeBox(game);
			Directory.directory(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("13"))
		{
			
			OpenBox.openBox(game);
			Directory.directory(game);
			
		}
		/*else if (game.getDirectoryLocation().contentEquals("14"))
		{
			
			Menus.myItems(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("15"))
		{
			
			Menus.upgrades(game);
			
		}
		else if (game.getDirectoryLocation().contentEquals("16"))
		{
			
			Menus.shop(game);
			
		}*/
		else if (game.getDirectoryLocation().contentEquals("17"))
		{
			
			SaveData.saveData(game);
			Directory.directory(game);
			
		}
		else
		{
			
			game.setDirectoryLocation("cls");
			Directory.directory(game);
			
		}
		
		return(game);
		
	}
	
}
