package be.condorcet.mvp;

import java.util.List;
import java.util.Scanner;

public class Vue {

    public String encodage(){
            Scanner sc = new Scanner(System.in);
            System.out.println("nouveau nom : ");
            String nom = sc.nextLine();
            return nom;
    }

    public void affichage(List<String> lInfos){
        lInfos.stream().forEach(System.out::println);
    }
}
