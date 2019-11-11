/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Patrick Shapiro
 */
public class Class1421 extends Application
{
    
        int cirX = 0;
        int cirY = 0;
        Circle cir = new Circle(cirX, cirY, 15);
        int cir2X = 0;
        int cir2Y = 0;
        Circle cir2 = new Circle(cir2X, cir2Y, 15);
        final int SCREENWIDTH = 480;
        final int SCREENHEIGHT = 480;
        
        Line line = new Line(0, 0, 0, 0);
        Text distanceText = new Text(150, 30, " ");


        
        public void start(Stage primaryStage)
    {

        cir.setFill(Color.BLACK);
        cir2.setFill(Color.BLACK);
        
        //run the event that calculates the locations
        Press();
        
        //An event to easilly run the program again!
        Button jumper = new Button("Jump!");
        FlowPane pane = new FlowPane(jumper);
        pane.setTranslateX(210);
        pane.setTranslateY(30);
        jumper.setOnAction(this::KeyPress);
        

        
        Group circlejump = new Group(cir, cir2, pane, line, distanceText);
        Scene scene = new Scene(circlejump, SCREENWIDTH, SCREENHEIGHT);
        
        primaryStage.setTitle("Class14.21");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void KeyPress(ActionEvent event)
    {Press();}
        
    public void Press()
    {
        //Randomise the locations, ensuring they remain well within the screen
        cirX = (int) (Math.random() * (SCREENWIDTH - 60) + 30);
        cirY = (int) (Math.random() * (SCREENHEIGHT - 60) + 30);
        cir2X = (int) (Math.random() * (SCREENWIDTH - 60) + 30);
        cir2Y = (int) (Math.random() * (SCREENHEIGHT - 60) + 30);

        cir.setCenterX(cirX);
        cir.setCenterY(cirY);
        cir2.setCenterX(cir2X);
        cir2.setCenterY(cir2Y);
        
        //Draw the line
        line.setStartX(cirX);
        line.setStartY(cirY);
        line.setEndX(cir2X);
        line.setEndY(cir2Y);
        
        //Get the difference between the X points and Y points, remove negatives
        double modifiedx = (cirX - cir2X);
        double modifiedy = (cirY - cir2Y);
        if (modifiedx < 0)
        {modifiedx *= -1;}
        if (modifiedy < 0)
        {modifiedy *= -1;}
        
        //Calculate them out. Doesn't this code look familiar?
        double distance = Math.sqrt(modifiedx * modifiedx + modifiedy * modifiedy);
        String distanceStr = String.format("%.2f", distance);
        distanceText.setText(distanceStr);
        
        //Find the location of the line's center
        if (cirX > cir2X)
        {distanceText.setX(cirX - (modifiedx / 2));}
        else
        {distanceText.setX(cir2X - (modifiedx / 2));}
        
        if (cirY > cir2Y)
        {distanceText.setY(cirY - (modifiedy / 2));}
        else
        {distanceText.setY(cir2Y - (modifiedy / 2));}
        
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
    
    
