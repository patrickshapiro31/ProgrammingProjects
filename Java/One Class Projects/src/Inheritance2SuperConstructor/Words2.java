/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance2SuperConstructor;

//********************************************************************
// Words2.java Author: Lewis/Loftus
//
// Demonstrates the use of the super reference.
//********************************************************************
public class Words2
{
//-----------------------------------------------------------------
// Instantiates a derived class and invokes its inherited and
// local methods.
//-----------------------------------------------------------------

    public static void main(String[] args)
    {
        Dictionary2 webster = new Dictionary2(1500, 52500);
        System.out.println("Number of pages: " + webster.getPages());
        System.out.println("Number of definitions: "
                + webster.getDefinitions());
        System.out.println("Definitions per page: "
                + webster.computeRatio());
    }
}
