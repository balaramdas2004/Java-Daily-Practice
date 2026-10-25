/*
Assignment 07 :
---------------
WAP to print all the prime numbers from 1 to 100?
Example :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/

void main()
{
	int number = 100;

	for (int i=1;i<=number ;i++ )
	{
		if (getPrime(i))
		{
			IO.print(i + " ");
		}
	}
}
boolean getPrime(int num)
{
	if (num == 1)
	{
		return false;
	}
	for (int i=2;i<=num/2 ; i++)
	{
		if (num % i == 0)
		{
			return false;
		}
	}
	return true;
}