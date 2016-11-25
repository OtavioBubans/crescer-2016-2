/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.io.File;

/**
 *
 * @author otavio.bubans
 */
public class Exemplo{
    
     public static void main(String[] args) {
      
       try {
             final boolean b = new File("aula2.txt").createNewFile();
        } catch (Exception e) {
           
        }
    }
}
