/*
Assignment 05:
--------------
WAP to verify whether a number is palindrome or not ?
Example :
121     = true
180     = false
12321   = true
*/

void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number : "));
	boolean reverse = isPalindromNumber(number);
	IO.println("number is palindrom :"+reverse);
}
boolean isPalindromNumber(int num)
{
	int rev = 0;
	int temp = num;
	while (num != 0)
	{
		int digit = num%10;
		rev = rev*10 + digit;
		num = num/10;
	}
	/*if (temp != rev)
	{
		return false;
	}*/
	return temp == rev;
}