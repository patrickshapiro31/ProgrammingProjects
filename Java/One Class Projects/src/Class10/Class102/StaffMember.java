/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10.Class102;

//********************************************************************

import PloymorphismPay.*;
//********************************************************************
// StaffMember.java Author: Lewis/Loftus
//
// Represents a generic staff member.
//********************************************************************
abstract public class StaffMember
{

    protected String name;
    protected String address;
    protected String phone;
    protected final int BLANKVACATION = 0;
    
//-----------------------------------------------------------------
// Constructor: Sets up this staff member using the specified
// information.
//-----------------------------------------------------------------

    //The parent defines the most base of the object variables (cont. in Employee)
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
//-----------------------------------------------------------------
// Returns a string including the basic employee information.
//-----------------------------------------------------------------

    public String toString()
    {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }
//-----------------------------------------------------------------
// Derived classes must define the pay method for each type of
// employee.
//-----------------------------------------------------------------
        public int getVacation()
    {
        return BLANKVACATION;
    }


    public abstract double pay();
}
