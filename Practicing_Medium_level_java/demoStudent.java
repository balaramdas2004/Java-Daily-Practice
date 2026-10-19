package com.balia.Opp2;

//ELC

public class demoStudent
{
  public static void main() 
  {
      Student s1 = new Student();
      int id = Integer.parseInt(IO.readln("Enter the Student ID :"));
      String name = IO.readln("Enter the name :");
      int marks = Integer.parseInt(IO.readln("Enter t he marks :"));

      s1.setStudentsData(id , name, marks);
      s1.calculateGrade();
      IO.println(s1.displayDetails());

  }
}
class Student 
{
  int studentId;
  String studentName;
  int studentMarks;
  char studentGrade;

  public void setStudentsData(int id , String name, int marks)
  {
      studentId = id;
      studentName = name;
      studentMarks = marks;
      studentGrade = calculateGrade();
  }

  public char calculateGrade()
  {
      if ( studentMarks > 90)
      {
        return 'A'; 
      }
      else if (studentMarks >= 81 && studentMarks <= 90)
      {
    	  return 'B';
      }
      else if (studentMarks >= 71 && studentMarks <= 80)
      {
    	  return 'C';
          
      }
      else if (studentMarks >= 61 && studentMarks <= 70)
      {
    	  return 'D';

      }
      else 
      {
    	  return 'E';

      }
  }

  public String displayDetails()
  {
      return "Student [name="+ studentName + ", studentId="+studentId+", marks="+studentMarks+ ",grade="+ studentGrade+"]" ;
  }
}

