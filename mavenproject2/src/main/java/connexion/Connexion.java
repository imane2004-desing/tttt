/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Connexion {
    private static Connexion instance = null;

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection cn = null;
    
    // Informations de connexion à la base de données
    private final String url = "jdbc:mysql://localhost:3306/gestion_concours"; // Nom de la base de données pour les concours
    private final String login = "root"; // Identifiant de connexion
    private final String password = ""; // Mot de passe de connexion

    // Constructeur privé pour empêcher l'instanciation directe
    private Connexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Chargement du driver MySQL
            cn = DriverManager.getConnection(url, login, password); // Établissement de la connexion
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver introuvable : " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erreur de connexion à la base de données : " + ex.getMessage());
        }
    }

    // Méthode d'accès à l'instance unique (avec synchronisation pour éviter les problèmes de concurrence)
    public static synchronized Connexion getInstance() {
        if (instance == null) {
            instance = new Connexion(); // Création de l'instance si elle n'existe pas
        }
        return instance; // Retourne l'instance unique
    }

    // Méthode pour obtenir la connexion
    public Connection getCn() {
        return cn; // Retourne l'objet de connexion
    }
}
