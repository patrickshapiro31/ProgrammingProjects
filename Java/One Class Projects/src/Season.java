/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patrick.shapiro
 */
public enum Season
{
    winter("December through February"),
    spring("March through May"),
    summer("June through August"),
    fall("September through November");
    private String span;
//-----------------------------------------------------------------
// Constructor: Sets up each value with an associated string.
//-----------------------------------------------------------------

    Season(String months)
    {
        span = months;
    }
//-----------------------------------------------------------------
// Returns the span message for this value.
//-----------------------------------------------------------------

    public String getSpan()
    {
        return span;
    }
}