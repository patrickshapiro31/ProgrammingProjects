/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

/**
 *
 * @author patrick.shapiro
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

//************************************************************************
// PushCounter.java Author: Lewis/Loftus
//
// Demonstrates JavaFX buttons and event handlers.
//************************************************************************

public class Class710 extends Application
{

    private int count;
    private int exp = 0;
    private double levelup = 5;
    private int level = 1;
    private Text countText, levelText, heckleText;
    FlowPane pane, pane2, pane3;
    Group group = new Group();
    Scene scene = new Scene(group, 400, 500);
    //--------------------------------------------------------------------
    // Presents a GUI containing a button and text that displays
    // how many times the button is pushed.
    //--------------------------------------------------------------------


    public void start(Stage primaryStage)
    {
        count = 0;
        countText = new Text("Clicks: 0");
        levelText = new Text("Level " + level);
        heckleText = new Text ("Start Clicking!");
        
        

        
        pane = new FlowPane(countText);
        pane2 = new FlowPane(levelText);
        pane3 = new FlowPane(heckleText);
        pane.setAlignment(Pos.TOP_CENTER);
        pane2.setAlignment(Pos.TOP_CENTER);
        pane2.setTranslateY(25);
        pane3.setAlignment(Pos.TOP_CENTER);
        pane3.setTranslateY(50);
        
        group = new Group(pane, pane2, pane3);
        
        scene = new Scene(group, 400, 500);
        scene.setOnMouseClicked(this::processMouseClick);
        primaryStage.setTitle("Click Hero");
        primaryStage.setScene(scene);
        primaryStage.show();
        

    }
//--------------------------------------------------------------------
// Updates the counter and text when the button is pushed.
//--------------------------------------------------------------------

    public void processMouseClick(MouseEvent event)
    {
        
        
        count++;
        exp++;
        countText.setText("Clicks: " + count);
        
        if (level == 100)
        {
            countText.setText("Clicks: LOTS");
            levelText.setText("Level " + level + " Max!");
            count = 10;
            exp = 10;
            levelup = 20;
        }
        if (exp >= levelup)
        {
            level++;
            levelup = levelup * 1.05;
            exp = 0;
        }
        
        levelText.setText("Level " + level);
        
        if (level == 1)
            heckleText.setText("That's the way!");
        if (level == 5)
            heckleText.setText("Keep going! There's more!");
        if (level == 10)
        {
            heckleText.setText("BOOM! LEVEL 10! GREY!");
            scene.setFill(Color.GREY);
        }
        if (level == 15)
            heckleText.setText("15! More!");
        if (level == 20)
        {
            heckleText.setText("20, now for a real color!");
            scene.setFill(Color.YELLOW);
        }
        if (level == 23)
            heckleText.setText("Yeah, yellow's an eyesore, but it's low level still");
        if (level == 27)
            heckleText.setText("Not sure why you'd keep going. the levels are taking longer now.");
        if (level == 30)
        {
            heckleText.setText("Ugh, purple. You know, I'm a programming 1 student, this is all there is.");
            scene.setFill(Color.PURPLE);
        }
        if (level == 32)
            heckleText.setText("Just some color changes.");
        if (level == 35)
            heckleText.setText("Ok, I know what you're looking for, a failsafe for int overflow");
        if (level == 37)
            heckleText.setText("Don't worry, it's there, just check the code!");
        if (level == 39)
            heckleText.setText("In fact, that's probably what you're doing right now isn't it?");
        if (level == 40)
            scene.setFill(Color.PINK);
        if (level == 44)
            heckleText.setText("You're probably too smart to click hundreds of times on a pink screen");
        if (level == 50)
        {
            heckleText.setText("But what about an enticing orange one?!");
            scene.setFill(Color.ORANGE);
        }
        if (level == 53)
            heckleText.setText("Well, a few more color changes and this will be done");
        if (level == 60)
            scene.setFill(Color.GREEN);
        if (level == 70)
            scene.setFill(Color.GOLD);
        if (level == 73)
            heckleText.setText("Um... in case you were wondering, this one's gold... not yellow");
        if (level == 77)
            heckleText.setText("Alright, have fun clicking again.");
        if (level == 80)
            scene.setFill(Color.RED);
        if (level == 90)
            scene.setFill(Color.BLUE);
        if (level == 100)
        {
            heckleText.setText("Well, you're done. Congradulations. See, I told you there was a failsafe.");   
            scene.setFill(Color.WHITE);
        }
        
    }
    
    public static void main (String[] args)
    {
        launch(args);
    }
    

    
}
