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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author KIMOK
 */
public class Cover_of_tictactoeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private AnchorPane parent;
    @FXML
    private AnchorPane parent1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     
    fadetransition();
    } 

    @FXML
    private void handle(MouseEvent event) {
  
    } private void fadetransition(){
  /*
     Fade transition betwen the two pages
        */
        
        FadeTransition fadetransition=new FadeTransition();
   
   fadetransition.setDuration(Duration.seconds(5));
   fadetransition.setNode(parent1);
   fadetransition.setFromValue(1);
   fadetransition.setToValue(0);
   fadetransition.setOnFinished(new EventHandler<ActionEvent>() {
       @Override
       public void handle(ActionEvent event) {
              loadsecond(); }});
   
   fadetransition.play();
   }
   private void loadsecond(){
   
        try {
            Parent scondparent;  
           scondparent =(AnchorPane) FXMLLoader.load(getClass().getResource("TicTacToe.fxml"));
         
           Scene newScene;
           newScene=new Scene(scondparent);
           
           Stage mainWindow;
           mainWindow=(Stage) parent1.getScene().getWindow();
           mainWindow.setScene(newScene);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       
    
}
