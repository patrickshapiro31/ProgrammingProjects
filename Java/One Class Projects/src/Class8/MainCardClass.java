/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

/**
 *
 * @author Patrick Shapiro
 */
public class MainCardClass 
{
    public static void main(String[] args)
    {
    DeckofCards Deck = new DeckofCards();
    System.out.println(Deck);
    System.out.println("----------Now we shuffle!----------");
    Deck.Shuffle();
    System.out.println(Deck);
    }
    
}
