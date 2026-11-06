package com.balia.collection;

import java.util.HashMap;
import java.util.Objects;

class Customer
{
	private Integer id;
	private String name;
	
	public Customer(Integer id, String name)
	{
		super();
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name = " + name + "] ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}

public class HashMap_why_compalsory_Override_equals_and_Hashcode_Method {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer(111, "Scott");
		Customer c2 = new Customer(111, "Scott");
		
		IO.println(c1.equals(c2));
		IO.println(c1.hashCode()+" "+c2.hashCode());
		
		HashMap<Customer, String> map = new HashMap<>();
		
		map.put(c1, " Pune");
		map.put(c2, " Nagpur");
		
		IO.println("Size is: "+map.size());
		IO.println(map);

	}

}
