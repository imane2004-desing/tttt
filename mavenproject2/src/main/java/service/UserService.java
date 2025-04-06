/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author hp
 */


import beans.Participant;
import java.util.ArrayList;
import java.util.List;

import beans.Participant;
import beans.User;

public class UserService {
    private List<Participant> participants;

    public UserService() {
        participants = new ArrayList<>();
    }

    // Méthode pour créer un nouvel utilisateur
    public boolean create(Participant participant) {
        return participants.add(participant);
    }

    // Méthode pour récupérer tous les utilisateurs
    public List<Participant> findAll() {
        return new ArrayList<>(participants);
    }

    // Méthode pour trouver un utilisateur par son ID
    public Participant findById(int id) {
        for (Participant p : participants) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // Retourne null si non trouvé
    }

    // Méthode pour mettre à jour un utilisateur
    public boolean update(Participant updatedParticipant) {
        for (int i = 0; i < participants.size(); i++) {
            Participant p = participants.get(i);
            if (p.getId() == updatedParticipant.getId()) {
                participants.set(i, updatedParticipant);
                return true; // Mise à jour réussie
            }
        }
        return false; // Utilisateur non trouvé
    }

    // Méthode pour supprimer un utilisateur
    public boolean delete(Participant participant) {
        return participants.remove(participant);
    }

    public User findUserByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean resetPasswordBySecurityQuestion(String login, String securityAnswer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
