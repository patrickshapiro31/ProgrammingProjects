/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author patrick.shapiro
 */
//*******************************************************************
// MagazineRack.java Author: Lewis/Loftus
//
// Driver to exercise the MagazineList collection.
//*******************************************************************
public class MagazineRack
{
//----------------------------------------------------------------
// Creates a MagazineList object, adds several magazines to the
// list, then prints it.
//----------------------------------------------------------------

    public static void main(String[] args)
    {
        MagazineList rack = new MagazineList();
        rack.add(new Magazine("Time"));
        rack.add(new Magazine("Woodworking Today"));
        rack.add(new Magazine("Communications of the ACM"));
        rack.add(new Magazine("House and Garden"));
        rack.add(new Magazine("GQ"));
        System.out.println(rack);
    }
}
