/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

//********************************************************************
// Dictionary.java Author: Lewis/Loftus
//
// Represents a dictionary, which is a book. Used to demonstrate
// inheritance.
//********************************************************************
public class Dictionary extends Book
{

    private int definitions = 52500;
//-----------------------------------------------------------------
// Prints a message using both local and inherited values.
//-----------------------------------------------------------------

    public double computeRatio()
    {
        return (double) definitions / pages;
    }
//----------------------------------------------------------------
// Definitions mutator.
//----------------------------------------------------------------

    public void setDefinitions(int numDefinitions)
    {
        definitions = numDefinitions;
    }
//----------------------------------------------------------------
// Definitions accessor.
//----------------------------------------------------------------

    public int getDefinitions()
    {
        return definitions;
    }
}