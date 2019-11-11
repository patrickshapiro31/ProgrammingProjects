/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class SliderFx extends Application
{


    private Slider slider;
    private Text text;
    Font f = new Font("serif", 20);


    public void start(Stage primaryStage)
    {
        text = new Text();

        text.setFont(f);
        text.setText("Changing text box!");
        slider = new Slider(0, 55, 20);
        slider.setShowTickMarks(true);
        slider.setPadding(new Insets(0, 20, 20, 20));
        
        

        BorderPane pane = new BorderPane();
        pane.setBottom(slider);
        pane.setCenter(text);
        
        
        slider.valueProperty().addListener(this::takeAction);
        
        pane.setStyle("-fx-background-color: grey");
        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setTitle("Ellipse Sliders");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void takeAction(ObservableValue<? extends Number> property,
            Object oldValue, Object newValue)
    {
        
        Font font = new Font("serif", slider.getValue());
        text.setFont(font);
    }
    
    
    public static void main (String[] args)
    {
        launch(args);
    }
}
