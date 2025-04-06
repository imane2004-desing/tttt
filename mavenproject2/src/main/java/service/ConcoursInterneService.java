/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import beans.ConcoursInterne;
import connexion.Connexion;


/**
 *
 * @author hp
 */
public class ConcoursInterneService {
     private Connection connection;

    public ConcoursInterneService() {
        connection = Connexion.getConnection();
    }

    public boolean createConcours(ConcoursInterne concours) {
        String sql = "INSERT INTO ConcoursInterne (nom, date, lieu) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, concours.getNom());
            stmt.setString(2, concours.getDate());
            stmt.setString(3, concours.getLieu());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Iterable<ConcoursInterne> findAllConcours() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean create(ConcoursInterne concoursInterne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Iterable<ConcoursInterne> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
