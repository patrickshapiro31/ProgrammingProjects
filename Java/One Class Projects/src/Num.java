/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrick.shapiro
 */
public class Num
{

    private int value;
//-----------------------------------------------------------------
// Sets up the new Num object, storing an initial value.
//-----------------------------------------------------------------

    public Num(int update)
    {
        value = update;
    }
//-----------------------------------------------------------------
// Sets the stored value to the newly specified value.
//-----------------------------------------------------------------

    public void setValue(int update)
    {
        value = update;
    }
//-----------------------------------------------------------------
// Returns the stored integer value as a string.
//-----------------------------------------------------------------

    public String toString()
    {
        return value + "";
    }
}
