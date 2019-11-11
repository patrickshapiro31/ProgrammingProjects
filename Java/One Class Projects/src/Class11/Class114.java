/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

import java.util.Scanner;

/**
 *
 * @author patrick.shapiro
 */
public class Class114
{


    public static void main(String[] args)
    {
        String input = " ";
        char firstletter;
        Scanner scan = new Scanner(System.in);

        while (!input.equals("done"))
        {
            try 
            {
                System.out.print("Enter document name (case sensitive) or type 'done' to quit: ");
                input = scan.nextLine();
                firstletter = input.charAt(0);
                
                    if (input.equals("done"))
                    {
                    
                    }
                    else if (firstletter == 'U' || firstletter == 'C' || firstletter == 'P')
                    {
                        System.out.println(input + " is a valid document name.");
                    }
                    else
                    {
                    InvalidDocumentCodeException problem = 
                            new InvalidDocumentCodeException("Invalid document code");
                    throw problem;   
                    }
            }
            catch(InvalidDocumentCodeException exception)
                {
                      System.out.println("Invalid document code");  
                }
                
        }


    }
}



