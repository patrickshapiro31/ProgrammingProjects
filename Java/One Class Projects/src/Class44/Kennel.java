/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class44;
import java.util.Scanner;

/**
 *
 * @author patrick.shapiro
 */
public class Kennel
{
   public static void main (String[] args)
   {
   String dogname;
   Scanner scan = new Scanner(System.in);
   Dog dog1, dog2, dog3, dog4, dog5;
   dog1 = new Dog();
   dog2 = new Dog();
   dog3 = new Dog();
   dog4 = new Dog();
   dog5 = new Dog();
   
   System.out.println("Your girlfriend adopted a dog! What's it's name? ");
   dogname = scan.nextLine();
   dog1.Createdog(dogname);
   
   System.out.println("Your girlfriend adopted another dog! What's it's name? ");
   dogname = scan.nextLine();
   dog2.Createdog(dogname);
   
   System.out.println("Your girlfriend adopted yet another! What's it's name? ");
   dogname = scan.nextLine();
   dog3.Createdog(dogname);
   
   System.out.println("Your girlfriend keeps adopting dogs! What's this one's name? ");
   dogname = scan.nextLine();
   dog4.Createdog(dogname);
   
   System.out.println("You dumped your girlfriend because of her dog addiction. Name one more. ");
   dogname = scan.nextLine();
   dog5.Createdog(dogname);
   
   dog1.Printdog();
   dog2.Printdog();
   dog3.Printdog();
   dog4.Printdog();
   dog5.Printdog();
   System.out.println("\n");
   
   } 
}
