package objects;

import java.util.ArrayList;

import game.Loose;

public class Character
{

	//variables
	
	private final String name;
	
	private int money;
	private int health;
	
	private int maxHealth;
	private int strength;
	private int defence;
	private int toughness;
	private int speed;
	
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Food> foods = new ArrayList<Food>();
	private ArrayList<Junk> junk = new ArrayList<Junk>();
	
	//blueprint
	
	public Character(String n, int m, int h, int maxH, int stre, int d, int t, int spe, ArrayList<Item> i, ArrayList<Food> f, ArrayList<Junk> j)
	{
		
		name = n;
		
		money = m;
		health = h;
		
		maxHealth = maxH;
		strength = stre;
		defence = d;
		toughness = t;
		speed = spe;
		
		items = i;
		foods = f;
		junk = j;
		
	}

	//getters
	
	public String getName()
	{
		return name;
	}

	public int getMoney()
	{
		return money;
	}
	
	public int getHealth()
	{
		return health;
	}

	public int getMaxHealth()
	{
		return maxHealth;
	}

	public int getStrength()
	{
		return strength;
	}

	public int getDefence()
	{
		return defence;
	}

	public int getToughness()
	{
		return toughness;
	}

	public int getSpeed()
	{
		return speed;
	}
	
	public ArrayList<Item> getItems()
	{
		return items;
	}
	
	public ArrayList<Food> getFoods()
	{
		return foods;
	}
	
	public ArrayList<Junk> getJunk()
	{
		return junk;
	}
	
	//setters
	
	public void setMoney(int money)
	{
		this.money = money;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void setMaxHealth(int maxHealth)
	{
		this.maxHealth = maxHealth;
	}
	
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	
	public void setDefence(int defence)
	{
		this.defence = defence;
	}
	
	public void setToughness(int toughness)
	{
		this.toughness = toughness;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
	
	public void setFoods(ArrayList<Food> foods)
	{
		this.foods = foods;
	}
	
	public void setJunk(ArrayList<Junk> junk)
	{
		this.junk = junk;
	}
	
}
