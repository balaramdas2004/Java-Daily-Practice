
/*Assignment 06 :
---------------
WAP to find the factorial of a number.
Example :
5  = 120
4  = 24
0  = 1
*/

void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number :"));
	long factor = factorOfNumber(number);
	IO.println("Factor of "+number+" is :"+factor);
}
long factorOfNumber(int num)
{
	long temp = 1;
	for(int i = 1; i<=num; i++)
	{
		temp = temp*i;
		
	}
	return temp;
}