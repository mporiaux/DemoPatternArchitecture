package be.condorcet.mvvm;

public class Gestion {
    public static void main(String[] args) {
        Modele modele=new Modele();
        Vue vue=new Vue();
        ViewModel viewModel = new ViewModel();
        viewModel.setModele(modele);
        viewModel.setVue(vue);
       viewModel.gestion();
    }
}
