/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author saichand
 */
public class FXMLDocumentController implements Initializable {
    Float data = 0f;
    int op=-1;
    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button seven;

    @FXML
    private Button clear;
    @FXML
    private Button zero;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button divide;

    @FXML
    private Button multiply;

    @FXML
    private Button five;

 
    
    @FXML
    void handleButtonAction(ActionEvent event) {
      
        if(event.getSource()==one)
         {
              display.setText(display.getText()+ "1");
         }
        else if(event.getSource()==two)
         {
              display.setText(display.getText()+ "2");
         }
         else if(event.getSource()==three)
         {
              display.setText(display.getText()+ "3");
         }
         else if(event.getSource()==four)
         {
              display.setText(display.getText()+ "4");
         }
         else if(event.getSource()==five)
         {
              display.setText(display.getText()+ "5");
         }
         else if(event.getSource()==six)
         {
              display.setText(display.getText()+ "6");
         }
         else if(event.getSource()==seven)
         {
              display.setText(display.getText()+ "7");
         }
         else if(event.getSource()==eight)
         {
              display.setText(display.getText()+ "8");
         }
         else if(event.getSource()==nine)
         {
              display.setText(display.getText()+ "9");
         }
         else if(event.getSource()==zero)
         {
              display.setText(display.getText()+ "0");
         
         }
         else if(event.getSource()==clear)
         {
              display.setText("");
         }
         else if(event.getSource()==plus)
         {
             data =Float.parseFloat(display.getText());
             op=1;
             display.setText("");
         }
         else if(event.getSource()==minus)
         {
             data =Float.parseFloat(display.getText());
             op=2;
             display.setText("");
         }
         else if(event.getSource()==multiply)
         {
             data =Float.parseFloat(display.getText());
             op=3;
             display.setText("");
         }
         else if(event.getSource()==divide)
         {
             data =Float.parseFloat(display.getText());
             op=4;
             display.setText("");
         }
         else if(event.getSource()==equals)
         {
             Float secondOp =Float.parseFloat(display.getText());
             switch(op)
             {
                 case 1:
                     Float ans =data+secondOp;
                     display.setText(String.valueOf(ans));
                     break;
                     
                 case 2:
                      ans =data-secondOp;
                     display.setText(String.valueOf(ans));
                     break;
                     
                 case 3:
                      ans =data*secondOp;
                     display.setText(String.valueOf(ans));
                     break;
                     
                 case 4:
                     ans=0f;
                     try{
                     ans =data/secondOp;
                     }
                     catch(Exception ae)
                     {
                        display.setText("Error"); 
                     }
                     display.setText(String.valueOf(ans));
                     break;
                     
             }
         }
        
        
  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
