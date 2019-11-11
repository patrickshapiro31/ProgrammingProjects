/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionCatching;

//********************************************************************
// OutOfRangeException.java Author: Lewis/Loftus
//
// Represents an exceptional condition in which a value is out of
// some particular range.
//********************************************************************
public class OutOfRangeException extends Exception
{
//-----------------------------------------------------------------
// Sets up the exception object with a particular message.
//-----------------------------------------------------------------

    OutOfRangeException(String message)
    {
        super(message);
    }
}
