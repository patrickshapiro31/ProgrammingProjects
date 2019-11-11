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
public class Class54
{

    public static void main(String[] args)
    {

        boolean complete = false;
        int guess, hilo;
        Scanner scan = new Scanner(System.in);
        String input;

        while (complete == false)
        {
            guess = 0;
            hilo = (int) (Math.random() * 100 + 1);

            System.out.println("Enter a whole number between 1 and 100 inclusive." + hilo);

            while (guess != hilo)
            {
                guess = scan.nextInt();
                scan.nextLine();

                if (guess > 100 || guess < 1)
                {
                    System.out.println("Guess out of bounds! Too high or low!");
                    System.out.println("Enter a whole number between 1 and 100 inclusive.");
                } 
                else if (guess > hilo)
                {
                    System.out.println("Too high, guess again!");
                } 
                else if (guess < hilo)
                {
                    System.out.println("Too low, guess again!");
                } 
                else if (guess == hilo)
                {
                    System.out.println("Congradulations, you win!");

                    System.out.println("Play again? Y/N");
                    input = scan.nextLine();
                    input = input.toLowerCase();

                    complete = !"y".equals(input);

                }

            }
        }

    }
}