/*
Assignment 05:
--------------
WAP to find the reverse of a number :
Example :
567  =  765
100  =  1
123  =  321*/

void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number : "));
	int reverse = reverseOfNumber(number);
	IO.println("Reverse of "+number+ " is "+reverse);
}
int reverseOfNumber(int num)
{
	int rev = 0;
	while (num != 0)
	{
		int digit = num%10;
		rev = rev*10 + digit;
		num = num/10;
	}
	
	return rev;
}