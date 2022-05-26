/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.scene.layout.StackPane;

/**
 *
 * @author KIMOK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane parent;
    public static AnchorPane root;
    @Override
    
    
    public void initialize(URL url, ResourceBundle rb) {
    fadetransition();
    }
    
    
    public void fadetransition(){    
    
        try{
            
     StackPane pane=FXMLLoader.load(getClass().getResource(("test.fxml")));
     root.getChildren().setAll(pane);
        FadeTransition fadeIn;
        fadeIn = new FadeTransition(Duration.seconds(3), pane);
   
     
    fadeIn.setCycleCount(1);
    fadeIn.setFromValue(0.2);
    fadeIn.setToValue(1);
    fadeIn.setAutoReverse(true);
   
  
FadeTransition fadeOut;
fadeOut=new FadeTransition(Duration.seconds(3),pane);
    
    fadeOut.setCycleCount(1);
    fadeOut.setFromValue(0.2);
    fadeOut.setToValue(1);
    fadeOut.setAutoReverse(true);
   
       fadeIn.play();   
      fadeIn.setOnFinished((e)-> fadeOut.play());
    
    fadeOut.setOnFinished(e-> {
  
         try {
  
               AnchorPane Parentpane = FXMLLoader.load(getClass().getResource(("TicTacToe.fxml")));
                  root.getChildren().setAll(pane);             
         } catch (IOException ex) {
             Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
         }
  });    
    
    }catch(IOException ex){
    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE,null,ex);}}

    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);    }
    
}
 