

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class5;

/**
 *
 * @author patrick.shapiro
 */
public class RollingDice2
{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrick.shapiro
 */

	public static void main (String[] args)
	{
		PairofDice dice;
		dice = new PairofDice();
                
                
                dice.rollpair();
                
                System.out.println("Face Value 1: " + dice.getdice1());
                System.out.println("Face Value 2: " + dice.getdice2());
                System.out.println("Total: " + dice.getsum());
	}
}


