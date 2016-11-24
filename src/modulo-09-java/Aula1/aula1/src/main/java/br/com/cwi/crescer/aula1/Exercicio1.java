/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula1;

/**
 *
 * @author otavio.bubans
 */
public class Exercicio1 {
    
    public int contaVogais(String frase){
         int contaVogais =0;
         int tamanhoFrase = frase.length();
         for(int i = 0; i < tamanhoFrase; i++){
             //"abc".substring(1);
             
             if("a".equals(frase.substring(i))){
                 contaVogais ++;
             }
             if("e".equals(frase.substring(i))){
                  contaVogais ++;
             }
             if("i".equals(frase.substring(i))){
                  contaVogais ++;
             }
             if("o".equals(frase.substring(i)) ){
                  contaVogais ++;
             }
              if("u".equals(frase.substring(i)) ){
                  contaVogais ++;
             }
         }
         return contaVogais;
     }
     
     public String inverteString(String palavra){
         
         int tamanhoPalavra = palavra.length();
         String fraseInvertida = "";
         
        
         for(int i=tamanhoPalavra; i >= 0; i--){
             fraseInvertida += palavra.substring(i);
         }
         return fraseInvertida;
     }
    
}
