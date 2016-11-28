/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula3;

import br.com.cwi.crescer.entity.Pessoa;
import br.com.cwi.crescer.repository.PessoaRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author otavio.bubans
 */
public class Run {
    public static void main( String[]args){
        
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRESCER");
        final EntityManager em = emf.createEntityManager(); 
        final PessoaRepository pessoaRepository = new PessoaRepository(em);
        
        final Pessoa pessoa = new Pessoa();
        //insert.setIdPessoa(1l);
        pessoa.setNmPessoa("Otávio");
        
        pessoaRepository.insert(pessoa);
       
        
//        
//        if(em.isOpen()){
//             em.getTransaction().begin();
//            try {
//                final Pessoa pessoa = new Pessoa();
//                pessoa.setIdPessoa(1l);
//                pessoa.setNmPessoa("Otávio Bubans");
//                
//                em.persist(pessoa);
//                em.getTransaction().commit();
//            }catch(Exception e){
//                em.getTransaction().rollback();
//                System.out.println("erro");
//            }
//
//       }   
        em.close();
        emf.close();
   }
         
}
