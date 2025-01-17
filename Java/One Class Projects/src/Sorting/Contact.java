/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

//********************************************************************
// Contact.java Author: Lewis/Loftus
//
// Represents a phone contact.
//********************************************************************
public class Contact implements Comparable<Contact>
{

    private String firstName, lastName, phone;
//-----------------------------------------------------------------
// Constructor: Sets up this contact with the specified data.
//-----------------------------------------------------------------

    public Contact(String first, String last, String telephone)
    {
        firstName = first;
        lastName = last;
        phone = telephone;
    }
//-----------------------------------------------------------------
// Returns a description of this contact as a string.
//-----------------------------------------------------------------

    public String toString()
    {
        return lastName + ", " + firstName + "\t" + phone;
    }
//-----------------------------------------------------------------
// Returns a description of this contact as a string.
//-----------------------------------------------------------------

    public boolean equals(Object other)
    {
        return (lastName.equals(((Contact) other).getLastName())
                && firstName.equals(((Contact) other).getFirstName()));
    }
//-----------------------------------------------------------------
// Uses both last and first names to determine ordering.
//-----------------------------------------------------------------

    public int compareTo(Contact other)
    {
        int result;
        if (lastName.equals(other.getLastName()))
        {
            result = firstName.compareTo(other.getFirstName());
        } else
        {
            result = lastName.compareTo(other.getLastName());
        }
        return result;
    }
//-----------------------------------------------------------------
// First name accessor.
//-----------------------------------------------------------------

    public String getFirstName()
    {
        return firstName;
    }
//-----------------------------------------------------------------
// Last name accessor.
//-----------------------------------------------------------------

    public String getLastName()
    {
        return lastName;
    }

    
    
}
