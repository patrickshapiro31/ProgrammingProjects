
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrick.shapiro
 */
public class Numtest
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.println("My name is " + name);
        
        
        
        
        System.out.println("Results: " + (12 / 2));
        System.out.println("Results: " + (12.0 / 2.0));
        System.out.println("Results: " + (10 / 4));
        System.out.println("Results: " + (10 / 4.0));
        System.out.println("Results: " + (4 / 10));
        System.out.println("Results: " + (4.0 / 10));
        System.out.println("Results: " + (12 % 3));
        System.out.println("Results: " + (10 % 3));
        System.out.println("Results: " + (3 % 10));
        
        
        
        
    }
}
