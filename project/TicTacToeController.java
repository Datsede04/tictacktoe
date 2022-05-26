
package project;
/*
The libray file used in the tictactoe
*/
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import sun.plugin.javascript.navig.Anchor;


public class TicTacToeController implements Initializable {
   
    /*
    Global private variable used
  */
    
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b6;
    @FXML
    private Button b5;
    @FXML
    private Button b4;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Label w1;
    @FXML
    private Label w2;
    @FXML
    private Label d1;
    @FXML
    private Label d2;
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Button start;
    @FXML
    private Label winner;
    @FXML
    private Button replay;
    @FXML
    private TextField y1;
    @FXML
    private TextField y2;
    @FXML
    private Label lname1;
    @FXML
    private Label lname2;
    static int counter=0,control=1;
    static int draw=0;
    static int turns=0;
    static int ww1=0,ww2=0,ll1=0,ll2=0,dd1=0,dd2=0;
    @FXML
    private Label ln1;
    @FXML
    private Label ln2;
    @FXML
    private Label xo1;
    @FXML
    private Label xo2;
    @FXML
    private Label lturn;
    private AnchorPane root;
    public static AnchorPane rootp;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           
      /*
        Initial conditions(states)   of the program
           1. making all buttons disable (unclikiable)
           2.making the the name contaning lable disable
           3.win,draw,lose,state inisialize to  zero
           4.Inisialize the turn to Null;
     */
                b1.setDisable(true);
                b2.setDisable(true);
                b3.setDisable(true);
                b4.setDisable(true);
                b5.setDisable(true);
                b6.setDisable(true);
                b7.setDisable(true);
                b8.setDisable(true);
                b9.setDisable(true);
                
                replay.setDisable(true);
                lname1.setVisible(false);
                lname2.setVisible(false);
                
                xo1.setText("");
                xo2.setText("");    
                w1.setText("0");
                w2.setText("0");
                l1.setText("0");
                l2.setText("0");
                d1.setText("0");
                d2.setText("0");
                
               winner.setText(""); 
               lturn.setText("");
}
    @FXML
    private void start_on(ActionEvent event) {
        
        /*
        events which are goimg to happen the start button is clicked
        1.making visible the invisible lable duing initialization
          and the make invisible the textfield used to accept name of the player
        2.making Enable(clickable)the buttons)
        
        */
        
        String name1,name2;
        
        name1=y1.getText();
        name2=y2.getText();
                      
        y1.setVisible(false);
        y2.setVisible(false);

        lname1.setText(name1);
        lname2.setText(name2);

        ln1.setText(name1); 
        ln2.setText(name2);

        lname1.setVisible(true);
        lname2.setVisible(true);
 
        xo1.setText("X");
        xo2.setText("O");   

        b1.setDisable(false);
        b2.setDisable(false);
        b3.setDisable(false);
        b4.setDisable(false);
        b5.setDisable(false);
        b6.setDisable(false);
        b7.setDisable(false);
        b8.setDisable(false);
        b9.setDisable(false);
        replay.setDisable(false);
        
        lturn.setText("X");
    }
    

    @FXML
    private void button_on(ActionEvent event) {
       /*
        Events happens after the cliking any button
        
        1. control the turn of the player 
         2. make the cliked buttons except for the replay button become  disable
        */
        
        if(control%2==0){
                    control++;
                    lturn.setText("X");          
                  }
        else{
                    control++;
                    lturn.setText("O");
                 }
       
       
               draw++;/*to count the totalclike make to check the draw conditon in the game*/
    
               
    if(event.getSource()==replay){
         /*
        1.reinitalizing the controler intigers draw,counter ,control
        2.change the player palying contion like if player 1 was playing as X
           the now player 1 plays as O and viceversa
        3.making the button enable (clickabel) 
        4.change the button text to null
        5. winner label will be canged into null
        
        */       
                  draw=0;
                  counter=0;
                  control=1;
                  lturn.setText("X");
                  
                     if(turns%2==0){
                          xo1.setText("O");
                          xo2.setText("X"); 
                          turns++;
                          }
                     else{
                         xo1.setText("X");
                         xo2.setText("O");
                        turns++;   
                     }
                     
                    
                      b1.setText("");
                      b2.setText("");
                      b3.setText("");
                      b4.setText("");
                      b5.setText("");
                      b6.setText("");
                      b7.setText("");
                      b8.setText("");
                      b9.setText("");
                      
                    winner.setText("");
                      
                   b1.setDisable(false);
                   b2.setDisable(false);
                   b3.setDisable(false);
                   b4.setDisable(false);
                   b5.setDisable(false);
                   b6.setDisable(false);
                   b7.setDisable(false);
                   b8.setDisable(false);
                   b9.setDisable(false);


                    }
if(event.getSource()==b1){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
                    if(b1.getText()=="")
                    {                       
                        if(counter==1){
                            b1.setText("O"); 
                             counter--;
                        }
                        
                       else{ 
                           b1.setText("X");
                           counter++;
                           }
                  b1.setDisable(true);
                                 }
             }

if(event.getSource()==b2){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
                if(b2.getText()==""){
                       
                    if(counter==1){
                         b2.setText("O"); 
                          counter--;
                     }
                    else{ 
                        b2.setText("X");
                        counter++;
                        }
                    b2.setDisable(true);
                      } 
         }
    

    if(event.getSource()==b3){            
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
                if(b3.getText()==""){
                          
                        if(counter==1){
                            b3.setText("O"); 
                             counter--;
                           }
                       else{ 
                           b3.setText("X");
                           counter++;
                           }
                           }
                       b3.setDisable(true);
                   }
           
     
if(event.getSource()==b4){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
                    if(b4.getText()==""){
                            if(counter==1){
                                 b4.setText("O"); 
                                  counter--;
                             }
                            else{ 
                                b4.setText("X");
                                counter++;
                                }
                     b4.setDisable(true);}
                      }
     
if(event.getSource()==b5){
     /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */

                    if(b5.getText()==""){
                          if(counter==1){
                                b5.setText("O"); 
                                 counter--;
                            }
                           else{ 
                               b5.setText("X");
                               counter++;
                               }
                    b5.setDisable(true);} 
                     }
     
if(event.getSource()==b6){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
    
                    if(b6.getText()==""){
                          if(counter==1){
                                 b6.setText("O"); 
                                  counter--;
                             }
                            else{ 
                                b6.setText("X");
                                counter++;
                                }
                     b6.setDisable(true);}
                  }
      
if(event.getSource()==b7){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
    
                    if(b7.getText()==""){
                            if(counter==1){
                                 b7.setText("O"); 
                                  counter--;
                             }
                            else{ 
                                b7.setText("X");
                                counter++;
                                }
                     b7.setDisable(true);}  
                     }

if(event.getSource()==b8){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */
    
                    if( b8.getText()==""){
                          if(counter==1){
                                 b8.setText("O"); 
                                  counter--;
                             }
                            else{ 
                                b8.setText("X");
                                counter++;
                                }
                     b8.setDisable(true);}
                    }
    
if(event.getSource()==b9){
    /*
    1 Set text according to the counter in to the button
    2. make the button disabele
    */

                    if(b9.getText()==""){
                           if(counter==1){
                                 b9.setText("O"); 
                                  counter--;
                             }
                            else{ 
                                b9.setText("X");
                                counter++;
                                }
                     b9.setDisable(true);}
    }
    /*
put the value in the buttons in to String valrables
    */ 
            String _0=b1.getText();
            String _1=b2.getText();
            String _2=b3.getText();
            String _3=b4.getText();
            String _4=b5.getText();
            String _5=b6.getText();
            String _6=b7.getText();
            String _7=b8.getText();
            String _8=b9.getText();
      
    /*
            1.Declare the winner accoring to the conditions.
            2.make the uncliked button unclicable(disable )except for replay
    */
    
    /*
    Winning game for the player play with X;
    */
if(_0==("X") && _1==("X") && _2==("X")){
 
                        lturn.setText("");
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);

           
                if(xo1.getText()=="X"){
                
                           ww1++;   
                           ll2++;
                           l2.setText(""+ll2);
                           w1.setText(""+ww1); 
                           winner.setText("Winner: "+ln1.getText()); 
                               }
                else{
                           ww2++;
                           ll1++;
                           l1.setText(""+ll1);
                           w2.setText(""+ww2);
                           winner.setText("Winner: "+ln2.getText());
                          }
       }
if(_3==("X") && _4==("X") && _5==("X")){
                        
                        lturn.setText("");
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);
                              
                if(xo1.getText()=="X"){
                             
                              ww1++;   
                              ll2++;
                              l2.setText(""+ll2);
                              w1.setText(""+ww1);          
                              winner.setText("Winner: "+ln1.getText()); 
                                   }
                    else{
                              ww2++;
                              ll1++;
                              l1.setText(""+ll1);
                              w2.setText(""+ww2);
                              winner.setText("Winner: "+ln2.getText());
                             }
           }
if(_6==("X") && _7==("X") && _8==("X")){
                     
                        lturn.setText("");
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);
                 
            if(xo1.getText()=="X"){
                           
                            
                             ww1++;   
                             ll2++;
                             l2.setText(""+ll2);
                             w1.setText(""+ww1);          
                             winner.setText("Winner: "+ln1.getText()); 
                               }
                    else{
                             ww2++;
                             ll1++;
                             l1.setText(""+ll1);
                             w2.setText(""+ww2);
                             winner.setText("Winner: "+ln2.getText());
                            }

    }
if(_0==("X") && _4==("X") && _8==("X")){
                        
                        lturn.setText("");
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);

            if(xo1.getText()=="X"){
                                 
                                 ww1++;   
                                 ll2++;
                                 l2.setText(""+ll2);
                                 w1.setText(""+ww1);          
                                 winner.setText("Winner: "+ln1.getText());                    
                             }
                    else{
                                 ww2++;
                                 ll1++;
                                 l1.setText(""+ll1);
                                 w2.setText(""+ww2);
                                 winner.setText("Winner: "+ln2.getText());
                               }
       }
if(_0==("X") && _3==("X") && _6==("X")){
     
                        lturn.setText("");
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);

            if(xo1.getText()=="X"){
                               
                               ww1++;   
                               ll2++;
                               l2.setText(""+ll2);
                               w1.setText(""+ww1);          
                               winner.setText("Winner: "+ln1.getText());       
                            }
                     else{
                               ww2++;
                               ll1++;
                               l1.setText(""+ll1);
                               w2.setText(""+ww2);
                               winner.setText("Winner: "+ln2.getText());
                              }
        }

if(_1==("X") && _4==("X") && _7==("X")){
    
                            lturn.setText("");    
                            b1.setDisable(true);
                            b2.setDisable(true);
                            b3.setDisable(true);
                            b4.setDisable(true);
                            b5.setDisable(true);
                            b6.setDisable(true);
                            b7.setDisable(true);
                            b8.setDisable(true);
                            b9.setDisable(true);

                if(xo1.getText()=="X"){
                                    
                                     ww1++;   
                                     ll2++;
                                     l2.setText(""+ll2);
                                     w1.setText(""+ww1);          
                                     winner.setText("Winner: "+ln1.getText());                      
                                  }
                        else{
                                     ww2++;
                                     ll1++;
                                     l1.setText(""+ll1);
                                     w2.setText(""+ww2);
                                     winner.setText("Winner: "+ln2.getText());
                                    }
       }

if(_2==("X") && _5==("X") && _8==("X")){
    
                            lturn.setText("");   
                            b1.setDisable(true);
                            b2.setDisable(true);
                            b3.setDisable(true);
                            b4.setDisable(true);
                            b5.setDisable(true);
                            b6.setDisable(true);
                            b7.setDisable(true);
                            b8.setDisable(true);
                            b9.setDisable(true);

                    if(xo1.getText()=="X"){
                                    
                                     ww1++;   
                                     ll2++;
                                     l2.setText(""+ll2);
                                     w1.setText(""+ww1);          
                                      winner.setText("Winner: "+ln1.getText());                  
                                   }
                            else{
                                     ww2++;
                                     ll1++;
                                     l1.setText(""+ll1);
                                     w2.setText(""+ww2);
                                     winner.setText("Winner: "+ln2.getText());
                                    }
       }
if(_2==("X") && _4==("X") && _6==("X")){
                
                        lturn.setText("");
                        b1.setDisable(true);
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);

            if(xo1.getText()=="X"){
                            
                             ww1++;   
                             ll2++;
                             l2.setText(""+ll2);
                             w1.setText(""+ww1);          
                             winner.setText("Winner: "+ln1.getText());   
                          }
                    else{
                             ww2++;
                             ll1++;
                             l1.setText(""+ll1);
                             w2.setText(""+ww2);
                            winner.setText("Winner: "+ln2.getText());
                            }
       }
   
 /*
Conditions player plays with O wins
   */
if(_0==("O") && _1==("O") && _2==("O")){
                        
                        lturn.setText("");
                        b1.setDisable(true);
                        b2.setDisable(true);
                        b3.setDisable(true);
                        b4.setDisable(true);
                        b5.setDisable(true);
                        b6.setDisable(true);
                        b7.setDisable(true);
                        b8.setDisable(true);
                        b9.setDisable(true);

            if(xo1.getText()=="O"){
                                 
                                 ww1++;   
                                 ll2++;
                                 l2.setText(""+ll2);
                                 w1.setText(""+ww1);          
                                 winner.setText("Winner: "+ln1.getText());  
                                }
                     else{
                                 ww2++;
                                 ll1++;
                                 l1.setText(""+ll1);
                                 w2.setText(""+ww2);
                                 winner.setText("Winner: "+ln2.getText());
                                }
       }

if(_3==("O") && _4==("O") && _5==("O")){
                                    lturn.setText("");
                                    b1.setDisable(true);
                                    b2.setDisable(true);
                                    b3.setDisable(true);
                                    b4.setDisable(true);
                                    b5.setDisable(true);
                                    b6.setDisable(true);
                                    b7.setDisable(true);
                                    b8.setDisable(true);
                                    b9.setDisable(true);

                    if(xo1.getText()=="O"){
                                         
                                         ww1++;   
                                         ll2++;
                                         l2.setText(""+ll2);
                                         w1.setText(""+ww1);          
                                         winner.setText("Winner: "+ln1.getText());                       
                                     }
                            else{
                                         ww2++;
                                         ll1++;
                                         l1.setText(""+ll1);
                                         w2.setText(""+ww2);
                                         winner.setText("Winner: "+ln2.getText());
                                        }
       }
if(_6==("O") && _7==("O") && _8==("O")){
    
                                lturn.setText("");    
                                b1.setDisable(true);
                                b2.setDisable(true);
                                b3.setDisable(true);
                                b4.setDisable(true);
                                b5.setDisable(true);
                                b6.setDisable(true);
                                b7.setDisable(true);
                                b8.setDisable(true);
                                b9.setDisable(true);

            if(xo1.getText()=="O"){                                       
                                         ww1++;   
                                         ll2++;
                                         l2.setText(""+ll2);
                                         w1.setText(""+ww1);          
                                         winner.setText("Winner: "+ln1.getText()); 
                                    }
                        else{
                                         ww2++;
                                         ll1++;
                                         l1.setText(""+ll1);
                                         w2.setText(""+ww2);
                                         winner.setText("Winner: "+ln2.getText());
                                        }            
       }

if(_0==("O") && _4==("O") && _8==("O")){
    
                                lturn.setText("");   
                                b1.setDisable(true);
                                b2.setDisable(true);
                                b3.setDisable(true);
                                b4.setDisable(true);
                                b5.setDisable(true);
                                b6.setDisable(true);
                                b7.setDisable(true);
                                b8.setDisable(true);
                                b9.setDisable(true); 

            if(xo1.getText()=="O"){
                                      
                                       ww1++;   
                                       ll2++;
                                       l2.setText(""+ll2);
                                       w1.setText(""+ww1);          
                                       winner.setText("Winner: "+ln1.getText());                                       
                                          }
                             else{
                                       ww2++;
                                       ll1++;
                                       l1.setText(""+ll1);
                                       w2.setText(""+ww2);
                                       winner.setText("Winner: "+ln2.getText());
                                      }
       }

if(_0==("O") && _3==("O") && _6==("O")){
                                            lturn.setText("");
                                b1.setDisable(true);
                                b2.setDisable(true);
                                b3.setDisable(true);
                                b4.setDisable(true);
                                b5.setDisable(true);
                                b6.setDisable(true);
                                b7.setDisable(true);
                                b8.setDisable(true);
                                b9.setDisable(true);

            if(xo1.getText()=="O"){
           
                                   ww1++;   
                                   ll2++;
                                   l2.setText(""+ll2);
                                   w1.setText(""+ww1);          
                                    winner.setText("Winner: "+ln1.getText());   
                              }
                        else{
                                   ww2++;
                                   ll1++;
                                   l1.setText(""+ll1);
                                   w2.setText(""+ww2);
                                   winner.setText("Winner: "+ln2.getText());
                                 }
           }

if(_1==("O") && _4==("O") && _7==("O")){

                            lturn.setText("");
                            b1.setDisable(true);
                            b2.setDisable(true);
                            b3.setDisable(true);
                            b4.setDisable(true);
                            b5.setDisable(true);
                            b6.setDisable(true);
                            b7.setDisable(true);
                            b8.setDisable(true);
                            b9.setDisable(true);

            if(xo1.getText()=="O"){
                                
                                   ww1++;   
                                   ll2++;
                                   l2.setText(""+ll2);
                                   w1.setText(""+ww1);          
                                   winner.setText("Winner: "+ln1.getText());                       
                                  }
                        else{
                                   ww2++;
                                   ll1++;
                                   l1.setText(""+ll1);
                                   w2.setText(""+ww2);
                                   winner.setText("Winner: "+ln2.getText());
                                  }
       }
if(_2==("O") && _5==("O") && _8==("O")){
    
                              lturn.setText("");  
                              b1.setDisable(true);
                              b2.setDisable(true);
                              b3.setDisable(true);
                              b4.setDisable(true);
                              b5.setDisable(true);
                              b6.setDisable(true);
                              b7.setDisable(true);
                              b8.setDisable(true);
                              b9.setDisable(true);       

        if(xo1.getText()=="O"){
                                 
                                 ww1++;   
                                 ll2++;
                                 l2.setText(""+ll2);
                                 w1.setText(""+ww1);          
                                 winner.setText("Winner: "+ln1.getText());                          
                              } 
                        else{
                                 ww2++;
                                 ll1++;
                                 l1.setText(""+ll1);
                                 w2.setText(""+ww2);
                                 winner.setText("Winner: "+ln2.getText());
                                }
       }
if(_2==("O") && _4==("O") && _6==("O")){
                                
                                 lturn.setText("");      
                                  b1.setDisable(true);
                                  b2.setDisable(true);
                                  b3.setDisable(true);
                                  b4.setDisable(true);
                                  b5.setDisable(true);
                                  b6.setDisable(true);
                                  b7.setDisable(true);
                                  b8.setDisable(true);
                                  b9.setDisable(true);

          if(xo1.getText()=="O"){
                                
                                 ww1++;   
                                 ll2++;
                                 l2.setText(""+ll2);
                                 w1.setText(""+ww1);          
                                  winner.setText("Winner: "+ln1.getText()); 
                                 }
                else{
                                 ww2++;
                                 ll1++;
                                 l1.setText(""+ll1);
                                 w2.setText(""+ww2);
                                 winner.setText("Winner: "+ln2.getText());
                                }
       }
/*
if the game is Draw
*/

if((draw==9) && (winner.getText()=="")){
    
                
                            dd1++;
                            dd2++;
                   lturn.setText("");
                   winner.setText("Draw");
                   d1.setText(""+dd1);
                   d2.setText(""+dd1);
                   }

      
    }


    @FXML
    private void close_on(MouseEvent event) {
        System.exit(0);
    }
    
    
   }
 /*End of the Program*/