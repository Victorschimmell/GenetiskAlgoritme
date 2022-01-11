package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.util.concurrent.ThreadLocalRandom;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Menu implements Initializable {

      @FXML
    private Label BackPackLabel;
    
    @FXML
    private Slider BackPackSlider;
    
    private int backPackAntal;
    
    ArrayList<Integer> popPrice = new ArrayList<Integer>();
    private int maxværdi;
    
    @FXML
    private Label MutationsRatekLabel;
    
    @FXML
    private Slider MutationsRateSlider;
    
    private double MutationsRate;
    
   
    
    
       @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        MutationsRateSlider.valueProperty().addListener(new ChangeListener<Number>() {
            
       @Override
	public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				
        MutationsRate = MutationsRateSlider.getValue();
	MutationsRatekLabel.setText(Double.toString((MutationsRate)));
  
                }
                
        });
        
        BackPackSlider.valueProperty().addListener(new ChangeListener<Number>() {
            
            @Override
	public void changed(ObservableValue<? extends Number> arg3, Number arg4, Number arg5) {
				
        backPackAntal = (int) BackPackSlider.getValue();
	BackPackLabel.setText(Integer.toString(backPackAntal));
  
                }
        });
                
                
                       

        for (int i = 0; i < 8; i++) {
            popPrice.add(Menu.randint(1, 8500));
            System.out.println(popPrice.get(i));

            try {
                if (popPrice.get(i) > maxværdi) {
                    maxværdi = popPrice.get(i);

                    System.out.println("Maxværdi = " + maxværdi);
                }

            } catch (Exception e) {

            }

        }

    }

    @FXML
    private void switchToSim() throws IOException {

        App.setRoot("Simulation");

    }

    public static int randint(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
                
