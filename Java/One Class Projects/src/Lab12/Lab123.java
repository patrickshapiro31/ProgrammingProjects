/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Lab123 extends Application {
    
        ImageView[] flagview = 
        {
    new ImageView("image/denmark.gif"), 
    new ImageView("image/germany.gif"), 
    new ImageView("image/china.gif"),
    new ImageView("image/india.gif"), 
    new ImageView("image/norway.gif"),
    new ImageView("image/uk.gif"), 
    new ImageView("image/us.gif")
        };
        
        String[] flags =
        {
        "denmark", "germany", "china", "india", "norway", "uk", "us" 
        };
     
        ComboBox<String> flagbox = new ComboBox<>();

        
        DescriptionPane complane;
        MediaPlayer mediaPlayer;
        

         
         



  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
      


         
            

    
 

    Button playButton = new Button(">");
    playButton.setOnAction(e -> {
      if (playButton.getText().equals(">")) 
      {
        String string = ("audio/" + flagbox.getValue() + ".mp3");
        Media anthem = new Media(new File(string).toURI().toString());
        mediaPlayer = new MediaPlayer(anthem);
        mediaPlayer.play();
        playButton.setText("||");
      } 
      else 
      {
        mediaPlayer.stop();
        playButton.setText(">");
      }
    });


    
    complane = new DescriptionPane();
    complane.setScaleX(4.7);
    complane.setScaleY(4.7);
    complane.setTranslateX(130);
    complane.setTranslateY(-180);


    BorderPane pane = new BorderPane();
    BorderPane paneForComboBox = new BorderPane();
    paneForComboBox.setTop(complane);
    paneForComboBox.setLeft(new Label("Select a country: "));
    paneForComboBox.setCenter(flagbox);
    paneForComboBox.setRight(playButton);
    pane.setBottom(paneForComboBox);
    flagbox.setPrefWidth(150);
    flagbox.setTranslateX(-175);
    playButton.setTranslateX(-350);
    
    ObservableList<String> items = 
    FXCollections.observableArrayList(flags);
    flagbox.getItems().addAll(items);
    flagbox.setValue("denmark");
    setDisplay(0);    
    flagbox.setOnAction(e -> setDisplay(items.indexOf(flagbox.getValue())));

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 650, 500);
    primaryStage.setTitle("Flag Anthems"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage    
  }
  
  public void setDisplay(int index) 
  {
    complane.setImageView(flagview[index]);
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}