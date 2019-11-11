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
public class Class28 
{
    public static void main (String[] args)
    {
    int hours;
    int minutes;
    int seconds;
    final int CONVERT = 60;
    //The integer we're using to convert hours to minutes and minutes to seconds
    int total_seconds;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter number of hours: ");
    hours = scan.nextInt();
    System.out.print("Enter number of minutes: ");
    minutes = scan.nextInt();
    System.out.print("Enter number of seconds: ");
    seconds = scan.nextInt();
    
    total_seconds = ((hours * CONVERT * CONVERT) + (minutes * CONVERT) + seconds);
    
    System.out.println("Total number of seconds in " + hours + " hours, " +
            minutes + " minutes, and " + seconds + " seconds is...\n" +
            total_seconds + " seconds!");
    
    
    
    
    
    }
}
