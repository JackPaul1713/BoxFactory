package things;

import game.Factory;

public class Upgrade
{

	//variables
	
	private final String name;
	private final int cost;
	
	private final int makeSpeedBoost;
	private final int openingSpeedBoost;
	private final int mobLikelyhoodMod;
	private final int moneyLikelyhoodMod;
	private final int junkLikelyhoodMod;
	private final int itemLikelyhoodMod;
	private final int numbOfBoxesMadeBoost;
	
	private boolean owned;
	
	//blueprint
	
	public Upgrade(String n, int c, int makeSB, int openingSB, int mobLM, int moneyLM, int junkLM, int itemLM, int numbBMB, boolean o)
	{
		
		name = n;
		cost = c;
		makeSpeedBoost = makeSB;
		openingSpeedBoost = openingSB;
		mobLikelyhoodMod = mobLM;
		moneyLikelyhoodMod = moneyLM;
		junkLikelyhoodMod = junkLM;
		itemLikelyhoodMod = itemLM;
		numbOfBoxesMadeBoost = numbBMB;
		owned = o;
		
	}
	
	//getters
	
	public String getName()
	{
		return name;
	}

	public int getCost()
	{
		return cost;
	}

	public int getMakeSpeedBoost()
	{
		return makeSpeedBoost;
	}

	public int getOpeningSpeedBoost()
	{
		return openingSpeedBoost;
	}

	public int getMobLikelyhoodMod()
	{
		return mobLikelyhoodMod;
	}

	public int getMoneyLikelyhoodMod()
	{
		return moneyLikelyhoodMod;
	}

	public int getJunkLikelyhoodMod()
	{
		return junkLikelyhoodMod;
	}

	public int getItemLikelyhoodMod()
	{
		return itemLikelyhoodMod;
	}

	public int getNumbOfBoxesMadeBoost()
	{
		return numbOfBoxesMadeBoost;
	}
	
	public boolean isOwned()
	{
		return owned;
	}
	
	//setters
	
	public void setOwned(Factory factory, boolean owned)
	{
		
		if (this.owned = false)
		{
		
			if(owned == true)
			{
			
				this.owned = owned;
				
				factory.setMakeSpeed(factory.getMakeSpeed() + this.getMakeSpeedBoost());
				factory.setOpeningSpeed(factory.getOpeningSpeed() + this.getOpeningSpeedBoost());
				factory.setMobLikelyhood(factory.getMobLikelyhood() + this.getMobLikelyhoodMod());
				factory.setMoneyLikelyhood(factory.getMoneyLikelyhood() + this.getMoneyLikelyhoodMod());
				factory.setJunkLikelyhood(factory.getJunkLikelyhood() + this.getJunkLikelyhoodMod());
				factory.setItemLikelyhood(factory.getItemLikelyhood() + this.getItemLikelyhoodMod());
				factory.setNumbOfBoxesMade(factory.getNumbOfBoxesMade() + this.getNumbOfBoxesMadeBoost());
			
			}	
			
		}	
		
	}
	
	public void loadOwned(boolean owned)
	{
		
		this.owned = owned;
		
	}
	
}
