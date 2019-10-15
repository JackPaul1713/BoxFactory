package objects;

public class Item
{

	//variables
	
	private final String name;
	private final String type;
	private final int maxHealthBoost;
	private final int strengthBoost;
	private final int defenceBoost;
	private final int toughnessBoost;
	private final int speedBoost;
	private final String description;
	private boolean owned;
	private boolean equiped;
	
	//methods
	
	public void dispImage()
	{
		
		
		
	}
	
	public void dispStats()
	{
		
		
		
	}
	
	//blueprint
	
	public Item(String n, String t, int maxHB, int strengthB, int defenceB, int toughnessB, int speedB, String d, boolean o, boolean e)
	{
		
		name = n;
		type = t;
		maxHealthBoost = maxHB;
		strengthBoost = strengthB;
		defenceBoost = defenceB;
		toughnessBoost = toughnessB;
		speedBoost = speedB;
		description = d;
		owned = o;
		equiped = e;
		
	}
	
	//getters
	
	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

	public int getMaxHealthBoost()
	{
		return maxHealthBoost;
	}

	public int getStrengthBoost()
	{
		return strengthBoost;
	}

	public int getDefenceBoost()
	{
		return defenceBoost;
	}

	public int getToughnessBoost()
	{
		return toughnessBoost;
	}

	public int getSpeedBoost()
	{
		return speedBoost;
	}

	public boolean isOwned()
	{
		return owned;
	}

	public boolean isEquiped()
	{
		return equiped;
	}
	
	//setters
	
	public void setOwned(boolean owned)
	{
		
		this.owned = owned;
		
	}
	
	public void setEquiped(Character character, boolean equiped)
	{
		
		this.equiped = equiped;
		
		if(equiped == true)
		{
			
			character.setMaxHealth(character.getMaxHealth() + this.getMaxHealthBoost());
			character.setStrength(character.getStrength() + this.getStrengthBoost());
			character.setDefence(character.getDefence() + this.getDefenceBoost());
			character.setToughness(character.getToughness() + this.getToughnessBoost());
			character.setSpeed(character.getSpeed() + this.getSpeedBoost());
			
		}
		else if (equiped == false)
		{
			
			character.setMaxHealth(character.getMaxHealth() - this.getMaxHealthBoost());
			character.setStrength(character.getStrength() - this.getStrengthBoost());
			character.setDefence(character.getDefence() - this.getDefenceBoost());
			character.setToughness(character.getToughness() - this.getToughnessBoost());
			character.setSpeed(character.getSpeed() - this.getSpeedBoost());

			if (character.getHealth() > character.getMaxHealth())
			{
				
				character.setHealth(character.getMaxHealth());
				
			}
			
		}
		
	}
	
	public void loadEquiped(boolean equiped)
	{
		
		this.equiped = equiped;
		
	}

	
}
