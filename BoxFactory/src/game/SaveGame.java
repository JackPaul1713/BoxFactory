package game;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveGame
{

	public static void saveGame()
	{
		
		//saver
		
		String defaultSave = "DefaultSave.txt";
		String savedGame1 = "SavedGame1.txt";
		String savedGame2 = "SavedGame2.txt";
		String savedGame3 = "SavedGame3.txt";
		
		FileWriter fileWriter = null;
		
		if(gameSelection.substring(1, 2).equals("1"))
		{
				
			fileWriter = new FileWriter(savedGame1);
				
		}
		else if(gameSelection.substring(1, 2).equals("2"))
		{

			fileWriter = new FileWriter(savedGame2);
				
		}
		else if(gameSelection.substring(1, 2).equals("3"))
		{
				
			fileWriter = new FileWriter(savedGame3);
				
		}
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		//saveData
        
        bufferedWriter.write(factoryName); bufferedWriter.newLine();
        bufferedWriter.write(charName); bufferedWriter.newLine();
		
        bufferedWriter.newLine();
	
        bufferedWriter.write(makeSpeed); bufferedWriter.newLine();
        bufferedWriter.write(mobLikelyhood); bufferedWriter.newLine();
        bufferedWriter.write(moneyLikelyhood); bufferedWriter.newLine();
        bufferedWriter.write(junkLikelyhood); bufferedWriter.newLine();
        bufferedWriter.write(itemLikelyhood); bufferedWriter.newLine();
        bufferedWriter.write(openingSpeed); bufferedWriter.newLine();
        bufferedWriter.write(numbOfBoxesMade); bufferedWriter.newLine();
        bufferedWriter.write(numbOfBoxes); bufferedWriter.newLine();
		
		bufferedWriter.newLine();
		
		bufferedWriter.write(health); bufferedWriter.newLine();
		bufferedWriter.write(maxHealth); bufferedWriter.newLine();
		bufferedWriter.write(strength); bufferedWriter.newLine();
		bufferedWriter.write(defence); bufferedWriter.newLine();
		bufferedWriter.write(money); bufferedWriter.newLine();
		
		bufferedWriter.newLine();

		bufferedWriter.write(Boolean.toString(FasterConvarabelt)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(StudierCardboard)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(CoolerBoxes)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(CleanerBoxs)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(MoreBoxyBoxes)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(OpeningMaster)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(MoreBoxes1)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(MoreBoxes2)); bufferedWriter.newLine();
		
		bufferedWriter.newLine();
		
		bufferedWriter.write(Boolean.toString(ownPaperBag)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownFedExHat)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownBoxHelmet)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownBoxCrown)); bufferedWriter.newLine();
	
		bufferedWriter.newLine();
		
		bufferedWriter.write(Boolean.toString(ownUPSUniform)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownTapeWrap)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownBoxArmor)); bufferedWriter.newLine();
		
		bufferedWriter.newLine();
		
		bufferedWriter.write(Boolean.toString(ownOldSlippers)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownRubberGloves)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownTissueBoxes)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownLeftSock)); bufferedWriter.newLine();

		bufferedWriter.newLine();
		
		bufferedWriter.write(Boolean.toString(ownCarKeys)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownToothBrush)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownRustyScrewDriver)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownCardBoardSword)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownBoxingGloves)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownTapeGun)); bufferedWriter.newLine();

		bufferedWriter.newLine();
		
		bufferedWriter.write(Boolean.toString(ownPieceOfCardboard)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownSturdyPieceOfCardboard)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownPlasticBinLid)); bufferedWriter.newLine();
		bufferedWriter.write(Boolean.toString(ownTrashCanLid)); bufferedWriter.newLine();
		
		bufferedWriter.newLine();
		
		bufferedWriter.write(onionAmmount); bufferedWriter.newLine();
		bufferedWriter.write(marshMelloAmmount); bufferedWriter.newLine();
		bufferedWriter.write(magicShroomAmmount); bufferedWriter.newLine();
		bufferedWriter.write(packingPenutAmmount); bufferedWriter.newLine();
		
		bufferedWriter.newLine();
		
		//bufferedWriter.write(stamps); bufferedWriter.newLine();
		
		//closeSaver
		
		bufferedWriter.close();
		
	}
	
}

