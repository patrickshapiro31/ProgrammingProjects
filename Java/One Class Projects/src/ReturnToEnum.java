/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrick.shapiro
 */


    public class ReturnToEnum
    {
//-----------------------------------------------------------------
// Iterates through the values of the Season enumerated type.
//-----------------------------------------------------------------

        public static void main(String[] args)
        {
            for (Season time : Season.values())
            {
                System.out.println(time + "\t" + time.getSpan());
            }
        }
    
}
