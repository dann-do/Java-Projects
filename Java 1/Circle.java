//Submitted by Dan Do 
//Problem 3: Shape  

public class Circle extends Shape
{
	// Additional instance variable for this subclass
	private double radius;	//this.radius
	
	// Constructor 1: Creates a Circle with given radius
	public Circle(double radius)
	{
		this.radius = radius;
		
	} //end constructor with given radius
	
	//Constructor 2: Creates a Circle with radius = 1
	public Circle()
	{
		this.radius = 1;
		
	} //end constructor with radius = 1
	
	@Override
	// Returns Math.PI * (radius)^2
	public double area()
	{
		return Math.PI * Math.pow(this.radius, 2); 
		
	} //end area() method
	
	// Returns 2 * Math.PI * radius
	public double perimeter()
	{
		return (2 * Math.PI * this.radius);
		
	} //end perimeter() method
	
	// Returns the String "Circle"
	public String toString()
	{
		return "Circle";
		
	} //end toString() method 
	
} //end subclass Circle