/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionCatching;

//********************************************************************
// ExceptionScope.java Author: Lewis/Loftus
//
// Demonstrates exception propagation.
//********************************************************************
public class ExceptionScope
{
//-----------------------------------------------------------------
// Catches and handles the exception that is thrown in level3.
//-----------------------------------------------------------------

    public void level1()
    {
        System.out.println("Level 1 beginning.");
        try
        {
            level2();
        } 
        catch (ArithmeticException problem)
        {
            System.out.println();
            System.out.println("The exception message is: "
                    + problem.getMessage());
            System.out.println();
            System.out.println("The call stack trace:");
            problem.printStackTrace();
            System.out.println();
        }
        System.out.println("Level 1 ending.");
    }
//-----------------------------------------------------------------
// Serves as an intermediate level. The exception propagates
// through this method back to level1.
//-----------------------------------------------------------------

    public void level2()
    {
        System.out.println("Level 2 beginning.");
        level3();
        System.out.println("Level 2 ending.");
    }
//-----------------------------------------------------------------
// Performs a calculation to produce an exception. It is not
// caught and handled at this level.
//-----------------------------------------------------------------

    public void level3()
    {
        
        System.out.println("Level 3 beginning.");
        int numerator = 10, denominator = 0;
        int result = numerator / denominator;
        System.out.println("Level 3 ending.");
    }
}
