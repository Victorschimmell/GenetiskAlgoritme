package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSim() throws IOException {
        
        App.setRoot("Simulation");
        
    }
}
