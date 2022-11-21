package Bandeau_publicitaire;

import bandeau.Bandeau;

import java.util.HashMap;

public abstract class Effet{


    private Bandeau b;
    private int repetition;

    public Effet(Bandeau b, int repetition) {
        this.b = b;
        this.repetition=repetition;
    }

        public int getRepetition() {
        return repetition;
    }

    public abstract void lancer();

    public Bandeau getB() {
        return b;
    }
}
