package org.openjfx.GenetiskAlgoritme;

import java.util.ArrayList;

public class DNA {

    private int maxWeight = 5000;

    private int currentWeight;
    private int TotalPrice;

    ArrayList<Items> Genes = new ArrayList<Items>();

    DNA() {
        try {
            currentWeight = 0;
            while (currentWeight < maxWeight) {

                try {

                    Genes.add(new Items(Menu.randint(1, 24)));

                    for (int i = Genes.size() - 1; i < Genes.size(); i++) {
                        currentWeight += Genes.get(i).weight;
                    }

                } catch (Exception e) {
                    System.out.println("Fejl2: " + e);
                }

            }

        } catch (Exception e) {
            System.out.println("BIG FEJL");
        }

    }

    DNA(Items[] newgenes) {
        for (int i = 0; i < newgenes.length; i++) {
            Genes.add(newgenes[i]);
        }
    }

    public int getWeight() {
        currentWeight = 0;
        for (int i = 0; i < Genes.size(); i++) {
            currentWeight += Genes.get(i).weight;
        }
        return currentWeight;
    }

    public int getTotalPrice() {
        TotalPrice = 0;
        for (int i = 0; i < Genes.size(); i++) {
            TotalPrice += Genes.get(i).price;
        }
        return TotalPrice;
    }

    public DNA crossover(DNA partner) {
        Items[] child = new Items[Genes.size()];

        int crossover = Menu.randint(0, Genes.size());

        for (int i = 0; i < Genes.size(); i++) {
            if (i > crossover) {
                child[i] = Genes.get(i);
            } else {
                child[i] = partner.Genes.get(i);
            }
        }

        DNA newgenes = new DNA(child);
        return newgenes;
    }

    public void mutate(double Mutaterate) {
        for (int i = 0; i < Genes.size(); i++) {
            if (Menu.randdoub(0.001, 1) < Mutaterate) {

                Genes.set(i, new Items(Menu.randint(1, 24)));

            }
        }

    }

}
