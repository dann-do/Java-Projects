//Submitted by Dan Do 
//Problem 1: Animal  

public class Dog extends Animal
{	
	// Constructor: Creates a Dog instance with "Dog" type
	public Dog()
	{
		super("Dog");
		
	} //end constructor
	
	@Override
	// Displays to console message: this animal's type + " runs"
	public void move()
	{
		System.out.println(getType() + " runs");
		
	} //end move() method 
	
	@Override
	// Returns as text "roof roof"
	public String call()
	{
		return "roof roof";
		
	} //end call() method
	
} //end subclass Dog