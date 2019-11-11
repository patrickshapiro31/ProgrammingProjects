/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.util.Scanner;

/**
 *
 * @author Patrick Shapiro
 */
public class Class24 
{
  public static void main (String[] args)
  {

    Scanner scan =  new Scanner(System.in);
    String name;
    String college;  
    String age;
    String petname;
    
    
    System.out.print("Please enter your name: ");
    name = scan.nextLine();
    System.out.print("Please enter your age: ");
    age = scan.nextLine();  
    System.out.print("Please enter your college name: ");
    college = scan.nextLine();
    System.out.print("Please enter your pet's name: ");
    petname = scan.nextLine();
    
    System.out.println("Hello, my name is " + name + " and I am " + age +
             " years old. I'm enjoying my time at " + college +
            ", though I miss my pet " + petname + " very much!");    
  
  

  
  
  }
}
