package Bandeau_publicitaire;

import bandeau.Bandeau;
import exemple.ExempleDUtilisation;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private int combien;
    private Bandeau monBandeau;
    private HashMap <Effet, Integer> mesEffets = new HashMap();

    public Scenario(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }

    public void AjouterEffet(Effet effet, int rep){
        combien = rep;
        mesEffets.put(effet, rep);

    }

    public void Jouer(){

        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        for(Map.Entry<Effet, Integer> effet : mesEffets.entrySet()) {
            for (int i = 0; i < effet.getValue(); i++) {
                effet.getKey().lancer();
            }
        }
        monBandeau.close();
    }

}
