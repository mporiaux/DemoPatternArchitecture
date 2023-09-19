package be.condorcet.mvp;


import java.util.List;

public class Presenter {
     private Modele modele;
     private Vue vue;

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public void gestion(){
        do {
           String nom= vue.encodage();
           modele.addNom(nom);
           List<String> lInfos=modele.getNoms();
           vue.affichage(lInfos);
        }while(true);
    }
}
