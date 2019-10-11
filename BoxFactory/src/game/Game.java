package game;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import boxFactory.GameSelect;

import java.io.FileNotFoundException;
import food.*;
import junk.*;

public class Game
{

	public static void game(String gameSelection) throws IOException
	{
		
		//saveLoader
		
		int gameNumber = 0;
		String newOrLoadGame = "";
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
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
	
		int makeSpeed = Integer.parseInt(bufferedReader.readLine());
		int mobLikelyhood = Integer.parseInt(bufferedReader.readLine());
		int moneyLikelyhood = Integer.parseInt(bufferedReader.readLine());
		int junkLikelyhood = Integer.parseInt(bufferedReader.readLine());
		int itemLikelyhood = Integer.parseInt(bufferedReader.readLine());
		int totalLikelyhood = mobLikelyhood + moneyLikelyhood + junkLikelyhood + itemLikelyhood;
		int openingSpeed = Integer.parseInt(bufferedReader.readLine());
		int numbOfBoxesMade = Integer.parseInt(bufferedReader.readLine());
		int numbOfBoxes = Integer.parseInt(bufferedReader.readLine());
		
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
		
		//makeItems
		
		
		
		//makeFood
		
		Food onion = new Food("Onion", 5, 2);
		Food marshMello = new Food("MarshMello", 10, 5);
		Food magicShroom = new Food("Magic Shroom", 20, 15);
		Food packingPenut = new Food("Packing Penut", 50, 40);
		
		//makeJunk
		
		Junk detentionSlip = new Junk("Detention Slip");
		Junk uglySweater = new Junk("Ugly Sweater");
		Junk velosirapterEgg = new Junk("Velosirapter Egg");
		Junk winningLoteryTicket = new Junk("Winning Lottery Ticket");
			/*Array junkImage;*/
		
		//closeSaveLoader
		
		bufferedReader.close();
		
		//otherVariables
		
		int mainMenuSelection = 0;
		
		//action
		
		mainMenuSelection = MainMenu.mainMenu();
		
		if (mainMenuSelection == 1)
		{
			
			DispStats.dispStats(makeSpeed, mobLikelyhood, moneyLikelyhood, junkLikelyhood, itemLikelyhood, totalLikelyhood, openingSpeed, numbOfBoxesMade, numbOfBoxes)
			
		}
		else if (mainMenuSelection == 2)
		{
			
			MakeBox.makebox();
			
		}
		else if (mainMenuSelection == 3)
		{
			
			
			OpenBox.openBox();
			
		}
		else if (mainMenuSelection == 4)
		{
			
			ItemMenu.itemMenu();
			
		}
		else if (mainMenuSelection == 5)
		{
			
			UpgradeMenu.upgradeMenu();
			
		}
		else if (mainMenuSelection == 6)
		{
			
			ShopMenu.shopMenu
			
		}
		else if (mainMenuSelection == 7)
		{
			
			Save.save();
			
		}
		else if (mainMenuSelection == 8)
		{
			
			GameSelect.gameSelect();
			
		}
		
	}
	
}
