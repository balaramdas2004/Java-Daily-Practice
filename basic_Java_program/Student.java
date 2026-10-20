/*
 * Assignment - 03
================
Student Grade System :

Name of the BLC class : Student

       Name of method : calculateGrade()
      Access Modifier : public, static
            Parameter : one parameters of type double (double marks)
          Return type : String value (return grade of the Student) 
After calculation return the student grade using following criteria :

	if marks >= 90 return A+
	if marks >= 75 return A
	if marks >= 60 return B
	if marks >= 40 return C
	else return "Fail";

Create an ELC class called GradeCalculator with main method to test the application. Here take student marks as an input from the Scanner class.
---------------------------------------------------------------------------

 */

package blc;

public class Student {
	public static String calculateGrade( double mark)
	{
		if (mark >= 90 )
		{
			return "A+";
		}
		else if (mark >= 75 && mark < 90)
		{
			return "A";
		}
		else if (mark >= 60 && mark < 75)
		{
		    return "B";
		}
		else if(mark >= 40 && mark < 60)
		{
			return "C";
		}
		else
		{
		return "Fail";
		}
	
	}

}
