/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author patrick.shapiro
 */
//********************************************************************
// Words.java Author: Lewis/Loftus
//
// Demonstrates the use of an inherited method.
//********************************************************************
public class Words
{
//-----------------------------------------------------------------
// Instantiates a derived class and invokes its inherited and
// local methods.
//-----------------------------------------------------------------

    public static void main(String[] args)
    {
        Dictionary webster = new Dictionary();
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: "
                + webster.getDefinitions());
        System.out.println("Definitions per page: "
                + webster.computeRatio());
    }
}
