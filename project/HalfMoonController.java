/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import classwork.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author KIMOK
 */
public class HalfMoonController implements Initializable {
   static int count=0;
    @FXML
    private AnchorPane bigpane;
    @FXML
    private Circle moon;
    @FXML
    private AnchorPane smallpane;

    /**
     * Initializes the controller class.
     */
    @Override
     
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        smallpane.setVisible(false); 
    }    

    @FXML
    private void action(MouseEvent event) {
       
       if(count==0){
           count++;
        bigpane.styleProperty().set("-fx-background-color: #142332");
        smallpane.setVisible(false); 
        smallpane.styleProperty().set("-fx-background-color: #142332");
    }   
       if(count==1){
           smallpane.setVisible(true); 
       }
    }
    
}
