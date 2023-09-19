package be.condorcet.mvvm;

public class Info extends Observable implements Observer{
    private String nom="";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        notifyObservers();
    }

    @Override
    public String getNotification() {
        return nom;
    }

    @Override
    public void update(String msg) {
        this.nom=msg;
    }
}
