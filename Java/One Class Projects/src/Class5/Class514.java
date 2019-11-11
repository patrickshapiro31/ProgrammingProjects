/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class5;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Patrick is a pimp
 */
public class Class514 {

    public static void main(String[] args) throws IOException 
    {
        Scanner fileScan;
        int gottenint;
        double gottendouble;
        fileScan = new Scanner(new File("numbas.txt"));

        //  Read and process each line of the file
        while (fileScan.hasNext()) 
        {
            if (fileScan.hasNextInt())
            {
                gottenint = fileScan.nextInt();
                System.out.println(gottenint + " is an Integer");
            }
            else if (fileScan.hasNextDouble())
            {
                gottendouble = fileScan.nextDouble();
                System.out.println(gottendouble + " is a Double");
            }
        }
    }
}