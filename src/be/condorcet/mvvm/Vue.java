package be.condorcet.mvvm;

import java.util.Scanner;

public class Vue {
    private ViewModel viewModel;
    Info input=new Info();


    public void affichage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("contenu actuel de la zone d'input :" + input.getNom());
        System.out.print("nouveau nom : ");
        String nom = sc.nextLine();
        input.setNom(nom);
    }
}
