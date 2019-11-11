/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class41;

/**
 *
 * @author patrick.shapiro
 */
public class Counter
{
    private int count;
    
    
    
    public Counter()
    {
        count = 0;
    }
    
    public int click()
    {
        count++;
        return count;
    }
    
    @Override
    public String toString()
    {
                //result returns some variables when Die is called. (faceValue)
                String result = Integer.toString(count);
                return ("Current count: " + result);
    }
    
    
    
}
