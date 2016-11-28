/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.repository;

import java.util.List;

/**
 *
 * @author otavio.bubans
 * @param <T>
 * @param <ID>
 */
public interface IDao<T, ID> {
    
    void insert(T t);
    void delete(T t);
    T find (Class c, ID id);
    
    List<T> findAll();
    
    
    
    
}
