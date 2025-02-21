package tn.esprit.test;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import tn.esprit.models.Station;
import tn.esprit.models.Utilisateur;
import tn.esprit.models.tarifs;
import tn.esprit.services.ServiceStation;
=======
import tn.esprit.models.Admin;
import tn.esprit.models.Citoyen;
import tn.esprit.services.ServiceUtilisateur;
import tn.esprit.models.Utilisateur;
>>>>>>> origin/adem
=======
import tn.esprit.models.Evenement;
import java.time.LocalDateTime;
import java.time.LocalDate;
>>>>>>> origin/may
=======
import tn.esprit.models.Document;
import tn.esprit.services.ServiceDocument;

import java.util.Date;
import java.util.Random;
>>>>>>> origin/jasser

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        ServiceStation serviceStation = new ServiceStation();

        Utilisateur user = ServiceStation.getUtilisateurById(3);
        if (user != null) {
            Station station = new Station(
                    "Station 1",
                    "Emplacement 1",
                    Station.Status.OPEN,
                    user,
                    100,
                    "9:00 - 18:00",
                    "123-456-7890",
                    36.8525,
                    10.1630
            );

            serviceStation.add(station);

            System.out.println(serviceStation.getAll());
        } else {
            System.out.println("Utilisateur non trouvé !");
        }
=======
        ServiceUtilisateur service = new ServiceUtilisateur();
        // Affichage de tous les utilisateurs
        System.out.println("\nListe des utilisateurs après ajout :");
        for (Utilisateur utilisateur : service.getAll()) {
            System.out.println(utilisateur);
        }
          /*
        // Test d'ajout d'un Admin :
     Admin admin = new Admin("John", "Doe", "john.doe@example.com", 12345612, "admin123");
        admin.setRole("ADMIN");
        service.add(admin);
        System.out.println("Admin ajouté : " + admin);


        // Test d'ajout d'un Citoyen :
        Citoyen citoyen = new Citoyen("Jane", "Doe", "jane.doe@example.com", 654321, "citoyen123");
        citoyen.setRole("CITOYEN");
        service.add(citoyen);
        System.out.println("Citoyen ajouté : " + citoyen);

        // Affichage de tous les utilisateurs
        System.out.println("\nListe des utilisateurs après ajout :");
        for (Utilisateur utilisateur : service.getAll()) {
            System.out.println(utilisateur);
        }
   // Test de la mise à jour d'un Admin :
        admin.setEmail("john.updated@example.com"); // Mise à jour de l'email
        service.update(admin);
        System.out.println("Admin mis à jour : " + admin);

        // Test de la mise à jour d'un Citoyen :
        citoyen.setEmail("jane.updated@example.com"); // Mise à jour de l'email
        service.update(citoyen);
        System.out.println("Citoyen mis à jour : " + citoyen);
        // Affichage de tous les utilisateurs
        System.out.println("\nListe des utilisateurs après mise à jour :");
        for (Utilisateur utilisateur : service.getAll()) {
            System.out.println(utilisateur);
        }
 // Test de la suppression d'un Admin :
        service.delete(admin);  // Utilisation de la méthode delete avec l'objet Admin
        System.out.println("Admin supprimé : " + admin);

        // Test de la suppression d'un Citoyen :
        service.delete(citoyen);  // Utilisation de la méthode delete avec l'objet Citoyen
        System.out.println("Citoyen supprimé : " + citoyen);

        // Affichage de tous les utilisateurs
        System.out.println("\nListe des utilisateurs après la suppression :");
        for (Utilisateur utilisateur : service.getAll()) {
            System.out.println(utilisateur);
        }

        */
>>>>>>> origin/adem
=======

        String nom = "Concert Rock";
        String description = "Un concert de rock exceptionnel";
        LocalDateTime date = LocalDate.now().atStartOfDay();
        String lieu = "Stade de France";
        String statut = "actif";
        int capacite = 5000;
        String image = "concert.jpg";
        int idUser = 1;


        Evenement evenement = new Evenement(nom, description, date, lieu, statut, capacite, image, idUser);


        System.out.println(evenement);
>>>>>>> origin/may
=======
        ServiceDocument serviceDocument = new ServiceDocument();
        Random random = new Random();

        String[] titles = {"Document A", "Document B", "Document C", "Document D", "Document E", "Document F", "Document G", "Document H", "Document I", "Document J", "Document K", "Document L", "Document M", "Document N", "Document O", "Document P", "Document Q", "Document R", "Document S", "Document T"};
        String[] statuses = {"Draft", "Published", "Archived"};
        String[] descriptions = {"Description 1", "Description 2", "Description 3", "Description 4", "Description 5", "Description 6", "Description 7", "Description 8", "Description 9", "Description 10", "Description 11", "Description 12", "Description 13", "Description 14", "Description 15", "Description 16", "Description 17", "Description 18", "Description 19", "Description 20"};
        String[] types = {"Type 1", "Type 2", "Type 3"};
        String[] paths = {"Path 1", "Path 2", "Path 3", "Path 4", "Path 5", "Path 6", "Path 7", "Path 8", "Path 9", "Path 10", "Path 11", "Path 12", "Path 13", "Path 14", "Path 15", "Path 16", "Path 17", "Path 18", "Path 19", "Path 20"};
        String[] categories = {"Categorie1", "Categorie2", "Categorie3"};
        String[] authors = {"Author 1", "Author 2", "Author 3", "Author 4", "Author 5", "Author 6", "Author 7", "Author 8", "Author 9", "Author 10", "Author 11", "Author 12", "Author 13", "Author 14", "Author 15", "Author 16", "Author 17", "Author 18", "Author 19", "Author 20"};

        for (int i = 0; i < 20; i++) {
            Document document = new Document(
                    titles[i],
                    statuses[random.nextInt(statuses.length)],
                    descriptions[i],
                    types[random.nextInt(types.length)],
                    new Date(),
                    new Date(),
                    paths[i],
                    categories[random.nextInt(categories.length)],
                    authors[i]
            );
            serviceDocument.add(document);
        }

        System.out.println("Database populated");
>>>>>>> origin/jasser
    }
}
