/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class5;

/**
 *
 * @author patrick.shapiro
 */
public class LeapYear
{

    public LeapYear()
    {

    }

    public Boolean GetLeap(int year)
    {
        Boolean answer;
        int mod4, mod100, mod400;
        mod4 = year % 4;
        mod100 = year % 100;
        mod400 = year % 400;

        if (mod4 == 0)
        {
            if (mod100 == 0)
            {
                if (mod400 == 0)
                {
                    answer = true;
                } 
                else
                    answer = false;

            } 
            else
                answer = true;
        } 
        else
            answer = false;
        

        return answer;
    }

}
