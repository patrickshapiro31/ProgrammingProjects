package Class14;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick Shapiro
 */
public class Class151 extends Application
{

    Button button = new Button("Draw!");
    Pane pane = new Pane();
    Scene scene = new Scene(pane, 289, 130);
    Image imagecard1;
    Image imagecard2;
    Image imagecard3;
    Image imagecard4;
    ImageView handpic1;
    ImageView handpic2;
    ImageView handpic3;
    ImageView handpic4;
    DeckofCards Deck = new DeckofCards();
    
    
    
    public void start(Stage primaryStage)
    {
            Deck.Shuffle();
    
    Card hand1 = new Card(Deck.draw());
    Card hand2 = new Card(Deck.draw());
    Card hand3 = new Card(Deck.draw());
    Card hand4 = new Card(Deck.draw());
    
    //I used the 'zzzcard' folder name to keep it seperate due to alphabetic sorting.
    handpic1 = new ImageView("/zzzcard/" + hand1 + ".png");
    handpic2 = new ImageView("/zzzcard/" + hand2 + ".png");
    handpic3 = new ImageView("/zzzcard/" + hand3 + ".png");
    handpic4 = new ImageView("/zzzcard/" + hand4 + ".png");
    
        pane.getChildren().add(handpic1);
        pane.getChildren().add(handpic2);
        pane.getChildren().add(handpic3);
        pane.getChildren().add(handpic4);
        pane.getChildren().add(button);
        handpic1.setX(0);
        handpic2.setX(72);
        handpic3.setX(144);
        handpic4.setX(216);
        

        button.setTranslateX(120);
        button.setTranslateY(100);
        button.setOnAction(this::KeyPress);
        
    
    
    // Create a scene and place it in the stage
    
    primaryStage.setTitle("Draw4"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    }
    
    public void KeyPress(ActionEvent event)
    {Action();}
        
    public void Action()
    {
  
    Deck.Shuffle();
    
    Card hand1 = new Card(Deck.draw());
    Card hand2 = new Card(Deck.draw());
    Card hand3 = new Card(Deck.draw());
    Card hand4 = new Card(Deck.draw());
    
    imagecard1 = new Image("/zzzcard/" + hand1 + ".png");
    handpic1.setImage(imagecard1);
    imagecard2 = new Image("/zzzcard/" + hand2 + ".png");
    handpic2.setImage(imagecard2);
    imagecard3 = new Image("/zzzcard/" + hand3 + ".png");
    handpic3.setImage(imagecard3);
    imagecard4 = new Image("/zzzcard/" + hand4 + ".png");
    handpic4.setImage(imagecard4);    
        
        
    }
    
    
    
    
    public static void main(String[] args) 
  {
    launch(args);
  }
    
    
    
    
    
    
}
