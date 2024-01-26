//Submitted by Dan Do 
//Problem 2: Employee  

public class HourlyEmployee extends Employee
{
	// Additional instance variable for this subclass
	private double hourlyRate;		//this.hourlyRate
	private double hoursWorked;		//this.hoursWorked
	
	// Constructor: Creates a HourlyEmployee constructor
	public HourlyEmployee(String name, double rate, double hours)
	{
		super(name); 	//calling superclass's constructor
		this.hourlyRate = rate;
		this.hoursWorked = hours;
	}
	
	// Implementing the abstract class from Employee superclass (concrete method)
	// Returns paycheck amount which is hourly rate * hours worked
	public double getPayment()
	{
		return (this.hourlyRate * this.hoursWorked);
	}
	
	@Override
	//  Returns employee text as %s, hourly:$%.02f% @ %.02f hours with name, rate, hours
	public String toString()
	{
		String employeeName = super.toString();
		
		return String.format("%s, hourly:$%.02f @ %.02f hours", employeeName, this.hourlyRate, this.hoursWorked);
	}
	
} //end subclass HourlyEmployee

