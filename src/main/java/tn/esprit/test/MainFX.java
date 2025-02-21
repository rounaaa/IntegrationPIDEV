package tn.esprit.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tn.esprit.controllers.GestionStation;
=======
import javafx.scene.Scene;
import javafx.stage.Stage;
>>>>>>> origin/adem
=======
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
>>>>>>> origin/jasser

import java.io.IOException;

public class MainFX extends Application {

<<<<<<< HEAD
<<<<<<< HEAD
    // Méthode principale qui lance l'application JavaFX
    public static void main(String[] args) {
        System.out.println("Application démarrée!");
=======
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class MainFX extends Application {

    public static void main(String[] args) {
>>>>>>> origin/may
=======
    public static void main(String[] args) {
>>>>>>> origin/jasser
        launch(args);
    }

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public void start(Stage primaryStage) throws IOException {
        // Charger le fichier FXML depuis les ressources
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GestionStation.fxml"));
=======
    public void start(Stage primaryStage) {

        FXMLLoader loader =new FXMLLoader(getClass().getResource("/gestionEvenement.fxml"));
>>>>>>> origin/may
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
<<<<<<< HEAD
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
=======
            primaryStage.setTitle("---- Gestion evenement-----");
=======
    public void start(Stage primaryStage) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Start.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setMinWidth(1280);
            primaryStage.setMinHeight(720);
            primaryStage.setScene(scene);
            primaryStage.setTitle("BlediSmart");

            // icon
            Image icon = new Image(getClass().getResourceAsStream("/img/Logo.png"));
            primaryStage.getIcons().add(icon);

            scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

>>>>>>> origin/jasser
            primaryStage.show();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
<<<<<<< HEAD
    public void setSecondStage(Stage secondStage) {

        FXMLLoader loader =new FXMLLoader(getClass().getResource("/participation.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            secondStage.setScene(scene);
           secondStage.setTitle("---- Gestion participation-----");
            secondStage.show();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

>>>>>>> origin/may
=======
}
>>>>>>> origin/jasser
