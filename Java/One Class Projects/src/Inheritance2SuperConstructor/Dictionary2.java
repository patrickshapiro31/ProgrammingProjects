/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance2SuperConstructor;

//********************************************************************
// Dictionary2.java Author: Lewis/Loftus
//
// Represents a dictionary, which is a book. Used to demonstrate
// the use of the super reference.
//********************************************************************
public class Dictionary2 extends Book2
{

    private int definitions;
//-----------------------------------------------------------------
// Constructor: Sets up the dictionary with the specified number
// of pages and definitions.
//-----------------------------------------------------------------

    public Dictionary2(int numPages, int numDefinitions)
    {
        super(numPages);
        definitions = numDefinitions;
    }
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
