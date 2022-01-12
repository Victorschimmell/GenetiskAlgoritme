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

    private int getWeight() {
        return currentWeight;
    }

    private int getTotalPrice() {
        return TotalPrice;
    }

}