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
public class Attribute 
{
    private int value = 10;
    private int modifier = 0;
    private int base = 10;
    private int temporary = 0;
    
    public Attribute()
    {
        
    }
    
    public void initialise()
    {
        setBase(10);
        setTemporary(0);
        calculate();
    }
    
    public void setBase(int i)
    {
        base = i;
    }
    
    public void setModifier(int i)
    {
        modifier = i;
    }
    
    public void setTemporary(int i)
    {
        temporary = i;
    }
    
    public void calculate()
    {
        value = base + temporary;
        if (value < 10)
            modifier = (value - 11)/2;
        else
            modifier = (value - 10)/2;
    }
    
    public int getModifier()
    {
        return modifier;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public int getBase()
    {
        return base;
    }
    
    public int getTemporary()
    {
        return temporary;
    }
    
    
    
    
    
    
    
    
}
