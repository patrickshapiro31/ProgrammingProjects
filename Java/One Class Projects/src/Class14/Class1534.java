/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Patrick Shapiro
 */
public class Class1534 extends Application
{
    
    //instantiating global variables
    final int SCREENWIDTH = 650;
    final int SCREENHEIGHT = 700;
    final int STARTINGX = 7;
    final int STARTINGY = 7;
    int x1, x2, y1, y2;
    int currentx, currenty, newx, newy, rando, linecount;
    Board WormPath = new Board();
    Line[] linesx = new Line[WormPath.getMAXX()];
    Line[] linesy = new Line[WormPath.getMAXY()];
    //groups got a little confusing and didn't cooperate to well in this one...
    Group wormgroup = new Group();

    
    public void start(Stage primaryStage)
    {
        

        
        
        //create the grid and draw it
            for (int xcount = 0; xcount < WormPath.getMAXX(); xcount++)
        {
            int ycoord = WormPath.CheckCoordY(0, xcount);
            int xcoord = (WormPath.getMAXX()) * 40;
            linesx[xcount] = new Line(0, ycoord, xcoord, ycoord);
        }
        
            for (int ycount = 0; ycount < WormPath.getMAXY(); ycount++)
        {
            int xcoord = WormPath.CheckCoordX(ycount, 0);
            int ycoord = (WormPath.getMAXY()) * 40;
            linesy[ycount] = new Line(xcoord, 0, xcoord, ycoord);
        }
            
            //keeping track of where the worm is
            currentx = STARTINGX;
            currenty = STARTINGY;
            newx = currentx;
            newy = currenty;
            
            Group linex = new Group(linesx);
            Group liney = new Group(linesy);
            Group grid = new Group(linex, liney, wormgroup);
            
            //mark where you've been
           while (WormPath.CanMove(currentx, currenty))
            {
                currentx = newx;
                currenty = newy;
                rando = (int) (Math.random() * (4) + 1);
                
                if (rando == 1)
                {

                    if (WormPath.CanMoveLeft(currentx, currenty))
                    {
                        WormPath.setMoved(currentx, currenty);
                        newx = currentx - 1;
                        SetDrawingVariables();
                        
                    }
                }
                if (rando == 2)
                {
                    if (WormPath.CanMoveRight(currentx, currenty))
                    {
                        WormPath.setMoved(currentx, currenty);
                        newx = currentx + 1;
                        SetDrawingVariables();
                        
                        
                    }
                }
                if (rando == 3)
                {
                    if (WormPath.CanMoveUp(currentx, currenty))
                    {
                        WormPath.setMoved(currentx, currenty);
                        newy = currenty - 1;
                        SetDrawingVariables();
                    }
                }
                if (rando == 4)
                {
                    if (WormPath.CanMoveDown(currentx, currenty))
                    {
                        WormPath.setMoved(currentx, currenty);
                        newy = currenty + 1;
                        SetDrawingVariables();

                    }
                }

            }

    

            
            
            
            
            


        Scene scene = new Scene(grid, SCREENWIDTH, SCREENHEIGHT);
        primaryStage.setTitle("Class14.21");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
     //put all the variables together and draw the worm segment
    public void SetDrawingVariables()
    {
        x1 = WormPath.CheckCoordX(currentx, currenty);
        y1 = WormPath.CheckCoordY(currentx, currenty);
        x2 = WormPath.CheckCoordX(newx, newy);
        y2 = WormPath.CheckCoordY(newx, newy);
        
        Line worm;
        
        worm = new Line(x1, y1, x2, y2);
        worm.setStroke(Color.RED);
        worm.setStrokeWidth(3);
        wormgroup.getChildren().add(worm);
        
        
    }
        

    public static void main(String[] args)
    {
        launch(args);
    }
        
        
        
}
    

    

    
