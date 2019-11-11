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
public class DeckofCards 
{
    int cardnum; 
    final int DECKSIZE = 52;
    int suitnum = 1;
    int deckId = 0;
    String suit, output;
    Card[] cards = new Card[DECKSIZE];
    int cardno = 0;
    
    public DeckofCards()
    {
        
        suit = "Spades";
        for (int count = 2; count <= 14; count++)
        {
            cardnum = count;
            cards[deckId] = new Card(suit, cardnum);
            deckId++;
            if (count == 14 && suitnum == 1)
            {
                suit = "Clubs";
                count = 1;
                suitnum++;
            }
            if (count == 14 && suitnum == 2)
            {
                suit = "Hearts";
                count = 1;
                suitnum++;
            }
            if (count == 14 && suitnum == 3)
            {
                suit = "Diamonds";
                count = 1;
                suitnum++;
            }
    
        }    
    }
    
    public void Shuffle()
    {
        cardno = 0;
        Card[] shuffle = new Card[DECKSIZE];
        int rando;
        boolean[] empty = new boolean[DECKSIZE];
        for (int count = 0; count < DECKSIZE; count++)
        {
            empty[count] = true;
        }
    
        for (int count = 0; count < DECKSIZE; count++) 
        {
            rando = (int) (Math.random() * (DECKSIZE));
    
            if(empty[rando])
            {
               shuffle[rando] = cards[count];
               empty[rando] = false;
            }
            else
            {
                count--;
            }
        }
        for (int count = 0; count < DECKSIZE; count++)
        {
            cards[count] = shuffle[count];
        }
        
    }
    
    public String toString()
    {
        output = "";
        
        for (int count = 0; count <= 51; count++)
        {
            output += (cards[count] + "\n");
        }
        
        return output;
    }
    
    public Card draw()
    {
        cardno++;
        return cards[cardno - 1];
    }
    
}
