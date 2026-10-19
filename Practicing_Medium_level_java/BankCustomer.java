package com.balia.Opp2;

public class BankCustomer 
{
	public static void main(String []Args)
	{
		Customer c1 = new Customer();
		
		String name = IO.readln("Enter customer name:");
		int accNumber= Integer.parseInt(IO.readln("enter accountNumber:"));
		double balance = Double.parseDouble(IO.readln("Enter deposit amount:"));
		c1.setCustomerDetails(name, accNumber, balance);
		IO.println("Customer account created successfully! ");
		
		while(true)
		{
			IO.println("===== MENU =====");
			IO.println("1. Deposit");
			IO.println("2. Withdraw");
			IO.println("3. Check Balance");
			IO.println("4. Display Customer Details");
			IO.println("5. Exit");
			int choice = Integer.parseInt(IO.readln("Enter your Choice:"));
			
			
			switch(choice)
			{
			case 1 ->
			{
				IO.println("===============Welcome to ICICI Bank================");
				double balance1 = Double.parseDouble(IO.readln("Enter deposit amount:"));
				c1.deposit(balance1);
				
				IO.println("Deposit Successful!! "+balance1+" credited.");
				
			}
			
			case 2 ->
			{
				IO.println("===============Welcome to ICICI Bank================");
				double balance1 = Double.parseDouble(IO.readln("Enter Witdrawal amount:"));
				c1.withdraw(balance1);
				
				IO.println("Witdrawal Successful!! "+balance1+" debited.");
				
			}
			
			case 3 ->
			{
				IO.println("Current balance:"+ c1.getCurrentBalance());
				
			}
			case 4 ->
			{
				IO.println("Customer "+c1.displayDetails());
			}
			case 5 ->
			{
				IO.println("Thank you for banking with ICICI Bank!");
				return;
			}
			default -> IO.println("Invalid choice");
			}
		}
		
		
		
		
		
	}

}

class Customer
{
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	public static String bankName ="ICICI Bank Hydrabad";
	public static String bankAddress= "Ameerpet";
	public static String bankIFSCCode="ICI0002468";
	
	public void setCustomerDetails(String name,int accNumber, double balance )
	{
		customerName = name;
		accountNumber = accNumber;
		currentBalance = balance;
		
		if ( currentBalance <= 0)
		{
			System.err.println("Insufficient balance ");
			System.exit(0);
		}
		
	}
	
	public void withdraw(double amount)
	{
		if (amount > currentBalance)
		{
			System.err.println("You have insufficient balance");
			//System.exit(0);
		}
		else 
		{
			currentBalance -= amount;
		}
	}
	
	public void deposit(double amount)
	{
		if(amount <= 0)
		{
			System.err.println("Error");
			//System.exit(0);
		}
		else 
		{
			currentBalance += amount;
		}
	}
	
	public double getCurrentBalance()
	{
		return currentBalance;
	}
	
	public String displayDetails()
	{
		return "[Name="+customerName+", AccountNumber="+accountNumber+",Balance="+currentBalance+"]";
	}
	
}
