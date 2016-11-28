/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.repository;

import br.com.cwi.crescer.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author otavio.bubans
 */
public class PessoaRepository implements IDao<Pessoa, Long> {
    
    EntityManager entityManager;

    public PessoaRepository(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void insert(Pessoa pessoa) {
        
    }

    @Override
    public void delete(Pessoa pessoa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public Pessoa find(Pessoa pessoa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return pessoa; //entityManager.find(pessoa, id);
    }

    @Override
    public Pessoa find(Class c, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findAll() {
         return entityManager.createQuery("select p from p").getResultList(); 
    }
    
    
    
}
