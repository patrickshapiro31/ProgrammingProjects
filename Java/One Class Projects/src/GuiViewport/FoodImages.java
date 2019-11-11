/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiViewport;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//************************************************************************
// FoodImages.java Author: Lewis/Loftus
//
// Demonstrates a split pane and a list view.
//************************************************************************

public class FoodImages extends Application
{

    private Image[] foodImages;
    private ImageView imgView;
    private ListView<String> listView;
//--------------------------------------------------------------------
// Displays a split pane with a list of food items on the left
// and an image of the selected food item on the right.
//--------------------------------------------------------------------

    public void start(Stage primaryStage)
    {
        String[] food =
        {
            "apples", "asparagus", "bacon", "bread",
            "carrots", "cheesecake", "eggs", "hamburger", "muffins",
            "onions", "oranges", "pancakes", "peanuts", "pizza",
            "potatoes", "pretzels", "spaghetti", "sushi", "watermelon"
        };
        foodImages = new Image[food.length];
        for (int i = 0; i < food.length; i++)
        {
            foodImages[i] = new Image(food[i] + ".jpg");
        }
        imgView = new ImageView(foodImages[0]);
        StackPane imgPane = new StackPane(imgView);
        imgPane.setMinWidth(300);
        imgView.setPreserveRatio(true);
        imgView.fitWidthProperty().bind(imgPane.widthProperty());
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(food);
        listView = new ListView<String>(list);
        listView.setMinWidth(100);
        listView.getSelectionModel().select(0);
        listView.getSelectionModel().selectedItemProperty().addListener(
                this::processListSelection);
        SplitPane root = new SplitPane();
        root.setDividerPositions(0.25);
        root.getItems().addAll(listView, imgPane);
        Scene scene = new Scene(root, 600, 350);
        primaryStage.setTitle("Food Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//--------------------------------------------------------------------
// Processes a list view selection by getting the index of the
// selected item and displaying the corresponding image.
//--------------------------------------------------------------------

    public void processListSelection(ObservableValue<? extends String> val,
            String oldValue, String newValue)
    {
        int index = listView.getSelectionModel().getSelectedIndex();
        imgView.setImage(foodImages[index]);
    }
        public static void main(String[] args)
    {
        launch(args);
    }
}
