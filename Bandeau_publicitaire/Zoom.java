package Bandeau_publicitaire;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{



    public Zoom(Bandeau b, int repetition) {
        super(b, repetition);
    }


    public void lancer (){
        getB().setMessage("On va zoomer");
        getB().sleep(1000);
        getB().setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            getB().setFont(new Font("Dialog", Font.BOLD, 5 + i));
            getB().sleep(100);
        }
        getB().sleep(1000);
    }
}
