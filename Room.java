//Submitted by Dan Do 
//Problem 2: Dungeon Crawl

public class Room
{
	// Declaring instance variables
	private String name;			//this.name
	private String description;		//this.description	
	private Room north;
	private Room east;
	private Room west;
	private Room south;
	
	// Constructor that creates a Room object from two Strings
	public Room(String name, String description)
	{
		this.name = name;
		this.description = description;
		
	} //end constructor
	
	public String getName()
	{
		// Returns a String with this room's name.
		return name;
		
	} //end getName()
	
	public void setExits(Room n, Room e, Room w, Room s)
	{
		//Sets all four exits for this room: north, east, west, south
		north = n; 
		east = e;
		west = w;
		south = s;
		
	} //end setExits()
	
	public String getExits()
	{
		// Returns a String of this room's exits with both the exit direction & the room's name 
		// Print: [N]orth: 
		//        [E]ast:
		//        [W]est:
		//        [S]outh:
		
		String exits = "";
		
		//Checking if there's a north exit and if yes, output [N]orth:
		if (north != null)
		{
			exits += "[N]orth: " + north.getName() + "\n";
		}
		
		//Checking if there's a east exit and if yes, output [E]ast:
		if (east != null)
		{
			exits += "[E]ast: " + east.getName() + "\n";
		}
		
		//Checking if there's a west exit and if yes, output [W]est:
		if (west != null)
		{
			exits += "[W]est: " + west.getName() + "\n";
		}
		
		//Checking if there's a south exit and if yes, output [S]outh:
		if (south != null)
		{
			exits += "[S]outh: " + south.getName() + "\n";
		}
		
		return exits;
		
	} //end getExits()
	
	public Room getNorth()
	{
		//  Returns the room north of this one, if no such room exists, then null is returned
		return north;
		
	} //end getNorth()
	
	public Room getSouth()
	{
		//  Returns the room south of this one, if no such room exists, then null is returned
		return south;
		
	} //end getSouth()
	
	public Room getWest()
	{
		//  Returns the room west of this one, if no such room exists, then null is returned
		return west;
		
	} //end getWest()
	
	public Room getEast()
	{
		//  Returns the room east of this one, if no such room exists, then null is returned
		return east;
		
	} //end getEast()
	
	public String toString()
	{
		// Returns a text representation of this room with name, description, and exits
		// Print: [Hall]
		//        Its Dark.
		//		  [N]orth: Bed
		
		String roomOutput = "[" + name + "]\n";     // [Hall]
		roomOutput += description + "\n";			// Its Dark.
		roomOutput += getExits();					// [N]orth: Bed
		
		return roomOutput;
		
		
	} //end toString()
	
	
	

	
	
} //end class