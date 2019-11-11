/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Class99 extends Application
{

    private Text text;
    private String inputstring;
    TextField textbox = new TextField();
    private ColorPicker colorPick; 

    


    public void start(Stage primaryStage)
    {
        Button enterbutton = new Button("Select");
        enterbutton.setOnAction(this::action);
        
        
        textbox.setMaxWidth(200);
        
        colorPick = new ColorPicker(Color.BLACK); 
        
        
                
        
        
        text = new Text();
        Font f = new Font("serif", 25);
        text.setFont(f);
        VBox pane = new VBox(enterbutton, textbox, colorPick, text);
        pane.setStyle("-fx-background-color: white");
        pane.setAlignment(Pos.TOP_CENTER);
        pane.setSpacing(50);
        Scene scene = new Scene(pane, 300, 400);
        
        scene.setOnKeyPressed(this::pressWhat);
        
        primaryStage.setTitle("Color Selection");
        primaryStage.setScene(scene);
        primaryStage.show();
        
 
        
        
        
    }
    
         public void pressWhat(KeyEvent event)
    {
        if (event.getCode() == ENTER)
        {
        text.setFill(colorPick.getValue());
        inputstring = textbox.getText();
        text.setText(inputstring);
        }
    }
    
    
        public void action(ActionEvent event)
    {
        
        
        text.setFill(colorPick.getValue());
        inputstring = textbox.getText();
        text.setText(inputstring);
        
    }
    
    
    
        public static void main (String[] args)
    {
        launch(args);
    }
}