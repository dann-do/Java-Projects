//Submitted by Dan Do 
//Problem 2: Employee  

public abstract class Employee
{
	// Declaring instance variable
	private String name;	//this.name
	
	// Constructor: Creates an Employee instance with a given name
	public Employee(String name) 
	{
		this.name = name;
	}
	
	// Returns the wages for this employee ( i.e. a paycheck) 
	public abstract double getPayment();	//Abstract method declaration
	
	// Returns a string containing the name of the employee
	public String toString()
	{
		return this.name;
	}
	
} //end superclass

