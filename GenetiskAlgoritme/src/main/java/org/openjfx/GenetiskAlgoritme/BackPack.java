package org.openjfx.GenetiskAlgoritme;

public class BackPack {

    private double fitness;

    private int maxWeight;

    public int weight;

    public int price;

    private String DNAinfo;

    DNA dna;

    BackPack(DNA dna_, int maxWeight_) {

        dna = dna_;
        maxWeight = maxWeight_;

        weight = dna.getWeight();
        price = dna.getPrice();

    }

    public void fitness() {
        fitness = price; // Reward for getting a high price

        if (weight > maxWeight)
            fitness *= 0.05; // lose 95% of fitness when getting more than maxweight
        if (weight < maxWeight)
            fitness *= 4; // four times the fitness when getting less than maxweight

        
    }

    public DNA getDNA() {
        return dna;
    }

    public double getFitness() {
        return fitness;
    }

    public String getDNAinfo() {
        
        for (int i = 0; i < dna.Genes.length; i++) {
            if(i == 0){
                DNAinfo = dna.Genes[0].name;
            }else{
                DNAinfo = DNAinfo.concat(" : ").concat(dna.Genes[i].name);
            }
            
        }
        

        return DNAinfo;
    }


} 