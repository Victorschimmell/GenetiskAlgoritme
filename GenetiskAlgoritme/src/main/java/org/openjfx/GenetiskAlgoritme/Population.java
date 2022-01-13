package org.openjfx.GenetiskAlgoritme;

import java.util.ArrayList;

public class Population {

    private double mutationRate;
    public BackPack[] population;
    public ArrayList<BackPack> matingpool;
    public static double record;
    private int maxweight;

    int generations;

    Population(double m, int num, int maxweight_) {
        mutationRate = m;
        population = new BackPack[num];
        matingpool = new ArrayList<BackPack>();
        generations = 0;
        maxweight = maxweight_;

        for(int i= 0; i < population.length; i++) {
            population[i] = new BackPack(new DNA(), maxweight);

        }

    }
    // Calculate fitness for each creature
    public void fitness(){
        for (int i = 0; i < population.length; i++) {
            population[i].fitness();
        }
    }

    // Generate a mating pool
    public void selection(){
        matingpool.clear();

        float maxFitness = (float) getMaxFitness();
        
        for( int i = 0; i < population.length; i++ ) {
            float fitnessNormal = map((float) population[i].getFitness(), 0 , maxFitness, 0, 1);
            int n = Math.round(fitnessNormal*100);

            for( int j = 0; j < n; j++ ) {
                matingpool.add(population[i]);
            }
        }
    }

    public void reproduction(){

        for (int i = 0; i < population.length; i++) {
            // Sping the wheel of fortune to pick two parents
            int m = (Menu.randint(1,matingpool.size()));
            int d = (Menu.randint(1,matingpool.size()));
            // Pick two parents
            BackPack mom = matingpool.get(m);
            BackPack dad = matingpool.get(d);
            // Get their genes
            DNA momgenes = mom.getDNA();
            DNA dadgenes = dad.getDNA();
            // Mate their genes
            DNA child = momgenes.crossover(dadgenes);
            // Mutate their genes
            child.mutate(mutationRate);
            // Fill the new population with the new child
            population[i] = new BackPack(child, maxweight);
          }
          generations++;
    }   

    public int getGenerations(){
        return generations;
    }

    private double getMaxFitness(){
        record = 0;

        for(int i = 0; i < population.length; i++) {
            if(population[i].getFitness() < record){
                record = population[i].getFitness();
            }
        }
        return record;
    }

    static public final float map(float value, 
                              float istart, 
                              float istop, 
                              float ostart, 
                              float ostop) {
    return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
}


}