/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overrides;

//********************************************************************
// Thought.java Author: Lewis/Loftus
//
// Represents a stray thought. Used as the parent of a derived
// class to demonstrate the use of an overridden method.
//********************************************************************
public class Thought
{
//-----------------------------------------------------------------
// Prints a message.
//-----------------------------------------------------------------

    public void message()
    {
        System.out.println("I feel like I'm diagonally parked in a "
                + "parallel universe.");
        System.out.println();
    }
}
