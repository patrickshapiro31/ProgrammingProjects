/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 

/**
 *
 * @author Patrick Shapiro
 */
public class Lab121 extends Application
{
    TextField filename;
    String nameoffile;
    int[] lettercount = new int[26];
    Histo graph = new Histo();
    
    
    public void start(Stage primaryStage) 
    {
        
        Label label = new Label("Document Name:");
        
        filename = new TextField();
        filename.setPrefWidth(200);
        filename.setAlignment(Pos.BOTTOM_LEFT);
        //filename.setOnAction(this::Activate);
        Button button = new Button("View");
        
        button.setTranslateX(200);
        label.setTranslateX(-100);
        label.setTranslateY(5);
        graph.setTranslateY(-220);
        graph.setTranslateX(-120);
        
        

        button.setOnAction(this::ButtonPress);

            filename.setOnKeyPressed(e -> 
            { 
      switch (e.getCode()) 
      {case ENTER: keyPressed(e); break;}
            });
        
        
        
        Group root = new Group(label, filename, button, graph);
        Scene scene = new Scene(root, 400, 300, Color.WHITE);
        root.setTranslateX(115);
        root.setTranslateY(260);
        primaryStage.setTitle("Lab 12, Program 1");
        primaryStage.setScene(scene);
        primaryStage.show();
        

        
        
    }
    
public void keyPressed(KeyEvent e) 
    {

            try
            {
            Activate();
            }
            catch (FileNotFoundException exception)
            {
            System.out.println("File not Found");
            }
    }
        
        
        public void ButtonPress (ActionEvent event) 
    {
        try
        {
        Activate();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("File not Found");
        }
        

    }
        
        
        
        
        
        
        
        
        
        public void Activate() throws FileNotFoundException
    {
        for (int i = 0; i < 26; i++)
        {lettercount[i] = 0;}
        
        
        Scanner fileScan;
        
        try
        {
        fileScan = new Scanner(new File(filename.getText()));
        }
        catch (FileNotFoundException exception)
        {
            throw exception;
        }     
        
        
        
        
        
        char nextchar;
        String nextword;
        int length;
        while (fileScan.hasNextLine())
        {
                
            nextword = fileScan.nextLine();
            length = nextword.length();
            
            if (length != 0)
            {
                for (int x = 0; x < length; x++)
                {
                
                nextchar = nextword.charAt(x);
                nextchar = Character.toUpperCase(nextchar);
                for (int i = 0; i < 26; i++)
                {
                    if (nextchar == i + 65)
                        lettercount[i]++;
                }
                
                }
            }
        }
        graph.setCounts(lettercount);
        
    }
    

        
    
    public static void main(String[] args) throws FileNotFoundException
    {
        launch(args);
    }
   
}
