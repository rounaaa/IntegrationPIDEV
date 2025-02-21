<<<<<<< HEAD
package tn.esprit.models;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;

public class Utilisateur {

=======
import org.mindrot.jbcrypt.BCrypt;

public class Utilisateur {
>>>>>>> origin/adem
=======

package tn.esprit.models;

import org.mindrot.jbcrypt.BCrypt;

public abstract class Utilisateur {
>>>>>>> origin/jasser
    private int id_user;
    private String nom;
    private String prenom;
    private String email;
<<<<<<< HEAD
<<<<<<< HEAD
    private String motDePasse;
    private int cin;
    private String role;
    private List<Station> stations;  // Liste des stations appartenant à l'utilisateur

    // Constructeur par défaut
    public Utilisateur() {}

    // Nouveau constructeur qui accepte seulement l'ID
    public Utilisateur(int id_user,String nom) {
        this.id_user = id_user;
        this.nom = nom;
    }

    // Constructeur complet
=======
=======
>>>>>>> origin/jasser
    private int cin;
    private String motDePasse;
    private String role;

    public Utilisateur() {}

<<<<<<< HEAD
>>>>>>> origin/adem
=======
>>>>>>> origin/jasser
    public Utilisateur(int id_user, String nom, String prenom, String email, int cin, String motDePasse, String role) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
<<<<<<< HEAD
<<<<<<< HEAD
        this.motDePasse = motDePasse;
        this.cin = cin;
        this.role = role;
    }

    // Getters et Setters
    public int getId_user() { return id_user; }
    public void setId_user(int id_user) { this.id_user = id_user; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public int getCin() { return cin; }
    public void setCin(int cin) { this.cin = cin; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public List<Station> getStations() { return stations; }
    public void setStations(List<Station> stations) { this.stations = stations; }
=======
=======
>>>>>>> origin/jasser
        this.cin = cin;
        this.motDePasse = hashPassword(motDePasse); // Hachage du mot de passe
        this.role = role;
    }

    public Utilisateur(String nom, String prenom, String email, int cin, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.cin = cin;
        this.motDePasse = hashPassword(motDePasse); // Hachage du mot de passe
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
<<<<<<< HEAD
=======
public class Utilisateur {
    private int id_user;
    private String nom;
    private String prenom;
    private int age;

    public Utilisateur() {}

    public Utilisateur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getid_user() {
        return id_user;
    }

    public void setid_user(int id_user) {
>>>>>>> origin/may
=======
>>>>>>> origin/jasser
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> origin/may
=======
>>>>>>> origin/jasser
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/jasser
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = hashPassword(motDePasse); // Hachage avant stockage
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Hachage du mot de passe avec BCrypt
    private String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(12));
    }
<<<<<<< HEAD
>>>>>>> origin/adem
=======
>>>>>>> origin/jasser

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_user=" + id_user +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", cin=" + cin +
<<<<<<< HEAD
<<<<<<< HEAD
                ", role='" + role + '\'' +
                '}';
=======
                ", role=" + getRole() +
                "}";
>>>>>>> origin/adem
    }
}
=======
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id_user=" + id_user +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                "}\n";
    }


}
>>>>>>> origin/may
=======
                ", role=" + getRole() +
                "}";
    }
}
>>>>>>> origin/jasser
