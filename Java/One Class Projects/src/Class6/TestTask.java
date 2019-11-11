/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

import java.util.Date;

/**
 *
 * @author Patrick is a pimp
 */
public class TestTask 
{
    public static void main (String[] args)
    {
        //I really hope this is what you meant for this project
        Task task1 = new Task("Re-enforce the barracks", new Date (118, 9, 5));
        Task task2 = new Task("Equip the guards", new Date (118, 9, 3));
        Task task3 = new Task("Charge the spellstones", new Date (118, 9, 9));
        Task task4 = new Task("Prepare to fight off the hoard", new Date (118, 9, 10));
        Task task5 = new Task("Complete Java Homework", new Date (118, 9, 1));
     
        task1.setPriority(3);
        task2.setPriority(2);
        task3.setPriority(4);
        task4.setPriority(5);
        task5.setPriority(1);
        
        //Complexity is 7.6
        task1.setComplexity(2);
        task2.setComplexity(3);
        task3.setComplexity(6);
        task4.setComplexity(1);
        task5.setComplexity(9001);
        
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);
    }
}
