/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;

public class Monster implements Comparable<Monster>
{

    private String text;
    private Integer level;
//-----------------------------------------------------------------
// Sets up the new magazine with its title.
//-----------------------------------------------------------------

    public Monster(String newName, int newLevel)
    {
        level = newLevel;
        text = (newName + ", Level: " + level);
    }
//-----------------------------------------------------------------
// Returns this magazine as a string.
//-----------------------------------------------------------------

    @Override
    public String toString()
    {
        return text;
    }

    public int getLevel()
    {
        return level;
    }

    @Override
    public int compareTo(Monster other)
    {
        int result;
        if (level == (other.getLevel()))
        {
            result = level.compareTo(other.getLevel());
        } else
        {
            result = level.compareTo(other.getLevel());
        }
        return result;

    }
}
