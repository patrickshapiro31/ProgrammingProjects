package Gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author patrick.shapiro
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
//************************************************************************
// FahrenheitConverter.java Author: Lewis/Loftus
//
// Demonstrates the use of a TextField and a GridPane.
//************************************************************************

public class FahrenheitConverter extends Application
{
//--------------------------------------------------------------------
// Launches the temperature converter application.
//--------------------------------------------------------------------

    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new FahrenheitPane(), 300, 150);
        primaryStage.setTitle("Fahrenheit Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
    
}
