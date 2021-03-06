/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.exercicio8.repository;

import br.com.cwi.crescer.exercicio8.entity.Filme;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author otavio.bubans
 */
public interface FilmeRepository extends PagingAndSortingRepository<Filme, Long> {
    
    List<Filme> findByTitulo(String titulo);
}
