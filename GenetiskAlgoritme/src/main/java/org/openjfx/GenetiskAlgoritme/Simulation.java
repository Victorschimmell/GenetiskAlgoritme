package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;



public class Simulation implements Initializable {


     @FXML
    private LineChart LineChart;
     
      
     @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        /* 
          LineChart.dataProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {

                LineChart = (LineChart) LineChart.getData();
                
            }
          });
                  
    
        
        }
                  */
      }

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("Menu");
    }
    }

        
        
                

  

