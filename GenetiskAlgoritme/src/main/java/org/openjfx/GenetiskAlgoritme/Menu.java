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

import java.util.*;

public class Menu implements Initializable {

    @FXML
    private Label BackPackLabel, MutationsRateLabel, genLabel;

    @FXML
    private Slider BackPackSlider, MutationsRateSlider, genSlider;

    public static int backPackAntal = 50;

    public static double mutationsRate = 0.01;

    public static int genMål = 5;

    ArrayList<Integer> popPrice = new ArrayList<Integer>();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        MutationsRateLabel.setText(String.valueOf(mutationsRate));
        MutationsRateSlider.setValue(mutationsRate);
        BackPackLabel.setText(Integer.toString(backPackAntal));
        BackPackSlider.setValue(backPackAntal);
        genLabel.setText(Integer.toString(genMål));
        genSlider.setValue(genMål);

        MutationsRateSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {

                mutationsRate = Math.round(MutationsRateSlider.getValue() * 100.0) / 100.0;
                ;

                MutationsRateLabel.setText(String.valueOf(mutationsRate));
            }
        });

        BackPackSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {

                backPackAntal = (int) BackPackSlider.getValue();
                BackPackLabel.setText(Integer.toString(backPackAntal));

            }

        });

        genSlider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {

                genMål = (int) genSlider.getValue();
                genLabel.setText(Integer.toString(genMål));

            }

        });

    }

    @FXML
    private void switchToSim() throws IOException {

        App.setRoot("Simulation");

    }

    public static int randint(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static double randdoub(){
        Random randomDoub = new Random();
            return randomDoub.nextDouble();
    }

}