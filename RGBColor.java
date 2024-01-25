//Submitted by Dan Do 
//Problem 2: RGBColor

public class RGBColor
{
	// Declaring instance variables
	private int red;
	private int green;
	private int blue;
	
	// Constructor: Creates an RGBColor object with the given red, green, blue values.
	public RGBColor(int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	} //end constructor
	
	public int getRed()
	{
		// Returns this object’s red value.
		return this.red;
	}
	
	public int getGreen()
	{
		// Returns this object’s green value.
		return this.green;
	}
	
	public int getBlue()
	{
		// Returns this object’s blue value.
		return this.blue;
	}
	
	public boolean equals(RGBColor other)
	{
		// Returns true if the RGBColor’s colors all are the same values.
		if (this.red == other.red && this.green == other.green && this.blue == other.blue)
		{
			return true;
		}
		
		// Returns false otherwise.
		return false;
		
	} //end equals() method
	
	public String toString()
	{
		// Returns the String representation of the RGBColor object as: rgb(red, green, blue)
		// where red, green, and blue are their respective integer values.
		
		// rgb(red, green, blue) --> Output: rgb(99,16,0)
		return String.format("rgb(%d,%d,%d)", this.red, this.green, this.blue);
		
	} //end toString() method
	
	public String toHex()
	{
		// Returns the String representation of the RGBColor object as: #redgreenblue
		// where red, green, and blue are the hex values.
		
		// String.format() converts an integer to its hexadecimal equivalent using: %x
		// String.format() allows us to pad the empty space with zeros by a set amount
		// (here the amount is 2) by saying %02x
		
		//#redgreenblue  ---> Output: #631000
		return String.format("#%02x%02x%02x", this.red, this.green, this.blue);
		
	} //end toHex() method
	
	
} //end class