/*Assignment 03:
--------------
WAP to find sum of all the digits in a given number.
Example :
123  = 6
555  = 15
102  = 3
*/

void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number : "));
	int sum = sumOfDigits(number);
	IO.println("Total sum of "+number+" is : "+ sum);
}
int sumOfDigits(int num)
{
	int sum = 0;
	
	while(num != 0)
	{
		int digit = num%10;
		sum = sum + digit;
		num = num/10;
	}
	
	return sum;
}