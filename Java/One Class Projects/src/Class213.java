/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 * @author patrick.shapiro
 */
public class Class213
{
   public static void main (String[] args)
   {
   
   Scanner scan = new Scanner(System.in);
   int numerator;
   int denominator;
   double finalanswer;
   
   System.out.print("Please enter the numerator: ");
   numerator = scan.nextInt();
   System.out.print("Please enter the denominator: ");
   denominator = scan.nextInt();
   
   
   finalanswer = ( (double) numerator / denominator);
   System.out.print("The decimal value of " + numerator + "/" + denominator +
           " is " + finalanswer + "\n");
   
   } 
}
