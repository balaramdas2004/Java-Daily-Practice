
/*
 * Program 01:
-----------
Format :
---------
ProductDemo.java (File name)
----------------------------
//ELC
public class ProductDemo
{
   void main()
    {
    }
}

//BLC
class Product
{
   //Properties
        +
   //Behaviour 
}


Write a Program on OOPs to define Product class properties and behaviour.

Properties/Field/Attribute :

productId : int
productName : String
productPrice : double

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setProductData(int id, String name, double price) : public void
getProductInfo() : public void
*/
//ELC

package com.balia.Opp2;

public class ProductDemo {
	public static void main()
	{
		Product ob = new Product();
		int id = Integer.parseInt(IO.readln("Enter the Id of the product: "));
		String name = IO.readln("Enter the name of the produt: ");
		double price = Double.parseDouble(IO.readln("Enter the price of the product: "));
		
		ob.setProductData(id ,name, price);
		ob.getInformation();
	}

}
//BLC
class Product
{
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData(int id, String name, double price)
	{
		productId = id;
		productName = name;
		productPrice = price;
	}
	public void getInformation()
	{
		IO.println("Product ID is :"+ productId);
		IO.println("Product Name is :"+ productName);
		IO.println("Product price is :"+ productPrice);
		
	}
	
}
