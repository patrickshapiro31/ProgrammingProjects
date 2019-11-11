/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

//********************************************************************
// OutOfRangeException.java Author: Lewis/Loftus
//
// Represents an exceptional condition in which a value is out of
// some particular range.
//********************************************************************
public class StringTooLongException extends Exception
{
//-----------------------------------------------------------------
// Sets up the exception object with a particular message.
//-----------------------------------------------------------------

    StringTooLongException(String message)
    {
        super(message);
    }
}
