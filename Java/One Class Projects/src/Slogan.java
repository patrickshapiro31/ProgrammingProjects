/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrick.shapiro
 */
//********************************************************************
// Slogan.java Author: Lewis/Loftus
//
// Represents a single slogan string.
//********************************************************************
public class Slogan
{

    private String phrase;
    private static int count = 0;
//-----------------------------------------------------------------
// Constructor: Sets up the slogan and counts the number of
// instances created.
//-----------------------------------------------------------------

    public Slogan(String str)
    {
        phrase = str;
        count++;
    }
//-----------------------------------------------------------------
// Returns this slogan as a string.
//-----------------------------------------------------------------

    public String toString()
    {
        return phrase;
    }
//-----------------------------------------------------------------
// Returns the number of instances of this class that have been
// created.
//-----------------------------------------------------------------

    public static int getCount()
    {
        return count;
    }
}
