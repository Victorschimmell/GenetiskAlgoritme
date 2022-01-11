package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.util.concurrent.ThreadLocalRandom;

public class Menu implements Initializable {

    ArrayList<Integer> popPrice = new ArrayList<Integer>();
    private int maxværdi;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

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
