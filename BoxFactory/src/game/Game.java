package game;

import java.io.FileReader;
import java.io.BufferedReader;
import food.*;
import junk.*;

public class Game
{

	public static void game(String gameSelection)
	{
		
		//saveLoader
		
		int gameNumber = 0;
		String newOrLoadGame = "";
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
		String line = null;
		FileReader fileReader;
		
		if(gameSelection.substring(0, 1).equals("l"))
		{
			
			if(gameSelection.substring(1, 2).equals("1"))
			{
				
				fileReader = new FileReader(savedGame1);
				
			}
			else if(gameSelection.substring(1, 2).equals("2"))
			{

				fileReader = new FileReader(savedGame2);
				
			}
			else if(gameSelection.substring(1, 2).equals("3"))
			{
				
				fileReader = new FileReader(savedGame3);
				
			}
			
		}
		else
		{
			
			fileReader = new FileReader(defaultSave);
			
		}
		
        BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//loadData
        
        String factoryName = bufferedReader.readLine();
		String charName = bufferedReader.readLine();
		
		bufferedReader.readLine();
	
		int MakeSpeed = 20;
		int MobLikelyhood = 10;
		int MoneyLikelyhood = 40;
		int JunkLikelyhood = 10;
		int ItemLikelyhood = 10;
		int TotalLikelyhood = MobLikelyhood + MoneyLikelyhood + JunkLikelyhood + ItemLikelyhood;
		int OpeningSpeed = 20;
		int NumbOfBoxesMade = 1;
		
		bufferedReader.readLine();
		
		int health = Integer.parseInt(bufferedReader.readLine());
		int maxHealth = Integer.parseInt(bufferedReader.readLine());
		int strength = Integer.parseInt(bufferedReader.readLine());
		int defence = Integer.parseInt(bufferedReader.readLine());
		int money = Integer.parseInt(bufferedReader.readLine());
		
		bufferedReader.readLine();

		boolean FasterConvarabelt = Boolean.parseBoolean(bufferedReader.readLine());
		boolean StudierCardboard = Boolean.parseBoolean(bufferedReader.readLine());
		boolean CoolerBoxes = Boolean.parseBoolean(bufferedReader.readLine());
		boolean CleanerBoxs = Boolean.parseBoolean(bufferedReader.readLine());
		boolean MoreBoxyBoxes = Boolean.parseBoolean(bufferedReader.readLine());
		boolean OpeningMaster  = Boolean.parseBoolean(bufferedReader.readLine());
		boolean MoreBoxes1 = Boolean.parseBoolean(bufferedReader.readLine());
		boolean MoreBoxes2 = Boolean.parseBoolean(bufferedReader.readLine());
		
		bufferedReader.readLine();
		
		boolean ownPaperBag = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownFedExHat = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownBoxHelmet = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownBoxCrown = Boolean.parseBoolean(bufferedReader.readLine());
	
		bufferedReader.readLine();
		
		boolean ownUPSUniform = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownTapeWrap = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownBoxArmor = Boolean.parseBoolean(bufferedReader.readLine());
		
		bufferedReader.readLine();
		
		boolean ownOldSlippers = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownRubberGloves = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownTissueBoxes = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownLeftSock = Boolean.parseBoolean(bufferedReader.readLine());

		bufferedReader.readLine();
		
		boolean ownCarKeys = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownToothBrush = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownRustyScrewDriver = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownCardBoardSword = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownBoxingGloves = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownTapeGun = Boolean.parseBoolean(bufferedReader.readLine());

		bufferedReader.readLine();
		
		boolean ownPieceOfCardboard = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownSturdyPieceOfCardboard = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownPlasticBinLid = Boolean.parseBoolean(bufferedReader.readLine());
		boolean ownTrashCanLid = Boolean.parseBoolean(bufferedReader.readLine());
		
		bufferedReader.readLine();
		
		int onionAmmount = Integer.parseInt(bufferedReader.readLine());
		int marshMelloAmmount = Integer.parseInt(bufferedReader.readLine()); 
		int magicShroomAmmount = Integer.parseInt(bufferedReader.readLine());
		int packingPenutAmmount = Integer.parseInt(bufferedReader.readLine());
		
		int stamps = Integer.parseInt(bufferedReader.readLine());
		
		//makeObjects
		
		//items
		
		
		
		//food
		
		Food onion = new Food("Onion", 5, 2);
		Food marshMello = new Food("MarshMello", 10, 5);
		Food magicShroom = new Food("Magic Shroom", 20, 15);
		Food packingPenut = new Food("Packing Penut", 50, 40);
		
		//junk
		
		Junk detentionSlip = new Junk("Detention Slip");
		Junk uglySweater = new Junk("Ugly Sweater");
		Junk velosirapterEgg = new Junk("Velosirapter Egg");
		Junk winningLoteryTicket = new Junk("Winning Lottery Ticket");
			/*Array junkImage;*/
		
		//closeSaveLoader
		
		bufferedReader.close();
		
		//action
		
		MainMenu.mainMenu();
		
	}
	
}
