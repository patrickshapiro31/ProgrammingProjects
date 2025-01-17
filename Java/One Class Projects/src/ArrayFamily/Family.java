/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayFamily;

public class Family
{

    private String[] members;
//-----------------------------------------------------------------
// Constructor: Sets up this family by storing the (possibly
// multiple) names that are passed in as parameters.
//-----------------------------------------------------------------

    public Family(String... names)
    {
        members = names;
    }
//-----------------------------------------------------------------
// Returns a string representation of this family.
//-----------------------------------------------------------------

    public String toString()
    {
        String result = "";
        for (String name : members)
        {
            result += name + "\n";
        }
        return result;
    }
}
