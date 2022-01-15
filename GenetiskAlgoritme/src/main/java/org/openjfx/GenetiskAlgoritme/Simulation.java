package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class Simulation implements Initializable {

  Population p;

  @FXML
  private LineChart LineChart;
  XYChart.Series series = new XYChart.Series();



  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {

    p = new Population(Menu.mutationsRate, Menu.backPackAntal, 5000);
    run();

  }

  @FXML
  private void switchToMenu() throws IOException {
    App.setRoot("Menu");
  }

  private void run() {

    do {
      p.fitness();
      p.selection();
      series.getData().add(new XYChart.Data("" + p.getGenerations(), p.getMaxFitness()));
      p.reproduction();

    } while (Population.generations <= Menu.genMål);
    if (Population.generations >= Menu.genMål) {

      series.setName("Bedst rygsæk");
      LineChart.getData().add(series);

    }

  }

}
