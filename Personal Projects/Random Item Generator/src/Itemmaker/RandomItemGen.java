package Itemmaker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Patrick is a pimp
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



public class RandomItemGen extends Application
{
    
    FlowPane pane;
    FlowPane pane2;
    FlowPane pane3;

    private Text countText;
    //--------------------------------------------------------------------
    // Presents a GUI containing a button and text that displays
    // how many times the button is pushed.
    //--------------------------------------------------------------------


    public void start(Stage primaryStage)
    {

                
        countText = new Text("Item Field");
        Font font = new Font(18);
        countText.setFont(font);
        countText.setTextAlignment(TextAlignment.CENTER);
        Button push = new Button("Generate!");
        Button hard = new Button("Hard Item");
        Button soft = new Button("Cloth Item");
        Button art = new Button("Artwork");
        
        
        push.setOnAction(this::Press);
        hard.setOnAction(this::Presshard);
        soft.setOnAction(this::Presssoft);
        art.setOnAction(this::Pressart);
        
        
        
        pane = new FlowPane(push);
        pane.setTranslateX(365);
        pane.setTranslateY(100);
        
        pane2 = new FlowPane(hard, soft, art);
        pane2.setHgap(20);
        pane2.setTranslateX(275);
        pane2.setTranslateY(150);
        
        pane3 = new FlowPane(countText);
        pane3.setTranslateX(200);
        pane3.setTranslateY(200);
        Group group = new Group(pane, pane2, pane3);
        
        
        countText.setTextAlignment(TextAlignment.CENTER);

        
        pane.setStyle("-fx-background-color: white");
        Scene scene = new Scene(group, 820, 480);
        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane3.setAlignment(Pos.CENTER);
    }
//--------------------------------------------------------------------
// Updates the counter and text when the button is pushed.
//--------------------------------------------------------------------

    public void Press(ActionEvent event)
    {
        int rando;
        String printit;
        Item item;
        item = new Item();
        rando = (int) (Math.random() * (100) + 1);
        
        if (rando <= 40)
            printit = item.createmundanehard();
        else if (rando <= 80)
            printit = item.createmundanesoft();
        else
            printit = item.createartwork();
        
        printit = printit.replace('_', ' ');
        countText.setText(printit);
        pane3.setAlignment(Pos.CENTER);
        
        
    }
    
        public void Presshard(ActionEvent event)
    {
        String printit;
        Item item;
        item = new Item();
        printit = item.createmundanehard();
        printit = printit.replace('_', ' ');
        countText.setText(printit);
        pane3.setAlignment(Pos.CENTER);
    }
        
    public void Presssoft(ActionEvent event)
    {
        String printit;
        Item item;
        item = new Item();
        printit = item.createmundanesoft();
        printit = printit.replace('_', ' ');
        countText.setText(printit);
        pane3.setAlignment(Pos.CENTER);
        
    }
    
        public void Pressart(ActionEvent event)
    {
        String printit;
        Item item;
        item = new Item();
        printit = item.createartwork();
        printit = printit.replace('_', ' ');
        countText.setText(printit);
        pane3.setAlignment(Pos.CENTER);
    }
    

    public static void main (String[] args)
    {
        launch(args);
    }

}
