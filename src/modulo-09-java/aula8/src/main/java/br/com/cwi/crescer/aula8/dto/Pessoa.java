/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.dto;

import java.util.Date;

/**
 *
 * @author otavio.bubans
 */
public class Pessoa {
    
    private String nome;
    private Date nascimento;

    public String getNome() {
        return nome;
    }
    
    public Date getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
}
