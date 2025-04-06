/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

/**
 *
 * @author hp
 */
import java.util.List;

public interface IDao<T> {

    boolean create(T o);

    boolean delete(T o);

    boolean update(T o);

    T findById(int id);

    List<T> findAll();
}

