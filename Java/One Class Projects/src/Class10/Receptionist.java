/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

public class Receptionist extends Employee
{
    String favtool;
    
    public Receptionist(double wage, String nam, int id)
    {
        super(wage, nam, id);
    }
    
    
    public void Break()
    {
        System.out.println(name + " is telling customers what we're ACTUALLY charging them for!");
    }

    public void Greet()
    {
        System.out.println(name + ": Hello! Welcome to Gonebrook General! Our prices "
                + "are low, because our standards are!");
    }
    
}