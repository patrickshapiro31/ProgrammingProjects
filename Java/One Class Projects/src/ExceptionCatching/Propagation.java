/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionCatching;

//********************************************************************
// Propagation.java Author: Lewis/Loftus
//
// Demonstrates exception propagation.
//********************************************************************
public class Propagation
{
//-----------------------------------------------------------------
// Invokes the level1 method to begin the exception demonstration.
//-----------------------------------------------------------------
static public void main(String[] args)
{
ExceptionScope demo = new ExceptionScope();
System.out.println("Program beginning.");
demo.level1();
System.out.println("Program ending.");
}
}