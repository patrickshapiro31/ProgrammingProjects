/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class44;

/**
 *
 * @author patrick.shapiro
 */
public class Dog
{
    private String name, gender;
    private int age, dogyr, genderget;    
    
    
    public Dog()
    {
       name = "";
       gender = "";
       age = 0;
       dogyr = 0;
    }
    
    public String Createdog(String dogname)
    {
        name = dogname;
        genderget = (int) (Math.random() * 2 + 1);
        if(genderget == 1)
            gender = "male";
        else
            gender = "female";
        age = (int) (Math.random() * 19 + 1);
        dogyr = (age * 7);
        return null;
    }
    
    public void Printdog()
    {
        System.out.print("\n" + name + " is a " + age + " year old " + gender + " dog. " + dogyr + " Years old in dog years.");
        if (dogyr >= 110)
        System.out.print(" How is it still alive?");
    }
    
}
