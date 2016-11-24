/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author otavio.bubans
 */
public class Exercicio3 {
    
    
    public void DataAtual(){
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
        System.out.println(data); 
    }
    
    
    public int retornaDiaDaSemana(Calendar data){
        return data.get(Calendar.DAY_OF_WEEK);
         
    }
}


