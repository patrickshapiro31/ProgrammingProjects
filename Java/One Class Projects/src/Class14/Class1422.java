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
public class Class1422 extends Application
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
        Text cir1text = new Text(150, 30, "1");
        Text cir2text = new Text(150, 30, "2");


        
        public void start(Stage primaryStage)
    {
        cir.setStrokeWidth(1);
        cir2.setStrokeWidth(1);
        cir.setFill(Color.WHITE);
        cir2.setFill(Color.WHITE);
        cir.setStroke(Color.BLACK);
        cir2.setStroke(Color.BLACK);

        
        //run the event that calculates the locations
        Press();
        
        
        //An event to easilly run the program again!
        Button jumper = new Button("Jump!");
        FlowPane pane = new FlowPane(jumper);
        pane.setTranslateX(210);
        pane.setTranslateY(30);
        jumper.setOnAction(this::KeyPress);
        

        
        Group circlejump = new Group(line, cir, cir2, pane, cir1text, cir2text);
        Scene scene = new Scene(circlejump, SCREENWIDTH, SCREENHEIGHT);
        
        primaryStage.setTitle("Class 14.22");
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
        

        

        
        /*After 4 hours of trying to find the radius point of the circle, I noticed
        that the assignment said 'filled' circles. I came close to finishing it the
        other way, just so you know. Afterwards, completing the project took about 3
        minutes. I just... really... don't want this torment to go undocumented.
        */
        
        line.setStartX(cirX);
        line.setStartY(cirY);
        line.setEndX(cir2X);
        line.setEndY(cir2Y);


        //Text
        cir1text.setX(cirX);
        cir1text.setY(cirY);
        cir2text.setX(cir2X);
        cir2text.setY(cir2Y);
        
        cir.toFront();
        cir2.toFront();
        cir1text.toFront();
        cir2text.toFront();
        
    }
    
    
    
    
    

    public static void main(String[] args)
    {
        launch(args);
    }
}
    
    
