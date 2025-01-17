/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

//********************************************************************
// PhoneList.java Author: Lewis/Loftus
//
// Driver for testing a sorting algorithm.
//********************************************************************
public class PhoneList
{
//-----------------------------------------------------------------
// Creates an array of Contact objects, sorts them, then prints
// them.
//-----------------------------------------------------------------

    public static void main(String[] args)
    {
        Contact[] friends = new Contact[8];
        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Getz", "663-555-3984");
        friends[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact("Mario", "Guzman", "804-555-9066");
        friends[7] = new Contact("Marsha", "Grant", "243-555-2837");
        
        Sorting<Contact> sorts = new Sorting<>();
        sorts.selectionSort(friends);
        
        for (Contact friend : friends)
        {
            System.out.println(friend);
        }
    }
    
    
}
