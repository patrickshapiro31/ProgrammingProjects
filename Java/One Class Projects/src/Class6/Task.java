/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

import java.util.Date;

/**
 *
 * @author Patrick Shapiro
 */
public class Task implements Priority, Complexity
{
    private String descriptor, result;
    Date due = new Date();
    private int prioritylevel = 0;
    private int complexitylevel = 0;
    
    public Task(String what, Date duedate)
    {
        descriptor = what;
        due = duedate;
        prioritylevel = 0;
        complexitylevel = 0;
    }
    
    public String toString()
    {
        result = (descriptor + " Due: " + due + " (Priority Level: " + prioritylevel + ") ");
        result += ("(Complexity: " + complexitylevel + ")");
        return result;
    }

    public void setPriority(int priority) 
    {
        prioritylevel = priority;
    }

    public int getPriority() 
    {
        return prioritylevel;
    }
    //complexity is 7.6
    public void setComplexity(int complexity) 
    {
        complexitylevel = complexity;
    }

    public int getComplexity() 
    {
        return complexitylevel;
    }
    
}
