//Submitted by Dan Do 
//Problem 5: Monster Factory

public class Monster
{
	// Declaring instance variables
	private String name;	//this.name
	private int health;		//this.health
	private int strength;	//this.strength
	private int xp;			//this.xp
	
	// Constructor: Creates Monster object with given name, health, strength, and xp.
	public Monster(String name, int health, int strength, int xp)
	{
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.xp = xp;
		
	} //end constructor
	
	public String getName()
	{
		// Returns this monster's name
		return this.name;
		
	} //end getName() method
	
	public int getHealth()
	{
		// Returns this monster's health
		return this.health;
		
	} //end getHealth() method
	
	public int getStrength()
	{
		// Returns this monster's strength
		return this.strength;
		
	} //end getStrength() method
	
	public int getXP()
	{
		// Returns this monster's experience
		return this.xp;
		
	} //end getXP() method
	
	public void attack(Player hero)
	{
		// Monster attacks player, where player takes damage equal to monster strength. 
		// Monster's attack() should invoke player's takeDamage() method.
		// Display message: "%s attacks player for %d damage", name, strength
		
		int damage = this.strength;
		hero.takeDamage(damage);
		
		System.out.printf("%s attacks player for %d damage", this.name, this.strength);
		
	} //end attack() method
	
	public static Monster spawn(String type)
	{
		// Returns a monster object of given type for "goblin", "orc", or "troll"
		if (type.equals("goblin"))
		{
			return new Monster("goblin", 60, 8, 1);
		}
		else if (type.equals("orc"))
		{
			return new Monster("orc", 100, 12, 3);
		}
		else if (type.equals("troll"))
		{
			return new Monster("troll", 150, 15, 5);
		}
		else
		{
			return null;
		}
		
	} //end spawn() method
	
	public void takeDamage(int damage)
	{
		// Health is decreased by given damage, but can't be a negative
		if (damage > 0)
		{
			this.health -= damage;
			
			if (health < 0)
			{
				health = 0;
			}
		}
		
	} //end takeDamage() method
	
	public String toString()
	{
		// Returns a text representation of this account, formatted as:
		// [name] HP: # of health, STR: # of strength
		// AP = STR (AP is used to turn in Autolab)
		
		String output = String.format("[%s] HP:%d, AP:%d", this.name, this.health, this.strength);

		return output;
		
	} //end toString() method
	
	
} //end class