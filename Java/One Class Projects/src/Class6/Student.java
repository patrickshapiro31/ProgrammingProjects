/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

/**
 *
 * @author Patrick Shapiro
 */
public class Student
{
   private String firstName, lastName, rollName;
   private int grade1, grade2, grade3;
   double average;
   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String first, String last)
   {
      firstName = first;
      lastName = last;
      grade1 = 0;
      grade2 = 0;
      grade3 = 0;
   } 
         public Student(String first, String last, int num1)
   {
       firstName = first;
       lastName = last;
       grade1 = num1;
       grade2 = 0;
       grade3 = 0;   
   }
      public Student(String first, String last, int num1, int num2)
   {
       firstName = first;
       lastName = last;
       grade1 = num1;
       grade2 = num2;
       grade3 = 0;
   }
   
   public Student(String first, String last, int num1, int num2, int num3)
   {
       firstName = first;
       lastName = last;
       grade1 = num1;
       grade2 = num2;
       grade3 = num3;
   }

   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result; 

      result = firstName + " " + lastName + "\n";
      result += "Grade 1: " + grade1 + "\n";
      result += "Grade 2: " + grade2 + "\n";
      result += "Grade 3: " + grade3;
      result += "\nAverage: " + average + "\n";

      return result;
   }
   
   public void setTestScore(int testno, int testscore)
   {
       if (testno == 1)
           grade1 = testscore;
       if (testno == 2)
           grade2 = testscore;
       if (testno == 3)
           grade3 = testscore;
   }
   
   public double getAverage()
   {
       average = ((grade1 + grade2 + grade3) / 3.0);
       return average;
   }
   
   public String getroll()
   {
       rollName = (firstName + " " + lastName);
       return rollName;
   }
   
   
   
}
