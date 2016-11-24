/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author otavio.bubans
 */
public class Exercicio2 {
    
    enum Estados {
    AC("Acre"), AL("Alagoas"), ES("EspíritoSanto"), AP("Amapá"),
    BA("Bahia"), CE("Ceará"), DF("DistritoFederal"), GO("Goiás"),
    MA("Maranhão"), SC("SantaCatarina"), MG("MinasGerais"),
    MT("MatoGrosso"), MS("MatoGrossodoSul"), PA("Pará"),
    RS("RioGrandedoSul"), PE("Pernambuco"), PI("Piauí"),
    AM("Amazonas"), PR("Paraná"), RJ("RiodeJaneiro"),
    RN("RioGrandedoNorte"), PB("Paraíba"), RO("Rondônia"),
    RR("Roraima"), SE("Sergipe"), SP("SãoPaulo"), TO("Tocantins");

    private String nome;

    private Estados(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    }
    // logica errada -- Instaciar um StringBuffer
    public void concatenaEstados(){
      String estadosConcatenados = "";
      
      List<Estados> listaEstados;
      listaEstados = Arrays.asList(Estados.values());
      
      
      for(int i =0; i < listaEstados.size(); i++){
      estadosConcatenados += new StringBuffer(estadosConcatenados + ",")
                        .append(listaEstados.get(i));
      }
    }
    
    
    
}