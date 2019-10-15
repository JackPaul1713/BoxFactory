package objects;

public class Food
{

	//variables
	
	private final String name;
	private final int cost;
	private final int healing;
	private int quanity;
	
	//methods
	
	public void use(Character character)
	{
		
		if (this.getQuanity() >= 1)
		{
			
			character.setHealth(character.getHealth() + this.getHealing());
			
			if(character.getHealth() > character.getMaxHealth())
			{
				
				character.setHealth(character.getMaxHealth());
				
			}
			
		}
		
	}
	
	public void dispStats()
	{
		
		
		
	}
	
	//blueprint
	
	public Food(String n, int c, int h, int q)
	{
		
		name = n;
		cost = c;
		healing = h;
		quanity = q;
		
	}

	//getters
	
	public String getName()
	{
		return name;
	}

	public int getHealing()
	{
		return healing;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public int getQuanity()
	{
		return quanity;
	}
	
	//setters
	
	public void setQuanity(int quanity)
	{
		this.quanity = quanity;
	}
	
}
