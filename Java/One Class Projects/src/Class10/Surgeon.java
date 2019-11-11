/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

public class Surgeon extends Employee
{
    String favtool;
    
    public Surgeon(double wage, String nam, int id, String tool)
    {
        super(wage, nam, id);
        favtool = tool;
    }
    
    
    public void Break()
    {
        System.out.println(name + " has replaced the patient's liver with a"
                + " stick of live dynamite!");
    }

    public void CleanTool()
    {
        System.out.println(name + " cleans their trusty " + favtool);
    }
    
    public void DoSurgery()
    {
        System.out.println(name + " starts slicing away with their " + favtool);
    }
    
}
