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
public class Administrator extends Employee
{
    int departmentno;
    
    public Administrator(double wage, String nam, int id, int building)
    {
        super();
        departmentno = building;
    }
    
    public void Break()
    {
        System.out.println(name + " has sold all the company stocks and fled to Africa!");
    }
    

    public void Administer()
    {
        System.out.println("Nurse " + name + " gets mad, throws things, and makes some new " +
                "terrible rules in building " + departmentno);
    }
    
}
