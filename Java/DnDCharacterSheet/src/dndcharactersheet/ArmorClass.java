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
public class ArmorClass 
{
    private int armor = 0;
    private int shield = 0;
    private int stat = 0;
    private int size = 0;
    private int natural = 0;
    private int deflect = 0;
    private int misc = 0;
    
    private int value = 0;
    private int totalmod = 0;
    
    
    
    public ArmorClass()
    {
        
    }
    
    public void initialise()
    {
        setArmor(0);
        setShield(0);
        setNatural(0);
        setDeflect(0);
        setSize(0);
        setStat(0);
        setMisc(0);
        calculate(); 
    }
    
    public void setArmor(int i)
    {
        armor = i;
    }
    
    public void setShield(int i)
    {
        shield = i;
    }
    
    public void setNatural(int i)
    {
        natural = i;
    }
    
    public void setDeflect(int i)
    {
        deflect = i;
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
        totalmod = 10 + armor + shield + size + stat + natural + deflect + misc;
    }
    
}
