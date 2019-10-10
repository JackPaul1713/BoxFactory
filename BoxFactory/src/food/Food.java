package food;

public class Food
{

	//variables
	
	private String name;
	private int cost;
	private int healing;
	
	//bluePrint
	
	public Food(String n, int c, int h)
	{
		
		name = n;
		cost = c;
		healing = h;
		
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
	
	//setters
	
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public void setHealing(int healing)
	{
		
		this.healing = healing;
		
	}
	
}
