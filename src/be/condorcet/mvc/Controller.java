package be.condorcet.mvc;


public class Controller implements Observer {
     private Modele modele;
     private Vue vue;

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    @Override
    public void update() {
       String nom = vue.getNom();
       modele.addNom(nom);
    }
}
