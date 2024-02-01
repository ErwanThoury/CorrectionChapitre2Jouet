package sio.testjouet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        jouet a = new jouet("Poupée Barbie", 15, 1, "plastique");
        jouet b = new jouet("Échec lumineux", 45, 3, "Verre");

        a.afficher();
        b.afficher();

        jouet.intervertirCategories(a, b);

        System.out.println("Après l'intervertir des catégories :");
        a.afficher();
        b.afficher();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un pourcentage : ");
        double pourcentage = scanner.nextDouble();

        a.multiplier(pourcentage);
        System.out.println("Le nouveau prix est : " + a.prix);

        //launch();
    }
}