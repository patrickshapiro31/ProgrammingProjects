/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class49;

/**
 *
 * @author patrick.shapiro
 */
public class Timesup
{
    	public static void main (String[] args)
        {
            
		Die dice;
		dice = new Die();
                int threecount = 0;
                
                
                for (int rollcount = 1; rollcount <= 100; rollcount++)
                {
                dice.roll();
                if (dice.faceValue == 3)
                    threecount++;
                }
                
                System.out.println("The number of 3s rolled is " + threecount);
        
        
        
        
        
        
        
        
        }
        
}
