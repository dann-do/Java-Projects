//Submitted by Dan Do 
//Problem 1: Animal  

public class Fish extends Animal
{	
	// Constructor: Creates a Fish instance with "Fish" type 
	public Fish()
	{
		super("Fish");
		
	} //end constructor
	
	@Override
	// Displays to console message: this animal's type + " swims"
	public void move()
	{
		System.out.println(getType() + " swims");
		
	} //end move() method 
	
	@Override
	// Returns as text "glub glub"
	public String call()
	{
		return "glub glub";
		
	} //end call() method
	
} //end subclass Fish