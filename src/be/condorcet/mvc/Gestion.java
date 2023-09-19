package be.condorcet.mvc;

public class Gestion {
    public static void main(String[] args) {
        Modele modele=new Modele();
        Vue vue=new Vue();
        Controller controller = new Controller();
        controller.setModele(modele);
        controller.setVue(vue);
        vue.setModele(modele);
        vue.addObserver(controller);
        modele.addObserver(vue);
        vue.gestion();
    }
}
