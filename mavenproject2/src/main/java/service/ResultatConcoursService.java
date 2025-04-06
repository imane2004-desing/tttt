/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import beans.ResultatConcours;
import connexion.Connexion;



/**
 *
 * @author hp
 */
public class ResultatConcoursService {

    public static Iterable<ResultatConcours> findAllResults() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean addResult(ResultatConcours resultat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean deleteResult(int resultatId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection connection;

    public ResultatConcoursService() {
        connection = Connexion.getConnection();
    }

    public boolean createResultat(ResultatConcours resultat) {
        String sql = "INSERT INTO ResultatConcours (concours_id, participant_id, note) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, (int) resultat.getConcoursId());
            stmt.setInt(2, (int) resultat.getParticipantId());
            stmt.setDouble(3, resultat.getNote());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public DefaultCategoryDataset getTauxReussiteParConcours() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String sql = "SELECT concours_id, AVG(note) AS avg_note FROM ResultatConcours GROUP BY concours_id";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int concoursId = rs.getInt("concours_id");
                double avgNote = rs.getDouble("avg_note");
                dataset.addValue(avgNote, "Taux de Réussite", String.valueOf(concoursId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataset;
    }

    public Object findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean create(ResultatConcours resultat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
