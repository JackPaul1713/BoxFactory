package objects;

import java.util.ArrayList;

public class Factory
{
	
	//variables
	
	private final String name;
	
	private int numbOfBoxes;
	
	private int makeSpeed;
	private int openingSpeed;
	private int mobLikelyhood;
	private int moneyLikelyhood;
	private int junkLikelyhood;
	private int itemLikelyhood;
	private volatile int totalLikelyhood;
	private int numbOfBoxesMade;
	 
	public ArrayList<Upgrade> upgrades = new ArrayList<Upgrade>();
	
	//blueprint
	
	public Factory(String n, int numbB, int makeS, int openingS, int mobL, int moneyL, int junkL, int itemL, int totL, int numbBM, ArrayList<Upgrade> upG)
	{
		
		name = n;
		numbOfBoxes = numbB;
		
		setMakeSpeed(makeS);
		setOpeningSpeed(openingS);
		setMobLikelyhood(mobL);
		setMoneyLikelyhood(moneyL);
		setJunkLikelyhood(junkL);
		setItemLikelyhood(itemL);
		setTotalLikelyhood(mobL + moneyL + junkL + itemL);
		setNumbOfBoxesMade(numbBM);
		 
		upgrades = upG;
		
	}
	
	//getters
	
	public int getNumbOfBoxes()
	{
		return numbOfBoxes;
	}

	public int getMakeSpeed()
	{
		return makeSpeed;
	}

	public int getMobLikelyhood()
	{
		return mobLikelyhood;
	}

	public int getMoneyLikelyhood()
	{
		return moneyLikelyhood;
	}

	public int getJunkLikelyhood()
	{
		return junkLikelyhood;
	}

	public int getItemLikelyhood()
	{
		return itemLikelyhood;
	}

	public int getTotalLikelyhood()
	{
		return totalLikelyhood;
	}

	public int getOpeningSpeed()
	{
		return openingSpeed;
	}

	public int getNumbOfBoxesMade()
	{
		return numbOfBoxesMade;
	}
	
	public ArrayList<Upgrade> getUpgrades()
	{
		return(upgrades);
	}
	
	public String getName()
	{
		return name;
	}
	
	//setters
	
	public void setNumbOfBoxes(int numbOfBoxes)
	{
		this.numbOfBoxes = numbOfBoxes;
	}
	
	public void setMakeSpeed(int makeSpeed)
	{
		this.makeSpeed = makeSpeed;
	}
	
	public void setMobLikelyhood(int mobLikelyhood)
	{
		this.mobLikelyhood = mobLikelyhood;
	}
	
	public void setMoneyLikelyhood(int moneyLikelyhood)
	{
		this.moneyLikelyhood = moneyLikelyhood;
	}
	
	public void setJunkLikelyhood(int junkLikelyhood)
	{
		this.junkLikelyhood = junkLikelyhood;
	}
	
	public void setItemLikelyhood(int itemLikelyhood)
	{
		this.itemLikelyhood = itemLikelyhood;
	}
	
	public void setTotalLikelyhood(int totalLikelyhood)
	{
		this.totalLikelyhood = this.totalLikelyhood;
	}
	
	public void setOpeningSpeed(int openingSpeed)
	{
		this.openingSpeed = openingSpeed;
	}

	public void setNumbOfBoxesMade(int numbOfBoxesMade)
	{
		this.numbOfBoxesMade = numbOfBoxesMade;
	}
	
	public void setUpgrades(ArrayList<Upgrade> upgrades)
	{
		this.upgrades = upgrades;
	}
	
}
