package tn.esprit.test;

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

public class Main {

    public static void main(String[] args) {
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
    }
}
