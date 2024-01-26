//Submitted by Dan Do 
//Problem 4: ATM Banking

public class Account
{
	// Declaring instance variables
	private static int count;
	private String name;		//this.name
	private String pin;			//this.pin
	private int id;
	private double balance;
	
	// Constructor: Creates Account object with given name and pin. Set balance to 0 & set id to count, then increment count.
	public Account(String name, String pin)
	{
		this.name = name;
		this.pin = pin;
		balance = 0.0;
		id = count;
		count++;
		
	} //end constructor
	
	public double getBalance()
	{
		// Returns the dollar balance of this account
		return balance;
		
	} //end getBalance() method
	
	public int getID()
	{
		// Returns this account's id number
		return id;
		
	} //end getID() method
	
	public String getName()
	{
		// Returns the person's name associated with this account
		return this.name;
		
	} //end getName() method
	
	public boolean isPin(String attempt)
	{
		// Returns true if attempt matches pin otherwise false
		if (attempt.equals(this.pin))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	} //end isPin() method
	
	public void deposit(double amount)
	{
		// Adds (deposit) amount to balance provided it is a positive value.
		if (amount > 0 )
		{
			balance += amount;
		}
		
	} //end deposit() method
	
	public double withdraw(double amount)
	{
		//Subtracts (withdraw) amount from balance provided it is positive value and less than balance
		if (amount > 0 && amount < balance)
		{
			balance -= amount;
		}
		
		return balance;
		
	} //end withdraw() method
	
	public String toString()
	{
		// Returns a text representation of this account, formatted as:
		// "Name: %s, Account ID: %d, Balance: $%.02f"
		
		String statement = String.format("Name: %s, Account ID: %d, Balance: $%.02f", this.name, id, balance);
		
		return statement;
		
	} //end toString()
	
	
} //end class