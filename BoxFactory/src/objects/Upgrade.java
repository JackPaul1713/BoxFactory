package objects;

public class Upgrade
{

	//variables
	
	private final String name;
	private final int cost;
	private final String statBoostArea;
	private final int statBoost;
	private boolean owned;
	
	//blueprint
	
	public Upgrade(String n, int c, String statBA, int statB, boolean o)
	{
		
		name = n;
		cost = c;
		statBoostArea = statBA;
		statBoost = statB;
		owned = o;
		
	}
	
	//getters
	
	public String getName()
	{
		return name;
	}

	public String getStatBoostArea()
	{
		return statBoostArea;
	}

	public int getCost()
	{
		return cost;
	}

	public int getStatBoost()
	{
		return statBoost;
	}

	public boolean isOwned()
	{
		return owned;
	}
	
	//setters
	
	public void setOwned(Factory factory, boolean owned)
	{
		
		this.owned = owned;
		
		/*if(equiped == true)
		{
			
			factory.setMaxHealth(factory.getMaxHealth() + this.getMaxHealthBoost());
			factory.setStrength(factory.getStrength() + this.getStrengthBoost());
			factory.setDefence(factory.getDefence() + this.getDefenceBoost());
			factory.setToughness(factory.getToughness() + this.getToughnessBoost());
			factory.setSpeed(factory.getSpeed() + this.getSpeedBoost());
			
		}
		else if (equiped == false)
		{
			
			factory.setMaxHealth(factory.getMaxHealth() - this.getMaxHealthBoost());
			factory.setStrength(factory.getStrength() - this.getStrengthBoost());
			factory.setDefence(factory.getDefence() - this.getDefenceBoost());
			factory.setToughness(factory.getToughness() - this.getToughnessBoost());
			factory.setSpeed(factory.getSpeed() - this.getSpeedBoost());

			if (factory.getHealth() > factory.getMaxHealth())
			{
				
				factory.setHealth(factory.getMaxHealth());
				
			}
			
		}*/
		
	}
	
	public void loadOwned(boolean owned)
	{
		
		this.owned = owned;
		
	}
	
}
