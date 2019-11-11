/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

/**
 *
 * @author patrick.shapiro
 */
public class Class311 extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        Circle blue = new Circle(100, 100, 75, Color.BLUE);
        Circle yellow = new Circle(180, 180, 75, Color.YELLOW);
        Circle black = new Circle(260, 100, 75, Color.BLACK);
        Circle green = new Circle(340, 180, 75, Color.GREEN);
        Circle red = new Circle(420, 100, 75, Color.RED);
       
        Group rings = new Group(black, green, yellow, blue, red);
        Scene scene = new Scene(rings, 500, 350, Color.WHITE);
        primaryStage.setTitle("Olympics");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
