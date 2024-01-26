//Submitted by Dan Do 
//Problem 3: Shape  

public class Rectangle extends Shape
{
	// Additional instance variable for this subclass
	private double width;	//this.width
	private double length;	//this.length
	
	// Constructor 1: Creates a Rectangle with given length, width
	public Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
		
	} //end constructor with given length, width
	
	//Constructor 2: Creates a Rectangle with width = 1, length = 1
	public Rectangle()
	{
		this.width = 1;
		this.length = 1;
		
	} //end constructor with width = 1, length = 1
	
	@Override
	// Returns width * length
	public double area()
	{
		return this.width * this.length; 
		
	} //end area() method
	
	// Returns 2 * ( width + length)
	public double perimeter()
	{
		return 2 * (this.width + this.length);
		
	} //end perimeter() method
	
	//  Returns the String "Rectangle"
	public String toString()
	{
		return "Rectangle";
		
	} //end toString() method 
	
} //end subclass Rectangle