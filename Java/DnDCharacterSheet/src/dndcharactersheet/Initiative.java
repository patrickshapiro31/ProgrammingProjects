/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndcharactersheet;

/**
 *
 * @author Patrick Shapiro
 */
public class Initiative 
{
    private int stat = 0;
    private int misc = 0;
    
    private int total = 0;
    
    
    public Initiative()
    {
        
    }
    
    public void setStat(int i)
    {
        stat = i;
    }
    
    public void setMisc(int i)
    {
        misc = i;
    }
    
    public void calculate()
    {
        total = stat + misc;
    }
    
    public int getTotal()
    {
        return total;
    }
    
    
}
