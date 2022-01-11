package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.util.concurrent.ThreadLocalRandom;

public class Simulation implements Initializable {
    
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Items blyat = new Items(Menu.randint(0,24));
        
        System.out.println(blyat.name + " : " + blyat.weight + " : " + blyat.price);
        
    }
    
   

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("Menu");
    }


  
}
