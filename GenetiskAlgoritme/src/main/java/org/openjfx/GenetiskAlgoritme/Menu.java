package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.util.concurrent.ThreadLocalRandom;

public class Menu implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
    
    @FXML
    private void switchToSim() throws IOException {
        
        App.setRoot("Simulation");
        
    }
    
    public int randint(int min, int max){

    return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
