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

public class Card 
{
    private String suit, numstring, result;
    private int number;
    
    public Card(Card c)
    {
        suit = c.getsuit();
        number = c.getnum();
    }
    
    public Card(String s, int n)
    {
        suit = s;
        number = n;
    }
    
    public int getnum()
    {
        return number;
    }
    
    public String getsuit()
    {
        return suit;
    }
    
    public String toString()
    {
        numstring = ("" + number);
        if (number == 11)
            numstring = "Jack";
        if (number == 12)
            numstring = "Queen";
        if (number == 13)
            numstring = "King";
        if (number == 14)
            numstring = "Ace";
        
        result = (numstring + " of " + suit);
        return result;
    }
    
}
