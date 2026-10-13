package com.balia.exceptionHandling;

import java.util.Scanner;

class InvalidDepositException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDepositException(String message)
    {
        super(message);
    }
    
}
class Bank
{
    double balance;
    public Bank(double balance)
    {
        this.balance =balance;
    }

    public void deposite(double amount) throws InvalidDepositException
    {
        if(amount <=0)
        {
            throw new InvalidDepositException("Cannot deposit negative amount ");
        }

        balance +=amount;
        System.out.println("Deposit successful. Current balance: "+balance);
    }
}

public class ExceptionHandleingdemo8 {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();

        double amount = sc.nextDouble();
        
        Bank b = new Bank(balance);

        try
        {
            b.deposite(amount);
        }
        catch(InvalidDepositException e)
        {
            System.out.println("InvalidDepositException: "+e.getMessage()+ " "+amount);
        }
        sc.close();
    }
}
