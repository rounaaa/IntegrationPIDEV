package tn.esprit.services;

import tn.esprit.models.Utilisateur;
<<<<<<< HEAD
<<<<<<< HEAD
import tn.esprit.models.Admin;
import tn.esprit.models.Citoyen;
import tn.esprit.interfaces.IService;
import tn.esprit.utils.MyDatabase;
import org.mindrot.jbcrypt.BCrypt;
=======
import tn.esprit.models.Admin;
import tn.esprit.models.Citoyen;
import tn.esprit.utils.MyDatabase;
import org.mindrot.jbcrypt.BCrypt; // Ajout pour le hachage du mot de passe

>>>>>>> origin/jasser
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class ServiceUtilisateur implements IService<Utilisateur> {
=======
public class ServiceUtilisateur {
>>>>>>> origin/jasser
    private Connection cnx;

    public ServiceUtilisateur() {
        cnx = MyDatabase.getInstance().getCnx();
    }

<<<<<<< HEAD
    public void add(Utilisateur utilisateur) {
        if (!isValidCIN(utilisateur.getCin())) {
            throw new IllegalArgumentException("Le CIN doit contenir exactement 8 chiffres !");
        }

        if (existsByCIN(utilisateur.getCin())) {
            throw new IllegalArgumentException("Ce CIN est déjà utilisé !");
        }

        if (!isValidEmail(utilisateur.getEmail())) {
            throw new IllegalArgumentException("Format d'email invalide !");
        }

        // Vérifier si l'email existe déjà
        if (existsByEmail(utilisateur.getEmail())) {
            throw new IllegalArgumentException("Cet email est déjà utilisé !");
        }

        String qry = "INSERT INTO utilisateur(nom, prenom, email, cin, motDePasse, role) VALUES (?,?,?,?,?,?)";
        try {
            String hashedPassword = BCrypt.hashpw(utilisateur.getMotDePasse(), BCrypt.gensalt(12));

=======
    // Méthode pour ajouter un utilisateur avec hachage du mot de passe
    public void add(Utilisateur utilisateur) {
        String qry = "INSERT INTO utilisateur(nom, prenom, email, cin, motDePasse, role) VALUES (?,?,?,?,?,?)";
        try {
            // Hachage du mot de passe avec BCrypt
            String hashedPassword = BCrypt.hashpw(utilisateur.getMotDePasse(), BCrypt.gensalt(12));

            // Insertion dans la table utilisateur
>>>>>>> origin/jasser
            PreparedStatement pstm = cnx.prepareStatement(qry, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, utilisateur.getNom());
            pstm.setString(2, utilisateur.getPrenom());
            pstm.setString(3, utilisateur.getEmail());
            pstm.setInt(4, utilisateur.getCin());
<<<<<<< HEAD
            pstm.setString(5, hashedPassword);
            pstm.setString(6, utilisateur.getRole());
            pstm.executeUpdate();
            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                utilisateur.setId_user(rs.getInt(1));
            }

            if ("ADMIN".equalsIgnoreCase(utilisateur.getRole())) {
=======
            pstm.setString(5, hashedPassword); // Mot de passe haché
            pstm.setString(6, utilisateur.getRole());

            pstm.executeUpdate();
            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                utilisateur.setId_user(rs.getInt(1)); // Récupérer l'ID généré
            }

            // Ajouter dans la table appropriée (admins ou citoyens) en fonction du rôle
            if (utilisateur.getRole().equalsIgnoreCase("admin")) {
>>>>>>> origin/jasser
                String qryAdmin = "INSERT INTO admins(id_user) VALUES (?)";
                PreparedStatement pstmAdmin = cnx.prepareStatement(qryAdmin);
                pstmAdmin.setInt(1, utilisateur.getId_user());
                pstmAdmin.executeUpdate();
<<<<<<< HEAD
            } else {
=======
            } else if (utilisateur.getRole().equalsIgnoreCase("citoyen")) {
>>>>>>> origin/jasser
                String qryCitoyen = "INSERT INTO citoyens(id_user) VALUES (?)";
                PreparedStatement pstmCitoyen = cnx.prepareStatement(qryCitoyen);
                pstmCitoyen.setInt(1, utilisateur.getId_user());
                pstmCitoyen.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout : " + e.getMessage());
        }
    }

<<<<<<< HEAD
    public boolean existsByCIN(int cin) {
        String query = "SELECT COUNT(*) FROM utilisateur WHERE cin = ?";
        try (PreparedStatement ps = cnx.prepareStatement(query)) {
            ps.setInt(1, cin);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean existsByEmail(String email) {
        String query = "SELECT COUNT(*) FROM utilisateur WHERE email = ?";
        try (PreparedStatement ps = cnx.prepareStatement(query)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isValidCIN(int cin) {
        return String.valueOf(cin).matches("\\d{8}");
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

=======
    // Méthode pour récupérer tous les utilisateurs
>>>>>>> origin/jasser
    public List<Utilisateur> getAll() {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        String qry = "SELECT * FROM utilisateur";
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                Utilisateur u;
                String role = rs.getString("role");
                if ("ADMIN".equalsIgnoreCase(role)) {
                    u = new Admin(
                            rs.getInt("id_user"),
                            rs.getString("nom"),
                            rs.getString("prenom"),
                            rs.getString("email"),
                            rs.getInt("cin"),
                            rs.getString("motDePasse")
                    );
                } else {
                    u = new Citoyen(
                            rs.getInt("id_user"),
                            rs.getString("nom"),
                            rs.getString("prenom"),
                            rs.getString("email"),
                            rs.getInt("cin"),
                            rs.getString("motDePasse")
                    );
                }
                utilisateurs.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération : " + e.getMessage());
        }
        return utilisateurs;
    }

<<<<<<< HEAD
    public void update(Utilisateur utilisateur) {
        try {
=======
    // Méthode pour mettre à jour un utilisateur avec hachage conditionnel
    public void update(Utilisateur utilisateur) {
        try {
            // Récupérer l'ancien mot de passe
>>>>>>> origin/jasser
            String oldPassword = getPasswordById(utilisateur.getId_user());
            String newPassword = utilisateur.getMotDePasse();
            String hashedPassword = oldPassword;

<<<<<<< HEAD
=======
            // Si le mot de passe est modifié, on le hache avant la mise à jour
>>>>>>> origin/jasser
            if (!newPassword.equals(oldPassword)) {
                hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt(12));
            }

            String qry = "UPDATE utilisateur SET nom=?, prenom=?, email=?, cin=?, motDePasse=?, role=? WHERE id_user=?";
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setString(1, utilisateur.getNom());
            pstm.setString(2, utilisateur.getPrenom());
            pstm.setString(3, utilisateur.getEmail());
            pstm.setInt(4, utilisateur.getCin());
<<<<<<< HEAD
            pstm.setString(5, hashedPassword);
=======
            pstm.setString(5, hashedPassword); // Mot de passe (haché si modifié)
>>>>>>> origin/jasser
            pstm.setString(6, utilisateur.getRole());
            pstm.setInt(7, utilisateur.getId_user());

            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur mise à jour : " + e.getMessage());
        }
    }

<<<<<<< HEAD
=======
    // Méthode pour récupérer le mot de passe d'un utilisateur par son ID
>>>>>>> origin/jasser
    public String getPasswordById(int id_user) {
        String qry = "SELECT motDePasse FROM utilisateur WHERE id_user=?";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setInt(1, id_user);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getString("motDePasse");
            }
        } catch (SQLException e) {
            System.out.println("Erreur récupération mot de passe : " + e.getMessage());
        }
        return null;
    }

<<<<<<< HEAD
=======
    // Vérifier un mot de passe (ex: lors de la connexion)
>>>>>>> origin/jasser
    public boolean verifyPassword(String enteredPassword, String storedHashedPassword) {
        return BCrypt.checkpw(enteredPassword, storedHashedPassword);
    }

<<<<<<< HEAD
    @Override
    public void delete(Utilisateur utilisateur) {
        try {
            String qry = "DELETE FROM utilisateur WHERE id_user=?";
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setInt(1, utilisateur.getId_user());
=======
    // Méthode pour supprimer un utilisateur
    public void delete(int id_user) {
        try {
            String qry = "DELETE FROM utilisateur WHERE id_user=?";
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setInt(1, id_user);
>>>>>>> origin/jasser
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur suppression : " + e.getMessage());
        }
<<<<<<< HEAD
=======
import tn.esprit.utils.MyDatabase; // Assurez-vous d'avoir une classe pour gérer la connexion DB

import java.sql.*;

public class ServiceUtilisateur {

    private Connection cnx;

    public ServiceUtilisateur() {
        // Connexion à la base de données via singleton
        this.cnx = MyDatabase.getInstance().getCnx();
    }

    // Méthode pour récupérer un utilisateur par son ID
    public Utilisateur getById(int id) {
        Utilisateur utilisateur = null;
        String query = "SELECT * FROM utilisateur WHERE id_user = ?"; // Assure-toi que la colonne s'appelle bien 'id_user'

        try (PreparedStatement statement = cnx.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Création d'une instance de l'utilisateur avec les données récupérées
                    utilisateur = new Utilisateur();
                    utilisateur.setid_user(resultSet.getInt("id_user"));


                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return utilisateur;
>>>>>>> origin/may
    }
}
=======
    }
}
>>>>>>> origin/jasser
