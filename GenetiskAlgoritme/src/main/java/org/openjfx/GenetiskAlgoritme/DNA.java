package org.openjfx.GenetiskAlgoritme;

import java.util.ArrayList;

public class DNA {

    private int maxWeight = 5000;

    private int currentWeight;
    private int TotalPrice;

    ArrayList<Items> Genes = new ArrayList<Items>();

    DNA() {
        try {

            while (currentWeight < maxWeight) {

                try {

                    Genes.add(new Items(Menu.randint(1, 24)));

                    for (int i = Genes.size() - 1; i < Genes.size(); i++) {
                        currentWeight += Genes.get(i).weight;
                        TotalPrice += Genes.get(i).price;
                        System.out.println(Genes.get(i).name + " : " + "Total Weight:" + currentWeight
                                + " : Pricetotal: " + TotalPrice);
                    }

                } catch (Exception e) {
                    System.out.println("Fejl2: " + e);
                }

            }

            System.out.println("DNA's Total Price: " + TotalPrice);

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
        return currentWeight;
    }

    public int getTotalPrice() {
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

    public void mutate(double Mutaterate){
        for(int i = 0; i < Genes.size(); i++){
            if(Menu.randdoub(0.001, 1) < Mutaterate){

                Genes.set(i, new Items(Menu.randint(1,24)));
            }
        }

    }

}
