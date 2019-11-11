/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

import java.util.Scanner;

/**
 *
 * @author patrick.shapiro
 */
public class Class86
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int acctnm, inputnum;
        double moneynum;
        final double FEE = 2.00;
        boolean run = true;
        boolean inacct = true;
        String input, inputcommand;
        
        Account[] acct =
        {
            new Account("Patrick Shapiro", 0, 1310872.56), 
            new Account("Veronica Royale", 1, 86691.40),
            new Account("Rachel Ahrens", 2, 9034.42),
            new Account("Thommas Ahrens", 3, 23149.95), 
            new Account("Laura Ahrens", 4, 22004.15),
            new Account("Aaron Crowne", 5, 39463.52), 
            new Account("Nami Forges", 6, 9552.10), 
            new Account("Alex Forges", 7, 33721.02),
            new Account("Brian Something", 8, 43204.52), 
            new Account("Chelsea Smith", 9, 37211.02), 
            new Account("The Evil Pi", 10, 42595.32),
            new Account("Dark Lord Typhoon", 11, 20630.24),
            new Account("Markus Thane", 12, 38861.42),
            new Account("Violet Foucher", 13, 1310.56),
            new Account("Kyle Newman", 14, 36156.81),
            new Account("Suzan Tanner", 15, 5116.10),
            new Account("Ricardo Samson", 16, 8941.98),
            new Account("Alphonso Bravado", 17, 43408.34),
            new Account("Lady Gustaph", 18, 33818.69),
            new Account("Sophie Chandismash", 19, 32329.07),
            new Account("Alexander Gustaph", 20, 34198.04),
            new Account("Sally Gustaph", 21, 666.66),
            new Account("Catheo Gustaph", 22, 33589.69),
            new Account("Kilgor Stabbington", 23, 20143.23),
            new Account("Kingsley Eagoe", 24, 7521.94),
            new Account("Vivienne Winslow", 25, 8708.30),
            new Account("Filia Eagoe", 26, 29916.73),
            new Account("Ingrid Tessa", 27, 9632.86),
            new Account("Kirtap Starscream", 28, 0),
            new Account("Dark Lord Sterma", 29, 804.16)
        };
        System.out.println("Moderator Account number is 31 (Pays out Interest)");
        
        while (run == true)
        {
            System.out.println("Enter the Account number to access (0-29)");
            input = "";
            input = scan.nextLine();
            acctnm = Integer.parseInt(input.replaceAll("[^0-9]", ""));
            inacct = true;
            
            if ((acctnm >= 0) && (acctnm <= 29))
            {
                System.out.println("Welcome " + acct[acctnm].getName() + "!");
                while (inacct == true)
                {
                    
                    System.out.println("Account Details");
                    System.out.println("_____________________________________");
                    System.out.println(acct[acctnm]);
                    System.out.println("\nWhat would you like to do?");
                    System.out.println("Type: Withdraw, Deposit, or exit");
                    input = scan.nextLine();
                    input = input.toLowerCase();
                    
                    if (input.compareTo("withdraw") == 0)
                    {
                       System.out.println("Enter the amount to withdraw");
                       inputcommand = scan.nextLine();
                       moneynum = Integer.parseInt(inputcommand.replaceAll("[^0-9]", ""));
                       acct[acctnm].withdraw(moneynum, FEE);
                       System.out.println("Transaction Complete");
                    }
                    else if (input.compareTo("deposit") == 0)
                    {
                       System.out.println("Enter the amount to deposit");
                       inputcommand = scan.nextLine();
                       moneynum = Integer.parseInt(inputcommand.replaceAll("[^0-9]", ""));
                       acct[acctnm].deposit(moneynum);
                       System.out.println("Transaction Complete");
                    }
                    else if (input.compareTo("exit") == 0)
                    {
                        inacct = false;
                    }
                    
                }
            }
            else if (acctnm == 31)
            {
                for (int count = 0; count <= 29; count++)
                {
                    acct[count].addInterest();
                }
                System.out.println("Interest Paid");
            }
            else
            {
                System.out.println("Invalid Response");
            }
            
            System.out.println("Continue transactions? Y/N");
            input = scan.nextLine();
            input = input.toLowerCase();
                    
            if (input.compareTo("n") == 0)
            {
                run = false;
            }

            
        }
 
        
    }
}
