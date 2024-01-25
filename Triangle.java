//Submitted by Dan Do 
//Problem 3: Shape  

public class Triangle extends Shape
{
	// Additional instance variable for this subclass
	private double a;	//this.a
	private double b;	//this.b
	private double c;	//this.c

	// Constructor 1: Creates a Triangle with given sides a, b, c
	public Triangle(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
	} //end constructor with given sides a, b, c
	
	//Constructor 2: Creates a Triangle with all sides = 1
	public Triangle()
	{
		this.a = 1;
		this.b = 1;
		this.c = 1;
		
	} //end constructor with all sides = 1
	
	@Override
	//  Returns area of triangle using heron's formula
	public double area()
	{
		return Math.sqrt(((a+b+c)/2) * (((a+b+c)/2) - this.a) * (((a+b+c)/2) - this.b) * (((a+b+c)/2) - this.c)); 
		
	} //end area() method
	
	// Returns a + b + c
	public double perimeter()
	{
		return this.a + this.b + this.c;
		
	} //end perimeter() method
	
	//  Returns the String "Triangle"
	public String toString()
	{
		return "Triangle";
		
	} //end toString() method 
	
} //end subclass Triangle