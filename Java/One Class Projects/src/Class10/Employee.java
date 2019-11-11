/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

/**
 *
 * @author patrick.shapiro
 */
abstract public class Employee
{
    protected double pay;
    protected String name;
    protected int idnum;
    protected String dojob;
    protected String breakdown;

    public Employee(){}
    
    public void doJob(){}
    public void Pay(){}
    public void GetID(){}
    public void Break(){}
}

// need doctor, nurse, administrator, surgeon, receptionist, janitor classes