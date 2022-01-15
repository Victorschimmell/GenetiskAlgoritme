package org.openjfx.GenetiskAlgoritme;

import java.util.ArrayList;

public class Population {

    private double mutationRate;
    public BackPack[] population;
    public ArrayList<BackPack> matingpool;
    public static double record;
    private int maxweight;
    public static int recordholder = 0;

    public static int generations;

    Population(double m, int num, int maxweight_, int DNAS) {
        mutationRate = m;
        population = new BackPack[num];
        matingpool = new ArrayList<BackPack>();
        generations = 1;
        maxweight = maxweight_;

        for (int i = 0; i < population.length; i++) {
            population[i] = new BackPack(new DNA(DNAS), maxweight);

        }  
        
    }

    // Calculate fitness for each creature
    public void fitness() {
        for (int i = 0; i < population.length; i++) {
            population[i].fitness();
            //System.out.println("NR: " + i + " : " + "Fitness: " +population[i].getFitness());
        }
    }

    // Generate a mating pool
    public void selection() {
        matingpool.clear();

        float maxFitness = (float) getMaxFitness();

        System.out.println("MaxFitness belongs to :" + recordholder);
        printInfo(population[recordholder]);

        // Calculate fitness for each member of the population (scaled to value between
        // 0 and 1)
        // Based on fitness, each member will get added to the mating pool a certain
        // number of times
        // A higher fitness = more entries to mating pool = more likely to be picked as
        // a parent
        // A lower fitness = fewer entries to mating pool = less likely to be picked as
        // a parent

        for (int i = 0; i < population.length; i++) {
            float fitnessNormal = map((float) population[i].getFitness(), 0, maxFitness, 0, 1);
            int n = Math.round(fitnessNormal * 100);

            for (int j = 0; j < n; j++) {
                matingpool.add(population[i]);
            }
        }
    }

    public void reproduction() {

        for (int i = 0; i < population.length; i++) {
            // Sping the wheel of fortune to pick two parents
            int m = (Menu.randint(1, matingpool.size()-1));
            int d = (Menu.randint(1, matingpool.size()-1));
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

    public int getGenerations() {
        return generations;
    }

    public double getMaxFitness() {
        record = 0;
        

        for (int i = 0; i < population.length; i++) {
            if (population[i].getFitness() > record) {
                record = population[i].getFitness();
                recordholder = i;
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

    public void printInfo(BackPack b){
        
        System.out.println("FitnessScore: " + b.getFitness() + " : Weight: "+ b.weight + " : Price: " + b.price + " : Generations: " + generations);

    }

}