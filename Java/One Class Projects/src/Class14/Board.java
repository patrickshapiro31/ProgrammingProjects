/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;

/**
 *
 * @author Patrick Shapiro
 */


public class Board
{
    //making my array and setting the maximums
    final int MAXX = 16;
    final int MAXY = 16;
    Coordinate[][] wormboard = new Coordinate[MAXX][MAXY];
    
        
    public Board()
    {
//creating the board points
        int xcoord = 0;
        int ycoord = 0;
        
        
        for (int ycount = 0; ycount < MAXY; ycount++)
        {
            ycoord = ycount;
                for (int xcount = 0; xcount < MAXX; xcount++)
            {
                xcoord = xcount;
                wormboard[xcoord][ycoord] = new Coordinate(xcoord, ycoord);
            }
        }
        
    }
    //lots of getters
    public int getMAXX()
    {
        return MAXX;
    }
    public int getMAXY()
    {
        return MAXY;
    }
    public int CheckCoordX(int x, int y)
    {
        return wormboard[x][y].getLocationx();
    }
    public int CheckCoordY(int x, int y)
    {
        return wormboard[x][y].getLocationy();
    }
    
    public void setMoved(int x, int y)
    {
        wormboard[x][y].setmoved();
    }
    //check if we're done
    public boolean CanMove(int x, int y)
    {
        return CanMoveLeft(x,y) || CanMoveRight(x,y) || CanMoveUp(x,y) || CanMoveDown(x,y);
    }
    //check for directional movement, being careful of edges
    public boolean CanMoveLeft(int currentx, int currenty)
    {
        if (currentx == 0)
            return false;
        else 
            return wormboard[currentx-1][currenty].checkmovable();
        
    }
        public boolean CanMoveRight(int currentx, int currenty)
    {
        if (currentx == MAXX - 1)
            return false;
        else 
            return wormboard[currentx+1][currenty].checkmovable();
        
    }
        public boolean CanMoveUp(int currentx, int currenty)
    {
        if (currenty == 0)
            return false;
        else 
            return wormboard[currentx][currenty-1].checkmovable();
        
    }
        public boolean CanMoveDown(int currentx, int currenty)
    {
        if (currenty == MAXY - 1)
            return false;
        else 
            return wormboard[currentx][currenty+1].checkmovable();
    }
      
            


    
}
