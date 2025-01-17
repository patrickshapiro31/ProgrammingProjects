/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10.Class102;

//********************************************************************
// Employee.java Author: Lewis/Loftus
//
// Represents a general paid employee.
//********************************************************************
public class Employee extends StaffMember
{

    protected String socialSecurityNumber;
    protected double payRate;
    protected int Vacation = 14;
//-----------------------------------------------------------------
// Constructor: Sets up this employee with the specified
// information.
//-----------------------------------------------------------------

//The child lists all the required items, and the ones it needs
//'super' is used to inherit the definitions of the variables from the parent
    public Employee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
//-----------------------------------------------------------------
// Returns information about an employee as a string.
//-----------------------------------------------------------------

    public String toString()
    {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
//-----------------------------------------------------------------
// Returns the pay rate for this employee.
//-----------------------------------------------------------------

    public double pay()
    {
        return payRate;
    }
    
    public int getVacation()
    {
        return Vacation;
    }
}
