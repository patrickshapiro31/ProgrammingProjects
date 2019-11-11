/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class5;

import java.util.Scanner;

/**
 *
 * @author patrick.shapiro
 */
public class Chap51
{

    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);



        LeapYear FiveOne;
        FiveOne = new LeapYear();
        int year;
        String input;
        Boolean complete, isleapyear;

        
//5.1__________________________________________________________________________

                System.out.println("----------Class 5.1----------\n");
                complete = false;
                isleapyear = false;
                while (complete == false)
                {

                    System.out.println("Enter a year (non numeric values will be ignored)");
                    input = scan.nextLine();
                    year = Integer.parseInt(input.replaceAll("[^0-9]", ""));
                    if (year <= 1581)
                    {
                        System.out.println("Error, " + year + " is an invalid year");
                    } 
                    else
                    {
                        isleapyear = FiveOne.GetLeap(year);

                        if (isleapyear == true)
                        {
                            System.out.println(year + " is a leap year!");
                        } 
                        else
                        {
                            System.out.println(year + " is NOT a leap year!");
                        }

                        System.out.println("Enter another year? Y/N");
                        input = scan.nextLine();
                        input = input.toLowerCase();

                        if ("y".equals(input))
                        {
                            complete = false;
                        } 
                        else
                        {
                            complete = true;
                        }

                    }
                }
    }
}
