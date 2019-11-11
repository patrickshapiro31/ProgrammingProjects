/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

import java.util.Scanner;

public class Class111
{
//-----------------------------------------------------------------
// Counts the number of product codes that are entered with a
// zone of R and and district greater than 2000.
//-----------------------------------------------------------------

    public static void main(String[] args) throws StringTooLongException
    {
        int length;
        String input = " ";
        final int MAXLENGTH = 20;
        Scanner scan = new Scanner(System.in);
        while (!input.equals("done"))
        {
            System.out.print("Enter a string, no more than " + MAXLENGTH + " chars, or done to terminate\n");
            input = scan.nextLine();
            length = input.length();
            
            if ((length <= MAXLENGTH) && (!(input.equals("done"))))
            {
                System.out.println("'" + input + "' is a valid string)");
            }
            else if (!(input.equals("done")))
            {
                StringTooLongException problem = new StringTooLongException("String too long");
                throw problem;
            }
            
        }


    }
}

