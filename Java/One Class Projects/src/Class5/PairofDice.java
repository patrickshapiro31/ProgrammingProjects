/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class5;

import Class49.*;

/**
 *
 * @author patrick.shapiro
 */
public class PairofDice
{
    private int sum;
    Die die1, die2;
    

    
    public PairofDice()
    {
    die1 = new Die();
    die2 = new Die();
    }
    
    public void rollpair() //This is a method .roll executes this
    {
        die1.roll();
	die2.roll();
         //return gives the Die this value
    }     
    
    public int getdice1()
    {
        return die1.faceValue;
    }
    
    public int getdice2()
    {
        return die2.faceValue;
    }
    
    public int getsum()
    {
        return (die1.faceValue + die2.faceValue);
    }
    
}
