/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ParameterTester
{
//-----------------------------------------------------------------
// Sets up three variables (one primitive and two objects) to
// serve as actual parameters to the changeValues method. Prints
// their values before and after calling the method.
//-----------------------------------------------------------------
//Shows a potentially hazardous logic error of incomplete variable changing

    public static void main(String[] args)
    {
        ParameterModifier modifier = new ParameterModifier();
        int a1 = 111;
        Num a2 = new Num(222);
        Num a3 = new Num(333);
        System.out.println("Before calling changeValues:");
        System.out.println("a1\ta2\ta3");
        System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
        modifier.changeValues(a1, a2, a3);
        System.out.println("After calling changeValues:");
        System.out.println("a1\ta2\ta3");
        System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
    }
}
