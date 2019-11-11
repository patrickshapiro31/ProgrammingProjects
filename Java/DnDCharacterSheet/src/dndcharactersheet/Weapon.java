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
public class Weapon 
{
    private int index, totalBonus, attribute, bab, weaponBonus, feats, other,
            comboboxIndex, critical, size;
    private String damage = "";
    private String range = "";
    private String type = "";
    private String otherNotes = "";
    private String name = "";
    
        public Weapon(int i)
        {
        index = i;
        }
        
        public void Initialise()
        {
            setTotalBonus(0);
            setAttribute(0);
            setBab(0);
            setWeaponBonus(0);
            setFeats(0);
            setOther(0);
            setComboboxIndex(0);
            setCritical(20);
            setSize(0);
        }
        
        public void calculate()
        {
            totalBonus = attribute + bab + weaponBonus + feats + other + size;
        }
        
    
    //lots of getters and setters
    public int getIndex() 
    {
        return index;
    }

    public void setIndex(int i) 
    {
        index = i;
    }

    public int getTotalBonus() 
    {
        return totalBonus;
    }

    public void setTotalBonus(int i) 
    {
        totalBonus = i;
    }

    public int getAttribute() 
    {
        return attribute;
    }

    public void setAttribute(int i) 
    {
        attribute = i;
    }

    public int getBab() 
    {
        return bab;
    }

    public void setBab(int i) 
    {
        bab = i;
    }

    public int getWeaponBonus() 
    {
        return weaponBonus;
    }

    public void setWeaponBonus(int i) 
    {
        weaponBonus = i;
    }

    public int getFeats() 
    {
        return feats;
    }

    public void setFeats(int i) 
    {
        feats = i;
    }

    public int getOther() 
    {
        return other;
    }

    public void setOther(int i) 
    {
        other = i;
    }

    public int getCritical() 
    {
        return critical;
    }

    public void setCritical(int i) 
    {
        critical = i;
    }
    
    public int getComboboxIndex() 
    {
        return comboboxIndex;
    }

    public void setComboboxIndex(int i) 
    {
        comboboxIndex = i;
    }

    public String getDamage() 
    {
        return damage;
    }
    
    public int getSize() 
    {
        return size;
    }

    public void setSize(int i) 
    {
        size = i;
    }

    public void setDamage(String s) 
    {
        damage = s;
    }

    public String getRange() 
    {
        return range;
    }

    public void setRange(String s) 
    {
        range = s;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String s) {
        type = s;
    }

    public String getOtherNotes() 
    {
        return otherNotes;
    }

    public void setOtherNotes(String s) 
    {
        otherNotes = s;
    }
    
    public void setName(String s)
    {
        name = s;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    
    

    
    
}
