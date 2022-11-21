package Bandeau_publicitaire;

import bandeau.Bandeau;

import java.awt.*;

public class CouleurPolice extends Effet {

    private Color couleur;


    public CouleurPolice(Bandeau b, Color c, int repetion) {
        super(b, repetion);
        this.couleur = c;
    }


    public void lancer(){
        getB().setForeground(couleur);
        getB().sleep(1000);
    }
}
