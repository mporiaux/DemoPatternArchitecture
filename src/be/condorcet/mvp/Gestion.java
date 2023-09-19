package be.condorcet.mvp;

public class Gestion {
    public static void main(String[] args) {
        Modele modele=new Modele();
        Vue vue=new Vue();
        Presenter presenter = new Presenter();
        presenter.setModele(modele);
        presenter.setVue(vue);
       presenter.gestion();
    }
}
