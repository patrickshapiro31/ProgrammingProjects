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
public class Grapple 
{
    private int bab = 0;
    private int size = 0;
    private int stat = 0;
    private int misc = 0;
    private int totalmod = 0;
    
    
    
    public Grapple()
    {
        
    }
    
    public void initialise()
    {
        setBab(0);
        setSize(0);
        setStat(0);
        setMisc(0);
        calculate(); 
    }
    
    public void setBab(int i)
    {
        bab = i;
    }
    
    public void setSize(int i)
    {
        size = i;
    }
    
    public void setStat(int i)
    {
        stat = i;
    }
    
    public void setMisc(int i)
    {
        misc = i;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public int getTotalMod()
    {
        return totalmod;
    }
    
    
    public void calculate()
    {
        totalmod = bab + size + stat + misc;
    }
    
}
