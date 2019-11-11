/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

import java.util.Scanner;

/**
 *
 * @author Patrick Shapiro
 */
public class Class62 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input;
        char currentchar;
        int length; 
        int count = 0;
        
        System.out.println("Enter some text.");
        input = scan.nextLine();
        length = input.length();
        System.out.println();
        
        while (count < length)
        {
            currentchar = input.charAt(count);
            System.out.println(currentchar);
            count++;  
        }

    }
}
