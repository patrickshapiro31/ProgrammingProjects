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
public class Class212
{
    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);    
    int squareside;
    int area;
    int peremeter;
    
    
        
        
        
    System.out.print("What is the length of the square's side? (Whole numbers only): ");
    squareside = scan.nextInt();
    area = squareside * squareside;
    peremeter = squareside * 4;
    System.out.println("A square with a side length of " + squareside +
            " has an area of " + area + " square units, and a peremeter of " + 
            peremeter + ".");
    
    
    
    }
    
    
    
    
}
