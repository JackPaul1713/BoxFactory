package game;

import java.util.ArrayList;

import objects.Food;
import objects.Item;
import objects.Junk;
import objects.Upgrade;

public class InitializeObjects
{

	public static ArrayList<Upgrade> initializeUpgrades()
	{
		
		//variables
		
		ArrayList<Upgrade> upgrades = new ArrayList<Upgrade>();
				
		//objects
				
		Upgrade moreBoxes = new Upgrade("More Boxes", 90, 0, 0, 0, 0, 0, 0, 3, false);
				
		//fillArray
				
		upgrades.add(moreBoxes);
				
		//return
				
		return(upgrades);
		
	}
	
	public static ArrayList<Item> initializeItems()
	{
		
		//variables
		
		ArrayList<Item> items = new ArrayList<Item>();
		
		//objects
		
		Item rustyScrewdriver = new Item("Rusty Screwdriver", "Weapon", 0, 10, 0, 5, 0, "An average screwdriver, but with a twist: Tetnis.", false, false);
		Item sturdyPieceOfCardboard = new Item("Sturdy Piece of Cardboard", "Sheild", 0, 0, 8, 0, 0, "Studier than you average cardboard.", false, false);
		Item fedExHat = new Item("Fed-Ex Hat", "Hat", 0, 0, 0, 0, 70, "A company hat that gives you the speedy delivery power of Fed-Ex.", false, false);
		Item tapeMummyGarmets = new Item("Tape Mummy Garmet", "Clothing", 20, 0, 0, 20, -10, "Pretty cool, very uncomfortable.", false, false);
		Item leftSock = new Item("Left Sock", "Shoes", 0, 0, 0, 100, 50, "A lone left sock that provides invincibility, obviously.", false, false);
		
		//fillArray
		
		items.add(rustyScrewdriver);
		items.add(sturdyPieceOfCardboard);
		items.add(fedExHat);
		items.add(tapeMummyGarmets);
		items.add(leftSock);
		
		//return
		
		return(items);
		
	}
	
	public static ArrayList<Food> initializeFood()
	{
		
		//variables
		
		ArrayList<Food> foods = new ArrayList<Food>();
		
		//objects
		
		Food onion = new Food("Onion", 5, 2, 0);
		Food marshMello = new Food("MarshMello", 10, 5, 0);
		Food magicShroom = new Food("Magic Shroom", 20, 15, 0);
		Food packingPenut = new Food("Packing Penut", 50, 40, 0);
		
		//fillArray
		
		foods.add(onion);
		foods.add(marshMello);
		foods.add(magicShroom);
		foods.add(packingPenut);
		
		//return
		
		return(foods);
		
	}
	
	public static ArrayList<Junk> initializeJunk()
	{
		
		//variables
		
		ArrayList<Junk> junk = new ArrayList<Junk>();
		
		//objects
		
		Junk detentionSlip = new Junk("Detention Slip");
		Junk uglySweater = new Junk("Ugly Sweater");
		Junk velosirapterEgg = new Junk("Velosirapter Egg");
		Junk winningLoteryTicket = new Junk("Winning Lottery Ticket");
		
		//fillArray
		
		junk.add(detentionSlip);
		junk.add(uglySweater);
		junk.add(velosirapterEgg);
		junk.add(winningLoteryTicket);
		
		//return
		
		return(junk);
		
	}
	
}
