//Submitted by Dan Do 
//Problem 1: Animal  

public class Bird extends Animal
{	
	// Constructor: Creates a Bird instance with "Bird" type 
	public Bird()
	{
		super("Bird");
		
	} //end constructor
	
	@Override
	// Displays to console message: this animal's type + " flies"
	public void move()
	{
		System.out.println(getType() + " flies");
		
	} //end move() method 
	
	@Override
	// Returns as text "chirp chirp"
	public String call()
	{
		return "chirp chirp";
		
	} //end call() method
	
} //end subclass Bird