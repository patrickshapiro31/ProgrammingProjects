/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Class611 extends Application
{

    public void start(Stage primaryStage)
    {
        int rando;
        Line[] line = new Line[20];
        
        
        for (int count = 0; count < 20; count++)
        {
            rando = (int) (Math.random() * ((200) + 1));
            line[count] = new Line(((1 + count) * 20), (220 - (rando)), 
                    ((1 + count) * 20), (220 + (rando)));
            line[count].setStroke(Color.RED);
        }
        
        

        Group root = new Group(line);
        Scene scene = new Scene(root, 420, 420, Color.WHITE);
        primaryStage.setTitle("Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}