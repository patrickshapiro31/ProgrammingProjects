/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;

/**
 *
 * @author Patrick Shapiro
 */
public class Coordinate 
{
    int x, y, modx, mody;
    boolean enterable = true;
    
    public Coordinate(int locx, int locy)
    {
        x = locx;
        y = locy;
        modx = (locx + 1) * 40;
        mody = (locy + 1) * 40;
    }
    //a bunch of getters, some for their variable in the array, others for the
    //actual coordinate
    public int getx()
    {
        return x;
    }
    
    public int gety()
    {
        return y;
    }
    
    public int getLocationx()
    {
        return modx;
    }
    
    public int getLocationy()
    {
        return mody;
    }
    
    public boolean checkmovable()
    {
        return enterable;
    }
    
    public void setmoved()
    {
        enterable = false;
    }
    
    
    
    
    
}
