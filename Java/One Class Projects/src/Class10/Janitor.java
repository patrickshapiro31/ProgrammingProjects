/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

public class Janitor extends Employee
{
    String mopname;
    
    public Janitor(double wage, String nam, int id, String mop)
    {
        super(wage, nam, id);
        mopname = mop;
    }
    
    
    public void Break()
    {
        System.out.println(name + " is marrying " + mopname + ". Let's go to the janitor"
                + " closet reception party!");
    }

    public void Clean()
    {
        System.out.println(name + " swabs the bloodstained hallways with his trusty mop, " + mopname);
    }
    
}