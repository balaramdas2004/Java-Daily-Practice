package com.balia.AdvanceJava.day1;

public class ClassA 
{
	InterfaceA meth1()
	{
		return new InterfaceA()
		{
			public void msg1()
			{
				System.out.println("Java is Awesome");
			}
			public void msg2()
			{
				System.out.println("Java is Amezing!!");
			}
		};
	}

	public static void main(String[] args) 
	{
		ClassA aobj = new ClassA();
		InterfaceA iobj =aobj.meth1();
		iobj.msg1();
		iobj.msg2();

	}

}
