package be.condorcet.mvp;

import java.util.ArrayList;
import java.util.List;

public class Modele  {
    private List<String> noms = new ArrayList<>();


    public void addNom(String nom){
        noms.add(nom);
    }

    public List<String> getNoms() {
        return noms;
    }
}
