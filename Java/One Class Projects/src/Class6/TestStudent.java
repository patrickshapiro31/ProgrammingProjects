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

public class TestStudent
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {

      Student john = new Student("John", "Snow", 100, 89, 75);

      Student marsha = new Student("Marsha", "Jones", 60, 78);
      
      Student dumb = new Student ("Dump", "Asbrix", 33);
      
      Student chelsea = new Student ("Chelsea", "Smith");
      
      john.getAverage();
      marsha.getAverage();
      chelsea.getAverage();
      

      System.out.println(john);
      System.out.println();
      System.out.println(marsha);
      System.out.println();
      System.out.println(dumb);
      System.out.println();
      System.out.println(chelsea);
      System.out.println();
      System.out.println("Setting Chelsea's scores");
      
      //Using the setTest function
      System.out.println();
      chelsea.setTestScore(1,100);
      chelsea.setTestScore(2, 95);
      chelsea.setTestScore(3, 89);
      chelsea.getAverage();
      System.out.println(chelsea);
      
      //Begin 7.3 -------------------------------------------------------
      
      Course classroom = new Course("Competitive Basket Weaving");
      System.out.println("_________________________________________________");
      System.out.println("Roll Call for Competitive Basket Weaving Class");
      System.out.println("_________________________________________________");
      classroom.Addstudent(john);
      classroom.Addstudent(marsha);
      classroom.Addstudent(dumb);
      classroom.Addstudent(chelsea);
      classroom.roll();
      System.out.println("Classroom Average Test Score: " + classroom.average());
      
      
   }
}

