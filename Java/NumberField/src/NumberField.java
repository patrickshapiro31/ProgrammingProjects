

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
This class is not my own. This is an example of how to make a text field
that only accepts numbers. The code was taken from:
https://www.youtube.com/watch?v=os9Rn0PJYI0
*/




import javafx.scene.control.TextField;

/**
 *
 * @author Patrick Shapiro
 */
public class NumberField extends TextField
{
    public NumberField()
    {
        super();
    }
    
    @Override
    public void replaceText(int i, int i1, String s)
    {
        if(s.matches("[0-9]") || s.isEmpty())
        {
            super.replaceText(i, i1, s);
        }
    }
    
    @Override
    public void replaceSelection(String s)
    {
        super.replaceSelection(s);
    }
    
}
