package Class5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Patrick is a pimp
 */
public class Class517 extends Application 
{

    private Button redButton, blueButton, yellowButton, greenButton, purpleButton;
    private FlowPane pane;

    public void start(Stage primaryStage) 
    {
        redButton = new Button("Red");
        redButton.setOnAction(this::processColorButton);
        blueButton = new Button("Blue");
        blueButton.setOnAction(this::processColorButton);
        yellowButton = new Button("Yellow");
        yellowButton.setOnAction(this::processColorButton);
        greenButton = new Button("Green");
        greenButton.setOnAction(this::processColorButton);
        purpleButton = new Button("purple");
        purpleButton.setOnAction(this::processColorButton);
        pane = new FlowPane(redButton, blueButton, yellowButton, greenButton, purpleButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");
        Scene scene = new Scene(pane, 400, 100);
        primaryStage.setTitle("Pick a color!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processColorButton(ActionEvent event) 
    {
        if (event.getSource() == redButton) 
        {
            pane.setStyle("-fx-background-color: crimson");
        } 
        else if (event.getSource() == blueButton) 
        {
            pane.setStyle("-fx-background-color: deepskyblue");
        }
        else if (event.getSource() == yellowButton) 
        {
            pane.setStyle("-fx-background-color: gold");
        }
        else if (event.getSource() == greenButton) 
        {
            pane.setStyle("-fx-background-color: limegreen");
        }
        else if (event.getSource() == purpleButton) 
        {
            pane.setStyle("-fx-background-color: violet");
        }
        
        
    }
        public static void main (String[] args)
    {
        launch(args);
    }
}
