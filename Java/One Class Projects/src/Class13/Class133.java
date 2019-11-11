/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;
/**
 *
 * @author patrick.shapiro
 */
//This program constitutes Class 133 and 134
public class Class133
{
        //Creates a dungeon class, full of monster classes, then sorts by level
        //Class 133 (Seleciton Sort)
    
        public static void main(String[] args)
    {
        final int SIZE = 7;
        Monster[] level1 = new Monster[SIZE];
        Dungeon dungeon = new Dungeon();
        
        level1[0] = new Monster("Baron Morte, the Apocalypse", 20);
        level1[1] = new Monster("Goblin", 1);
        level1[2] = new Monster("Iron Golem", 10);
        level1[3] = new Monster("Medusa", 5);
        level1[4] = new Monster("Orc", 3);
        level1[5] = new Monster("Beholder", 7);
        level1[6] = new Monster("Pronoun, Devourer of the Innocent", 15);
        

// Selection Sort
        int minC;
        Comparable<Monster> temp;
        for (int index = 0; index < level1.length - 1; index++)
        {
            minC = index;
            for (int scan = index + 1; scan < level1.length; scan++)
            {
                if (level1[scan].compareTo((Monster) level1[minC]) < 0)
                {
                    minC = scan;
                }
            }
// Swap the values
            temp = level1[minC];
            level1[minC] = level1[index];
            level1[index] = (Monster) temp;
        }
    
        
        
        for(int i = 0; i < SIZE; i++)
        {dungeon.add(level1[i]);}
        
        System.out.println("Selection Sort method\n-------------------");
        System.out.print(dungeon);
        System.out.println("-------------------\n");
        
        
// Class 134 Insertion sort)

        final int SIZE2 = 7;
        Monster[] level2 = new Monster[SIZE];
        Dungeon dungeon2 = new Dungeon();
        
        level2[0] = new Monster("Eyerok, The overused first boss of everything", 10);
        level2[1] = new Monster("Highwayman", 3);
        level2[2] = new Monster("Leezard", 1);
        level2[3] = new Monster("Medusa", 5);
        level2[4] = new Monster("Seeker", 7);
        level2[5] = new Monster("Geezard", 12);
        level2[6] = new Monster("Sterma, Weaver of Nightmares", 99);
        

// Instertion Sort
/*Function to sort array using insertion sort*/
        int n = level2.length; 
        for (int i=1; i<n; ++i) 
        { 
            Monster key = level2[i]; 
            int j = i-1; 
  
//Moving the values 
            while (j>=0 && level2[j].compareTo((Monster) key) > 0)
            { 
                level2[j+1] = level2[j]; 
                j = j-1; 
            } 
            level2[j+1] = key; 
        } 
    
        
        
        for(int i = 0; i < SIZE2; i++)
        {dungeon2.add(level2[i]);}
        
        System.out.println("Insertion Sort method\n-------------------");
        System.out.print(dungeon2);
        System.out.println("-------------------");
    }
}
