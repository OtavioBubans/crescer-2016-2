/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Otávio
 */
public class IdiomaBean extends AbstractDao <Idioma, BigDecimal> {
    
    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public IdiomaBean() {
        super(Idioma.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<Idioma> findAll() {
        return this.getEntityManager().createQuery("select g from Pessoa g").getResultList();
    }
    
}
