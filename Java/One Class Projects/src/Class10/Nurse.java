/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

/**
 *
 * @author Patrick Shapiro
 */
public class Nurse extends Employee
{
    String superior;
    
    public Nurse(double wage, String nam, int id, String underwhom)
    {
        super(wage, nam, id);
        superior = underwhom;
    }
    
    public void Break()
    {
        System.out.println("Nurse " + name + " has dropped the snack machine on doctor " 
                + superior + "!");
    }
    

    public void Assist()
    {
        System.out.println("Nurse " + name + " Does most of Dr. " + superior + "'s work.");
    }
    
}
