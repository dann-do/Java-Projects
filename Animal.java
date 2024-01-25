//Submitted by Dan Do 
//Problem 1: Animal  

public abstract class Animal
{
	// Declaring instance varible
	private String type;	//this.type
	
	// Constructor: Creates a Animal instance with a given type
	public Animal(String type)
	{
		this.type = type;
	}
	
	// Returns the type of this animal
	public String getType()
	{
		return this.type;
	}
	
	// Moves this animal
	public abstract void move();
	
	// Returns as text representation the sound that this animal makes
	public abstract String call();
	
} //end superclass Animal