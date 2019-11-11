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
public class Class92
{
       public static void main(String[] args)
    {
        Doctor NickR = new Doctor(9000.01, "Nick Riviera", 12345, 2);
        Nurse Lara = new Nurse(4500, "Laura", 54321, "Nick Riviera");
        Administrator Scrooge = new Administrator(15000, "Scrooge McDuck", 1, 31);
        Surgeon Turner = new Surgeon(10000, "Dad Turner", 11111, "rusty hacksaw");
        Receptionist Karen = new Receptionist(450, "Karen Celes", 32415);
        Janitor Scruffy = new Janitor(400, "Scruffy", 51423, "Janice");
        
        
        NickR.GetID();
        NickR.Brag();
        NickR.Pay();
        
System.out.println();

        Lara.GetID();
        Lara.Assist();
        Lara.Pay();    
        
System.out.println();
        
        Scrooge.GetID();
        Scrooge.Administer();
        Scrooge.Pay();
        
System.out.println();
        
        Turner.GetID();
        Turner.CleanTool();
        Turner.DoSurgery();
        Turner.Pay();
        
System.out.println();
        
        Karen.GetID();
        Karen.Greet();
        Karen.Pay();
        
System.out.println();
        
        Scruffy.GetID();
        Scruffy.Clean();
        Scruffy.Pay();
        
System.out.println();
        
        Scrooge.Break();
        NickR.Break();
        Lara.Break();
        Turner.Break();
        Karen.Break();
        Scruffy.Break();
        
        
        
        
    }
}
