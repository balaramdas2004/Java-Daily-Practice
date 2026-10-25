/*
WAP to verify whether a number is Strong or not ?
Example : 
145  = true
*/

void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number : "));
	
	boolean strong = isStrongNumber(number);
	IO.println("Is "+number+" strong number :"+ strong);
}
boolean isStrongNumber(int num)
{
	int temp = num;
	int sum = 0;
	while (num != 0)
	{
	int digit = num%10;
	sum = sum  + factorOfNumber(digit);
	num= num/10;
	}
	return sum == temp;
}
int factorOfNumber(int num)
{
	int fact = 1;
	for (int i = 1;i<=num ;i++ )
	{
		fact = fact*i;
	}
	return fact;
}