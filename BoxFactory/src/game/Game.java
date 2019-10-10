package game;

import java.io.FileReader;
import java.io.BufferedReader;
import food.*;
import junk.*;

public class Game
{

	public static void game()
	{
		
		//saveLoader
		
		int gameNumber = 0;
		String newOrLoadGame = "";
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
		String line = null;
		FileReader fileReader1 = new FileReader(savedGame1);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		
		//characterStats
		
		String charName = "Mife Tyson";
		int health = 100;
		int maxHealth = 100;
		int strength = 10;
		int defence = 10;
		int money = 0;
		
		int onionAmmount = 0;
		int marshMelloAmmount = 0; 
		int magicShroomAmmount = 0;
		int packingPenutAmmount = 0;
		
		boolean ownPaperBag = false;
		boolean ownFedExHat = false;
		boolean ownBoxHelmet = false;
		boolean ownBoxCrown = false;
	
		boolean ownUPSUniform = false;
		boolean ownTapeWrap = false;
		boolean ownBoxArmor = false;
		
		boolean ownOldSlippers = false;
		boolean ownRubberGloves = false;
		boolean ownTissueBoxes = false;
		boolean ownLeftSock = false;

		boolean ownCarKeys = false;
		boolean ownToothBrush = false;
		boolean ownRustyScrewDriver = false;
		boolean ownCardBoardSword = false;
		boolean ownBoxingGloves = false;
		boolean ownTapeGun = false;

		boolean ownPieceOfCardboard = false;
		boolean ownSturdyPieceOfCardboard = false;
		boolean ownPlasticBinLid = false;
		boolean ownTrashCanLid = false;
		
		//factoryStats
		
		String factoryName = "Box Factory";
		int MakeSpeed = 20;
		int MobLikelyhood = 10;
		int MoneyLikelyhood = 40;
		int JunkLikelyhood = 10;
		int ItemLikelyhood = 10;
		int TotalLikelyhood = MobLikelyhood + MoneyLikelyhood + JunkLikelyhood + ItemLikelyhood;
		int OpeningSpeed = 20;
		int NumbOfBoxesMade = 1;
		
		boolean FasterConvarabelt = false;
		boolean StudierCardboard = false;
		boolean CoolerBoxes = false;
		boolean CleanerBoxs = false;
		boolean MoreBoxyBoxes = false;
		boolean OpeningMaster  = false;
		boolean MoreBoxes1 = false;
		boolean MoreBoxes2 = false;
		
		//food - fix costs
		
		Food onion = new Food("Onion", 5, 2);
		Food marshMello = new Food("MarshMello", 10, 5);
		Food magicShroom = new Food("Magic Shroom", 20, 15);
		Food packingPenut = new Food("Packing Penut", 50, 40);
		
		//items
		
		
		
		//junk
		
		Junk detentionSlip = new Junk("Detention Slip");
		Junk uglySweater = new Junk("Ugly Sweater");
		Junk velosirapterEgg = new Junk("Velosirapter Egg");
		Junk winningLoteryTicket = new Junk("Winning Lottery Ticket");
			/*Array junkImage;*/
		
		//closeSaveLoader
		
		bufferedReader1.close();
		
		//action
		
		MainMenu.mainMenu();
		
	}
	
}
