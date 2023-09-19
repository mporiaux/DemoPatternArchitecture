package be.condorcet.mvc;

import java.util.List;
import java.util.Scanner;

public class Vue extends Observable implements Observer{
    private Modele modele;
    private  String nom;

    public String getNom() {
        return nom;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public void gestion(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nouveau nom : ");
            nom = sc.nextLine();
            notifyObservers();
        }while(true);
    }

    @Override
    public void update() {
          List<String> noms= modele.getNoms();
          noms.stream().forEach(nom-> System.out.println(nom));
        //  noms.stream().forEach(System.out::println);
    }
}
