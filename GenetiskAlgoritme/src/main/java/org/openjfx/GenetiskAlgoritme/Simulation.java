package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
 import javafx.scene.control.Slider;
 import javafx.scene.control.Label;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;


public class Simulation implements Initializable {
    
    @FXML
    private Label simulationLabel;
    
    @FXML
    private Slider simulationSlider;
    
    private int backPackAntal;
    
    
    
       @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        simulationSlider.valueProperty().addListener(new ChangeListener<Number>() {
            
       @Override
	public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				
        backPackAntal = (int) simulationSlider.getValue();
	simulationLabel.setText(Integer.toString(backPackAntal));
  
                }
        });
    
              
        
        Items blyat = new Items(Menu.randint(0,24));
        
        System.out.println(blyat.name + " : " + blyat.weight + " : " + blyat.price);
        
    }
   

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("Menu");
    }
    }

        
        
                

  

