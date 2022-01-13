package org.openjfx.GenetiskAlgoritme;

public class BackPack {

    private double fitness;

    private int maxWeight;

    private int weight;

    private int price;

    DNA dna;

    BackPack(DNA dna_, int maxWeight_) {

        dna = dna_;
        maxWeight = maxWeight_;

        weight = dna.getWeight();
        price = dna.getPrice();

    }

    public void fitness() {
        fitness = (1/price); // Reward finishing faster and getting close

        fitness = Math.pow(fitness, 4); // Make the function exponential

        if(weight > maxWeight) fitness*= 0.1; // lose 90% of fitness when getting more than maxweight
        if(weight< maxWeight) fitness*= 2; // twice the fitness when getting less than maxweight

    }

    public DNA getDNA(){
        return dna;
    }

    public double getFitness(){
        return fitness;
    }

}