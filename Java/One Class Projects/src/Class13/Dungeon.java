/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;


public class Dungeon
{

    private DungeonNode list;


    public Dungeon()
    {
        list = null;
    }


    public void add(Monster mon)
    {
        DungeonNode node = new DungeonNode(mon);
        DungeonNode current;
        if (list == null)
        {
            list = node;
        } else
        {
            current = list;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = node;
        }
    }


    public String toString()
    {
        String result = "";
        DungeonNode current = list;
        while (current != null)
        {
            result += current.enemy + "\n";
            current = current.next;
        }
        return result;
    }


    private class DungeonNode
    {

        public Monster enemy;
        public DungeonNode next;
//--------------------------------------------------------------
// Sets up the node
//--------------------------------------------------------------

        public DungeonNode(Monster mon)
        {
            enemy = mon;
            next = null;
        }
    }

}
