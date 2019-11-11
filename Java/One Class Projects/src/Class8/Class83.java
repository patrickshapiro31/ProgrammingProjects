/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author patrick.shapiro
 */
public class Class83
{
    public static void main (String[] args) throws IOException
    {
     int[] list = new int[10];
     {
         list[0] = 0;
         list[1] = 0;
         list[2] = 0;
         list[3] = 0;
         list[4] = 0;
         list[5] = 0;
         list[6] = 0;
         list[7] = 0;
         list[8] = 0;
         list[9] = 0;
     }
        int currentInt, printcount;
        Scanner fileScan;
        fileScan = new Scanner(new File("Numbers.txt"));
        
         while (fileScan.hasNext()) 
        {
            currentInt = fileScan.nextInt();
                
            if (currentInt <= 10)
            {list[0]++;}
            else if (currentInt <= 20)
            {list[1]++;}
            else if (currentInt <= 30)
            {list[2]++;}
            else if (currentInt <= 40)
            {list[3]++;}
            else if (currentInt <= 50)
            {list[4]++;}
            else if (currentInt <= 60)
            {list[5]++;}
            else if (currentInt <= 70)
            {list[6]++;}
            else if (currentInt <= 80)
            {list[7]++;}
            else if (currentInt <= 90)
            {list[8]++;}
            else if (currentInt <= 100)
            {list[9]++;}

        }
         
         System.out.print("1 - 10 \t\t|\t ");
         printcount = 1;
         while (printcount <= list[0])
        {
             System.out.print("*");
             printcount++;
        }
        System.out.print("\n11 - 20 \t|\t ");
        printcount = 1;
         while (printcount <= list[1])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n21 - 30 \t|\t ");
         printcount = 1;
         while (printcount <= list[2])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n31 - 40 \t|\t ");
         printcount = 1;
         while (printcount <= list[3])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n41 - 50 \t|\t ");
         printcount = 1;
         while (printcount <= list[4])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n51 - 60 \t|\t ");
         printcount = 1;
         while (printcount <= list[5])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n61 - 70 \t|\t ");
         printcount = 1;
         while (printcount <= list[6])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n71 - 80 \t|\t ");
         printcount = 1;
         while (printcount <= list[7])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n81 - 90 \t|\t ");
         printcount = 1;
         while (printcount <= list[8])
        {
             System.out.print("*");
             printcount++;
        }
         System.out.print("\n91 - 100 \t|\t ");
         printcount = 1;
         while (printcount <= list[9])
        {
             System.out.print("*");
             printcount++;
        }
         
         System.out.println();

            
    }    
}
