package sio.testjouet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {


    public static void main(String[] args) {
        jouet a = new jouet("Poupée Barbie", 15, 1, "plastique");
        jouet b = new jouet("Échec lumineux", 45, 3, "Verre");
        int choix;
        int choixAugmente;
        int choixPourcentage;
        int categorie1;
        int categorie2;
        Scanner peuImporte = new Scanner(System.in);
        String choixPossibles = "1- Afficher état\n"
                + "2- Augmenter/Diminuer le prix\n"
                + "3- Intervertir la catégorie\n"
                + "4- Quitter\n"
                + "Réponse : ";
        do {
            System.out.println(choixPossibles);
             choix = Integer.parseInt(peuImporte.next());
             switch (choix){
                 case 1 :
                    a.afficher();
                    b.afficher();
                    break;
                 case 2 : System.out.println("Veux tu augmenter(1) ou diminuer(2) ?");
                    choixAugmente = Integer.parseInt(peuImporte.next());
                    System.out.println("De combien de pourcent ?");
                    choixPourcentage = Integer.parseInt(peuImporte.next());
                    switch (choixAugmente){
                        case 1 :
                            a.multiplier(choixPourcentage);

                            break;
                        case 2 :
                            a.diminuer(choixPourcentage);

                    }
                    System.out.println("Le nouveau prix est : " + a.prix);
                    break;
                 case 3:
                    categorie1 = a.getCategorie();
                    //categorie2 = b.getCategorie();
                     a.setCategorie(b.getCategorie());
                     b.setCategorie(categorie1);

                    break;

             }


        }
        while(choix!=4);
        System.out.println("Vous êtes sorti du menu");



    }




}



