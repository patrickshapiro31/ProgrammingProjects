/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class49;
/**
 *
 * @author patrick.shapiro
 */
//See RollingDice for the main
public class Die
{
	private final int MAX = 6; //private means the class is the only thing that can use this varable
	public int faceValue;
        

//this is a constructor, these are autorun when a new Die is created, 

	public Die() //must be named the same as the class.
	{
                faceValue = 1;  //sets an initial face value
	}
	
	public int roll() //This is a method .roll executes this
	{
                faceValue = (int) (Math.random() * MAX + 1);
		return faceValue;
                //return gives the Die this value
	}     
        
        public void setFaceValue(int value) //Allows you to manually set the face value
        {
                faceValue = value;
        }

	public String toString()
	{
                //result returns some variables when Die is called. (faceValue)
                String result = Integer.toString(faceValue);
                return result;
	}
}

