//Submitted by Dan Do 
//Problem 3: Point2D

public class Point2D
{
	// Declaring instance variables
	private double x;	//this.x
	private double y;	//this.y
	
	// Constructor: Creates a Point2D object from two double values.
	public Point2D(double x, double y)
	{
		this.x = x;
		this.y = y;
		
	} //end constructor
	
	public double getX()
	{
		// Returns this point's x-coordinate
		return this.x;
		
	} //end getX() method
	
	public double getY()
	{
		// Returns this point's y-coordinate.
		return this.y;
		
	} //end getY() method
	
	public double distance(Point2D other)
	{
		// Returns the distance between between two points, uses the distance formula.
		// distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
		
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.x, 2));
		
	} //end distance() method
	
	public void moveBy(double dx, double dy)
	{
		// Moves point by dx units on x-axis & dy units on y-axis
		this.x += dx;
		this.y += dy;
		
	} //end moveBy() method
	
	public void moveTo(double x, double y)
	{
		// Moves point to new position with given x, y values
		this.x = x;
		this.y = y;
		
	} //end moveTo() method
	
	public String toString()
	{
		// Returns a text representation of this point formatted as: (x,y)
		// Decimal precision should be limited to the tenths place.
		
		String output = String.format("(%.1f,%.1f)", this.x, this.y);
		
		return output;
		
	} //end toString() method
	
} //end class