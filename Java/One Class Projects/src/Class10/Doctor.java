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
public class Doctor extends Employee
{
    int colledge;
    
    public Doctor(double wage, String nam, int id, int colledgeyrs)
    {
        super(wage, nam, id);
        colledge = colledgeyrs;
    }
    
    
    public void Break()
    {
        System.out.println("Dr. " + name + " is switching labels on patient perscriptions!");
    }

    public void Brag()
    {
        System.out.println("I'm doctor " + name + " P.H.D, and I have " + colledge +
                " years of expensive doctor colledge.");
    }
    
    
    
    
    
    
    
}
