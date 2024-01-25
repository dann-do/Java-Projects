//Submitted by Dan Do 
//Problem 2: Employee  

public class CommissionEmployee extends Employee
{
	// Additional instance variable for this subclass
	private double commissionRate;	//this.commissionRate
	private double totalSales;		//this.totalSales
	
	// Constructor: Creates a CommissionEmployee constructor
	public CommissionEmployee(String name, double rate, double sales) 
	{
		super(name); 	//calling superclass's constructor
		this.commissionRate = rate;
		this.totalSales = sales;
	}
	
	// Implementing the abstract class from Employee superclass (concrete method)
	// Returns paycheck amount which is commission rate * total sale
	public double getPayment()
	{
		return (this.commissionRate * this.totalSales);
	}
	
	@Override
	// Returns employee text as %s, commission:%.02f% @ $%.02f sales with name, rate, sales
	public String toString()
	{
		String employeeName = super.toString();
		
		return String.format("%s, commission:%.02f%% @ $%.02f sales", employeeName, this.commissionRate, this.totalSales);
	}
	
} //end subclass CommissionEmployee

