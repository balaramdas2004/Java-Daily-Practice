package com.balia.Opp2;

public class MobileDemo {
	public static void main()
	{
		Mobile brand = new Mobile();
		
		String name = IO.readln();
		int model =Integer.parseInt(IO.readln());
		double price = Double.parseDouble(IO.readln());
		brand.setMobileData(name, model, price);
		brand.showMobileData();
	}

}
class Mobile
{
	String mobileName;
	int mobileModel;
	double mobilePrice ;
	
	public void setMobileData(String name, int models, double price)
	{
		mobileName = name;
		mobileModel = models;
		mobilePrice = price;
		
	}
	public void showMobileData()
	{
		IO.println("MObile name is :"+ mobileName);
		IO.println("Mobile model s :"+ mobileModel);
		IO.println("Mobile price is :"+ mobilePrice);
	}
}
