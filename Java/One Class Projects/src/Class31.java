/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; 
import java.util.Random;
/**
 *
 * @author patrick.shapiro
 */
public class Class31
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String firstname, lastname, lastfive, answer;
      int number, lastnamelength;
      Random rand = new Random();
      char firstletter;
      

       System.out.println("Enter First Name: ");
       firstname = scan.nextLine();
       System.out.println("Enter Last Name: ");
       lastname = scan.nextLine();
       number = rand.nextInt(99) + 10;
       firstletter = firstname.charAt(0);
       lastnamelength = lastname.length();
       lastfive = lastname.substring(lastnamelength - 5);
       
       answer = (firstletter + " " + lastfive + " " + number + " ");
       System.out.println(answer);
       
 
   }
}
