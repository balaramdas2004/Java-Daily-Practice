void main()
{
	int number = Integer.parseInt(IO.readln("Enter the number : "));
	int count= getDigits(number);
	IO.println(count);
}
int getDigits( int num)
{
	int count = 0;
	while(num  != 0)
	{
		int digit = num%10;
		
		if(digit == 0)
		{
			num = num/10;
			continue;
			
		}
		
		else if(digit%2==0)
		{
			count++;
		}
		
		num = num/10; 
	}
	return count;
}