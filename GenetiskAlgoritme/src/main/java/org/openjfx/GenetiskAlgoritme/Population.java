package org.openjfx.GenetiskAlgoritme;

import java.util.ArrayList;


public class Population{

 private double mutationRate; // mutation rate

 private DNA[] population; // Array of current population

 private ArrayList<DNA> matingPools; // Arraylist for mating pool

 private int generations; // number of generations
 
 private float Target; // Target value

 private boolean finished; // Are we finish evolving?

 private int perfectScore; // 

Population(float maxPrice, double mutation, int populationMax ){
    Target = maxPrice;
    mutationRate = mutation;
    population = new DNA[populationMax];


}


}