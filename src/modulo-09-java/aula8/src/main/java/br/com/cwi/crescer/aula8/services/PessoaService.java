package br.com.cwi.crescer.aula8.services;


import br.com.cwi.crescer.aula8.dto.Pessoa;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otavio.bubans
 */
@Service
public class PessoaService {

    public List<Pessoa> list() {
        Pessoa p = new Pessoa();
        p.setNome("Otávio F. Bubans");
        p.setNascimento(new Date());
        return Stream.of(p).collect(Collectors.toList());
        
    }

}