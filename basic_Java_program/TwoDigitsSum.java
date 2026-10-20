
/*
 Sum Of Digits program []
 
Name of the BLC class : TwoDigitsSum [Inside blc package]
       Name of method : getSumOfDigits()
      Access Modifier : public, static
            Parameter : one parameter of type integer
          Return type : an integer value
For example :
If the given value is 34, return 7

  */

package blc;

public class TwoDigitsSum 
{
		public static int sumNumber(int num )
		{
			int sum =0;
			while(num!=0)
			{
			int digits = num % 10;
			sum = sum+ digits;
			num = num/ 10;
			}
			return sum;
		}
}
