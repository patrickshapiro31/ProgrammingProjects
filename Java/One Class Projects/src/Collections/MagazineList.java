/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Class13.*;


public class MagazineList
{

    private MagazineNode list;
//----------------------------------------------------------------
// Sets up an initially empty list of magazines.
//----------------------------------------------------------------

    public MagazineList()
    {
        list = null;
    }
//----------------------------------------------------------------
// Creates a new MagazineNode object and adds it to the end of
// the linked list.
//----------------------------------------------------------------

    public void add(Magazine mag)
    {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;
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
//----------------------------------------------------------------
// Returns this list of magazines as a string.
//----------------------------------------------------------------

    public String toString()
    {
        String result = "";
        MagazineNode current = list;
        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }
        return result;
    }
//*****************************************************************
// An inner class that represents a node in the magazine list.
// The public variables are accessed by the MagazineList class.
//*****************************************************************

    private class MagazineNode
    {

        public Magazine magazine;
        public MagazineNode next;
//--------------------------------------------------------------
// Sets up the node
//--------------------------------------------------------------

        public MagazineNode(Magazine mag)
        {
            magazine = mag;
            next = null;
        }
    }
}
