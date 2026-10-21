package com.balia.MultiThreading;

class TicketSystem
{
	private int availableTicket =5 ;
	
	public synchronized void bookTicket(int noOfTickets)
	{
		while(noOfTickets > availableTicket)
		{
			System.err.println("Tickets are not available, Waiting for Cancellation");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		this.availableTicket = availableTicket - noOfTickets;
		IO.println(noOfTickets + " tickets are booked , Available tickets are:"+availableTicket);
		
	}
	
	public synchronized void cancelTicket(int noOfTickets)
	{
		this.availableTicket = availableTicket + noOfTickets;
		IO.println(noOfTickets+" tickets are cancelled , Available tickets are :"+this.availableTicket);
		notify();
	}
}

public class TicketBookind_Cancellation_UsingMultithreading_demo 
{
	public static void main(String[] args) 
	{
		TicketSystem t = new TicketSystem();
		
		Thread bookingThread = new Thread()
		{
			@Override
			public void run()
			{
				int [] tickets = {2, 4, 4};
				
				for(int ticket : tickets)
				{
					t.bookTicket(ticket);
					try
					{
					Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
			}
			
		};
		
		bookingThread.start();
		
		
		Thread cancellationThread = new Thread()
		{
			@Override
			public void run()
			{
				int [] tickets = {1, 3, 2};
				
				for(int ticket : tickets)
				{
					t.cancelTicket(ticket);
					
					try
					{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					
				}
			}
		};
		
		cancellationThread.start();
	}

}
