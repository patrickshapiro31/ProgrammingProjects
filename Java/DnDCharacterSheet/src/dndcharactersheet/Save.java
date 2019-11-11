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
public class Save 
{
    private int base = 0;
    private int magic = 0;
    private int stat = 0;
    private int misc = 0;
    
    private int totalmod = 0;
    
    public Save()
    {
        
    }

    public void setBase(int i) 
    {
        base = i;
    }

    public void setMagic(int i) 
    {
        magic = i;
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
        totalmod = misc + stat + magic + base;
    }
    
    public int getStat()
    {
        return stat;
    }
    
    public int getTotal()
    {
        return totalmod;
    }

    
}
