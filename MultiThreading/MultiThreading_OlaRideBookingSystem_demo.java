package com.balia.MultiThreading;

class RideRequest extends Thread
{
    @Override
    public void run()
    {
        System.out.println("User requested a ride...");
        FareCalculation fare = new FareCalculation();
        fare.start();
        try
        {   
        	fare.join();
            Thread.sleep(2000);
            System.out.println("Searching for nearby drivers...");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class DriverAssignment extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(3000);
            System.out.println("Driver found and assigned!");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

class FareCalculation extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Calculating estimated fare...");
        try
        {
            Thread.sleep(1500);
            System.out.println("Estimated fare: 135.75 RS.");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

class LiveTracking extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1 ; i<= 5; i++)
        {
            System.out.println("Updating ride location... "+ i*20+"% completed");
        }
        System.out.println("Ride completed!");
    }

}

class PaymentProcessing extends Thread
{
    @Override
    public void run() 
    {
        System.out.println("Processing payment...");
        try
        {
            Thread.sleep(2000);
            System.out.println("Payment successful!");

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}

class RatingSystem extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Requesting user rating...");
        try
        {
            Thread.sleep(1000);
            System.out.println("User rated the ride: 5 star");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

public class MultiThreading_OlaRideBookingSystem_demo {
    public static void main(String[] args) 
    {
        RideRequest ride = new RideRequest();
        DriverAssignment drive = new DriverAssignment();
        
        LiveTracking live = new LiveTracking();
        PaymentProcessing payment = new PaymentProcessing();
        RatingSystem rate = new RatingSystem();

        ride.start();
        
        
        try
        {
        	ride.join();
        	
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        drive.start();
        try
        {
            drive.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        live.start();
        try
        {
            live.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        payment.start();
        try
        {
            payment.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        rate.start();
        try
        {
            rate.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
