//Submitted by Dan Do 
//Problem 2: Employee  

public class SalaryEmployee extends Employee
{
	// Additional instance variable for this subclass
	private double salary;	//this.salary
	
	// Constructor: Creates a SalaryEmployee constructor
	public SalaryEmployee(String name, double salary) 
	{
		super(name); 	//calling superclass's constructor
		this.salary = salary;
	}
	
	// Implementing the abstract class from Employee superclass (concrete method)
	// Returns paycheck amount which is salary / 12 months / 2x a month
	public double getPayment()
	{
		return (this.salary / 12) / 2;
	}
	
	@Override
	// Returns employee text as %s, salary:$%.02f with name and salary
	public String toString()
	{
		String employeeName = super.toString();
		
		return String.format("%s, salary:$%.02f", employeeName, this.salary);
	}
	
} //end subclass SalaryEmployee

