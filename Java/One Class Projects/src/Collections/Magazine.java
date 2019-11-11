/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

//********************************************************************
// Magazine.java Author: Lewis/Loftus
//
// Represents a single magazine.
//********************************************************************
public class Magazine
{
private String title;
//-----------------------------------------------------------------
// Sets up the new magazine with its title.
//-----------------------------------------------------------------
public Magazine(String newTitle)
{
title = newTitle;
}
//-----------------------------------------------------------------
// Returns this magazine as a string.
//-----------------------------------------------------------------
public String toString()
{
return title;
}
}