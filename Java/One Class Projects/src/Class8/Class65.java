/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

/**
 *
 * @author patrick.shapiro
 */
public class Class65
{
    public static void main (String[] args)
    {
        PairofDice dice = new PairofDice();
        int diceresult;
        int numOfBoxcar = 0;
        
        for (int rolls = 1; rolls <= 1000; rolls++)
        {
        dice.rollpair();
        diceresult = dice.getsum();
        if (diceresult == 12)
            numOfBoxcar++;
        }
        
        System.out.println("Number of Boxcars out of 1000 rolls: " + numOfBoxcar);
        
        
    }
}
