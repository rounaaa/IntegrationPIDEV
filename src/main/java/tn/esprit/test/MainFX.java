package tn.esprit.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tn.esprit.controllers.GestionStation;
=======
import javafx.scene.Scene;
import javafx.stage.Stage;
>>>>>>> origin/adem

import java.io.IOException;

public class MainFX extends Application {

<<<<<<< HEAD
    // Méthode principale qui lance l'application JavaFX
    public static void main(String[] args) {
        System.out.println("Application démarrée!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Charger le fichier FXML depuis les ressources
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GestionStation.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            GestionStation controller = loader.getController();
            controller.initialize(null, null);
            primaryStage.setTitle("---- Gestion Station -----");
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("Erreur de chargement du fichier FXML : " + e.getMessage());
        }
=======
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GestionUtilisateur.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Gestion des Utilisateurs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
>>>>>>> origin/adem
    }
}
