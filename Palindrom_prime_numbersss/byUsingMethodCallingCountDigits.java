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
		count ++ ;
		num = num/10; 
	}
	return count;
}