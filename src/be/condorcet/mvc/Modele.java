package be.condorcet.mvc;

import java.util.ArrayList;
import java.util.List;

public class Modele extends Observable{
    private List<String> noms = new ArrayList<>();

    public void addNom(String nom){
        noms.add(nom);
        notifyObservers();
    }

    public List<String> getNoms() {
        return noms;
    }
}
