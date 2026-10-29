package com.balia.collection;

import java.util.Vector;

record Items(int itemId, String itemName, int quantity, double pricePerUnit)
{
    @Override
    public String toString()
    {
        return itemId + " " + itemName + " " + quantity + " " + pricePerUnit;
    }
}

public class VectorDemo_ShoppingCartManager_add_noOfItem_TotalItemPurchageAndTotalBill {
    public static void main(String[] args)
    {
        String input = IO.readln();
        if (input == null) {
            return;
        }

        int noOfItems = Integer.parseInt(input);
        Vector<Items> v = new Vector<>(noOfItems);

        for (int i = 0; i < noOfItems; i++)
        {
            String id = IO.readln();
            if (id == null) return;
            int itemId = Integer.parseInt(id);

            String itemName = IO.readln();
            if (itemName == null) return;

            String qty = IO.readln();
            if (qty == null) return;
            int quantity = Integer.parseInt(qty);

            if (quantity <= 0) 
            {
                IO.println("Quantity must be greater than 0");
                return;
            }

            String price = IO.readln();
            if (price == null) return;
            double pricePerUnit = Double.parseDouble(price);

            if (pricePerUnit <= 0) {
                IO.println("Price must be greater than 0");
                return;
            }

            v.add(new Items(itemId, itemName, quantity, pricePerUnit));
        }

        IO.println("Items in Cart: " + v.size());

        double total = 0.0;

        for (Items item : v)
        {
            IO.println(item);
            total += item.quantity() * item.pricePerUnit();
        }

        IO.println("Total Bill Amount: " + total);
    }
}
