package org.openjfx.GenetiskAlgoritme;

public class DNA {

    private int currentWeight;
    private int TotalPrice;

    public Items[] Genes;

    DNA(int DNAS) {

        try {
            Genes = new Items[DNAS];

            for (int i = 0; i < Genes.length; i++) {
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

        int crossover = Menu.randint(1, Genes.length);

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
            if (Menu.randdoub() < Mutaterate) {

                Genes[i] = new Items(Menu.randint(1, 24));

            }
        }

    }

}
