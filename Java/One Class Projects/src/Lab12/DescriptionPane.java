/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class DescriptionPane extends BorderPane {
  /** Label for displaying an image and a title */
  private Label lblImageTitle = new Label();


  
  public DescriptionPane() {
    // Center the icon and text and place the text under the icon
    lblImageTitle.setContentDisplay(ContentDisplay.TOP);
    lblImageTitle.setPrefSize(200,  100);
    
    // Set the font in the label and the text field
    lblImageTitle.setFont(new Font("SansSerif", 16));




    // Place label and scroll pane in the border pane
    setCenter(lblImageTitle);
    setPadding(new Insets(5, 5, 5, 5));
  }
  
  /** Set the title */
  public void setTitle(String title) {
    lblImageTitle.setText(title);
  }

  /** Set the image view */
  public void setImageView(ImageView icon) {
    lblImageTitle.setGraphic(icon);
  }


}