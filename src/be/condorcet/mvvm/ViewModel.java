package be.condorcet.mvvm;

public class ViewModel  {
     private Modele modele;
     private Vue vue;
     Info inputm= new Info();


    public void setModele(Modele modele) {

        this.modele = modele;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
        vue.input.addObserver(inputm); //binding vue->vueModel
        inputm.addObserver(vue.input); //binding vueModel->vue
    }

    public void gestion(){
        do {
            vue.affichage();
            modele.addNom(inputm.getNom());
            inputm.setNom("");
            System.out.println("");
        }while(true);
    }
}
