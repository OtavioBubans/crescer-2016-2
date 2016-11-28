/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.exercicioaula2;

import java.io.File;
//import java.io.IOException;

/**
 *
 * @author Otávio
 */
public class MeuFileUtils {
    
    private File arquivo;
    
     public MeuFileUtils(File arquivo) {
        this.arquivo = arquivo;
    }
     
    
    
    public void criarArquivo(String nomeFile){
        
        try {
//            final File file = new File(nomeFile); 
//            final boolean b = file.createNewFile(); 
            
            final boolean b = new File(nomeFile).createNewFile();
        } catch (Exception e) {
            System.out.println("Já existe um arquivo com esse nome.");
        }        
    }
    
    
    public void deletaArquivo (File nomeFile){
         
        if(nomeFile.isFile()){
           nomeFile.delete();
        } else if(nomeFile.isDirectory()) {
            System.out.println("Não foi possivel apagar. É um diretorio");
        }else{
            System.out.println("Não é arquivo nem diretorio!");
        }
    }
    
    public String caminhoArquivo(File file){
        return file.getAbsolutePath();
        
    }
    
}
