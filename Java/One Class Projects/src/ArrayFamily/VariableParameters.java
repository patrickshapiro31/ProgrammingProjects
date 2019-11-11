/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayFamily;

//********************************************************************
// VariableParameters.java Author: Lewis/Loftus
//
// Demonstrates the use of a variable length parameter list.
//********************************************************************
public class VariableParameters
{
//-----------------------------------------------------------------
// Creates two Family objects using a constructor that accepts
// a variable number of String objects as parameters.
//-----------------------------------------------------------------

    public static void main(String[] args)
    {
        Family lewis = new Family("John", "Sharon", "Justin", "Kayla",
                "Nathan", "Samantha");
        Family camden = new Family("Stephen", "Annie", "Matt", "Mary",
                "Simon", "Lucy", "Ruthie", "Sam", "David");
        System.out.println(lewis);
        System.out.println();
        System.out.println(camden);
    }
}
