/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overrides;

//********************************************************************
// Messages.java Author: Lewis/Loftus
//
// Demonstrates the use of an overridden method.
//********************************************************************
public class Messages
{
//-----------------------------------------------------------------
// Creates two objects and invokes the message method in each.
//-----------------------------------------------------------------

    public static void main(String[] args)
    {
        Thought parked = new Thought();
        Advice dates = new Advice();
        
        parked.message();
        
        dates.message(); // overridden
    }
}
