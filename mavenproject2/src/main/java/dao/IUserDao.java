/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import beans.User;

/**
 *
 * @author hp
 */
public interface IUserDao {
    boolean addUser(User user);
    User findUserByLogin(String login);
    boolean authenticate(String login,String password);
}
