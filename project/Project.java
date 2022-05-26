/*
This class contains the main method and excution begin from here

*/
package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Project extends Application {
   public  static Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
       /*This statement Display the fxml file*/
       
        Parent root = FXMLLoader.load(getClass().getResource("cover_of_tictactoe.fxml"));
        
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
        this.stage = stage; 
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
