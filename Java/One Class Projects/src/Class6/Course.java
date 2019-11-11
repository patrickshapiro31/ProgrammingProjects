/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;
import java.util.*;
/**
 *
 * @author Patrick Shapiro
 */
public class Course 
{
    private String coursename;
    private ArrayList<Student> Students = new ArrayList<Student>();
    private int rollCount;
    private double fullaverage;
    
    public Course(String name)
    {
        coursename = name; 
    }
    
    public void Addstudent(Student newguy)
    {
        Students.add(newguy);
    }
    
    public void roll()
    {
        rollCount = 0;
        
        while (rollCount < Students.size())
        {
            System.out.println(Students.get(rollCount).getroll());
            rollCount++;
        }
    }
    
    public double average()
    {
        fullaverage = 0;
        rollCount = 0;
        while (rollCount < Students.size())
        {
            fullaverage += (Students.get(rollCount).getAverage());
            rollCount++;
        }
        fullaverage = (fullaverage / Students.size());
        return fullaverage;
        
    }


}



