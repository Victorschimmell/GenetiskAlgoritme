package org.openjfx.GenetiskAlgoritme;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.text.Text;

public class Simulation implements Initializable {

  Population p;

  @FXML
  private Text IndholdLabel;

  @FXML
  private LineChart LineChart;
  private XYChart.Series series = new XYChart.Series();


  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {

    p = new Population(Menu.mutationsRate, Menu.backPackAntal, Menu.MaxWeight, Menu.dnaSize);
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
      series.getData().add(new XYChart.Data("" + p.getGenerations(), p.population[Population.recordholder].price));
      p.reproduction();

    } while (Population.generations <= Menu.genMål);
    if (Population.generations >= Menu.genMål) {

      System.out.println(p.population[Population.recordholder].getDNAinfo());
      IndholdLabel.setText(p.population[Population.recordholder].getDNAinfo());
      series.setName("Bedste rygsæk for hver generation");
      LineChart.getData().add(series);

    }

  }

}
