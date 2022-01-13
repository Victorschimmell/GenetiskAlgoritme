package org.openjfx.GenetiskAlgoritme;

public class DNA {

    private int currentWeight;
    private int TotalPrice;

    Items[] Genes; // Vores DNA er i alt 24 langt, beseret på at der er 24 forskellige items
    DNA() {

        try {
            Genes = new Items[24];

            for(int i = 0; i < Genes.length; i++){
                Genes[i] = new Items(Menu.randint(1, 24));
            }
            
        } catch (Exception e) {
            System.out.println("BIG FEJL");
        }

    }

    DNA(Items[] newgenes) {
        Genes = newgenes;
    }

    public int getWeight() {
        currentWeight = 0;
        for (int i = 0; i < Genes.length; i++) {
            currentWeight += Genes[i].weight;
        }
        return currentWeight;
    }

    public int getPrice() {
        TotalPrice = 0;
        for (int i = 0; i < Genes.length; i++) {
            TotalPrice += Genes[i].price;
        }
        return TotalPrice;
    }

    public DNA crossover(DNA partner) {
        Items[] child = new Items[Genes.length];

        int crossover = Menu.randint(0, Genes.length);

        for (int i = 0; i < Genes.length; i++) {
            if (i > crossover) {
                child[i] = Genes[i];
            } else {
                child[i] = partner.Genes[i];
            }
        }

        DNA newgenes = new DNA(child);
        return newgenes;
    }

    public void mutate(double Mutaterate) {
        for (int i = 0; i < Genes.length; i++) {
            if (Menu.randdoub(0.001, 1) < Mutaterate) {

                Genes[i] = new Items(Menu.randint(1, 24));

            }
        }

    }

}
