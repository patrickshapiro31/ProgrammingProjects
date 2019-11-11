package Overrides;
// Advice.java Author: Lewis/Loftus
//
// Represents some thoughtful advice. Used to demonstrate the use
// of an overridden method.
//********************************************************************
//Child class, can use parent's methods, or its own
public class Advice extends Thought
{
//-----------------------------------------------------------------
// Prints a message. This method overrides the parent's version.
//-----------------------------------------------------------------

    @Override
    public void message()
    {
        System.out.println("Warning: Dates in calendar are closer " + 
                "than they appear.");
        
        System.out.println();
        
        super.message(); // explicitly invokes the parent's version
    }
}


/*
Imagine if all monsters with the 'infernal' trait could breathe fire and 
shoot fireballs. That would be the parent class. An infernal 'hellhound',
hellhound would be the child class, with new methods for sonic barking attack
and a bite, but hellhound.firebreath() would still execute, because it is
available in the 'infernal' class which hellhound extends and is thus a child of.
*/