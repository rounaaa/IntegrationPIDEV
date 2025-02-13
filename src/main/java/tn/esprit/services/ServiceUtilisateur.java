package tn.esprit.services;

import tn.esprit.interfaces.IService;
import tn.esprit.models.Utilisateur;
import tn.esprit.utils.MyDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceUtilisateur implements IService<Utilisateur> {
    private Connection cnx;

    public ServiceUtilisateur() {
        cnx = MyDatabase.getInstance().getCnx();
    }

    @Override
    public void add(Utilisateur utilisateur) {
        String qry = "INSERT INTO `utilisateur`(`nom`, `prenom`, `email`, `Mdp`, `Role`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setString(1, utilisateur.getNom());
            pstm.setString(2, utilisateur.getPrenom());
            pstm.setString(3, utilisateur.getEmail());
            pstm.setString(4, utilisateur.getMdp());
            pstm.setString(5, utilisateur.getRole());

            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Utilisateur> getAll() {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        String qry = "SELECT * FROM `utilisateur`";

        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(qry);

            while (rs.next()) {
                Utilisateur u = new Utilisateur();
                u.setId_user(rs.getInt("id_user"));
                u.setNom(rs.getString("nom"));
                u.setPrenom(rs.getString("prenom"));
                u.setEmail(rs.getString("email"));
                u.setMdp(rs.getString("Mdp"));
                u.setRole(rs.getString("Role"));

                utilisateurs.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return utilisateurs;
    }

    @Override
    public void update(Utilisateur utilisateur) {
        String qry = "UPDATE `utilisateur` SET `nom`=?, `prenom`=?, `email`=?, `Mdp`=?, `Role`=? WHERE `id_user`=?";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setString(1, utilisateur.getNom());
            pstm.setString(2, utilisateur.getPrenom());
            pstm.setString(3, utilisateur.getEmail());
            pstm.setString(4, utilisateur.getMdp());
            pstm.setString(5, utilisateur.getRole());
            pstm.setInt(6, utilisateur.getId_user());

            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Utilisateur utilisateur) {
        String qry = "DELETE FROM `utilisateur` WHERE `id_user`=?";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setInt(1, utilisateur.getId_user());
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}