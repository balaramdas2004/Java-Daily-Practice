
/*Assignment 04:
--------------
WAP to find the smallest digit in a given number.
Example :
129  =  2
144  =  4
583  =  3*/


void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number : "));
	int smallDigit = getSmallDigits(number);
	IO.println("The Smallest digit of "+number+" is "+smallDigit);
}
int getSmallDigits(int num)
{
	int rev = 9;
	while (num != 0)
	{
		int digit = num%10;
		if(digit <= rev)
		{
			rev = digit;
			
		}
		num = num/10;
	}
	
	return rev;
}
