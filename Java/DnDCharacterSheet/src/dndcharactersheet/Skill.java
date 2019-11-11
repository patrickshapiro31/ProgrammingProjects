/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndcharactersheet;

/**
 *
 * @author patrick.shapiro
 */
public class Skill
{
    private int total, attribute, ranks, misc;
    
    public Skill()
    {
        
    }
    
    public void Initialise()
    {
        total = 0;
        attribute = 0;
        ranks = 0;
        misc = 0;
    }
    
    public void Calculate()
    {
        total = attribute + ranks + misc;
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void setRanks(int i)
    {
        ranks = i;
    }
    
    public int getRanks()
    {
        return ranks;
    }
    
    public void setAttribute(int i)
    {
        attribute = i;
    }
    
    public int getAttribute()
    {
        return attribute;
    }
    
    public void setMisc(int i)
    {
        misc = i;
    }
    
    public int getMisc()
    {
        return misc;
    }
    
}
