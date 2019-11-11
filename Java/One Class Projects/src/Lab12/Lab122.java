/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;
//By Patrick Shapiro (Modiefied Clockpane and parent program)

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class Lab122 extends Application 
{
   public int seconds;
   TextField settime = new TextField();
   CountdownClockPane clock = new CountdownClockPane(); // Create a clock
   Timeline animation;
   Text countdown;
   
   
    
    
  public void start(Stage primaryStage) 
  {
    animation = new Timeline(new KeyFrame(Duration.millis(1000)));
    animation.stop();
    
      
    Text label = new Text("Seconds Remaining");
    Text label2 = new Text("Set Seconds");
    countdown = new Text("0");
    settime.setPrefWidth(100);
    settime.setAlignment(Pos.BOTTOM_LEFT);

    
    
    FlowPane tophud = new FlowPane(label, countdown);
    FlowPane bottomhud = new FlowPane(label2, settime);
    label.setTextAlignment(TextAlignment.CENTER);
    tophud.setTranslateX(50);
    tophud.setHgap(10);
    bottomhud.setTranslateY(240);
    bottomhud.setTranslateX(40);
    bottomhud.setHgap(10);
    
    
    

    
    // Create a scene and place it in the stage
    
       settime.setOnKeyPressed(e -> 
            { 
      switch (e.getCode()) 
      {case ENTER: keyPressed(e); break;}
            });

    
    
    
    Pane root = new Pane(clock, tophud, bottomhud);
    Scene scene = new Scene(root, 250, 270);
    primaryStage.setTitle("ClockAnimation"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public void keyPressed(KeyEvent event) 
    {
        
    seconds = Integer.parseInt(settime.getText().replaceAll("[^0-9]", ""));
     // Set a new clock time
     clock.setCurrentTime(seconds);
    animation.stop();
    EventHandler<ActionEvent> eventHandler = e -> 
    {
      clock.setNewTime(); // Set a new clock time
      if(clock.getTime() == 0)
          animation.stop();
      seconds = clock.getTime();
      countdown.setText(" " + seconds);
    };

    
    animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
    }

  
 
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) 
  {
    launch(args);
  }
}
