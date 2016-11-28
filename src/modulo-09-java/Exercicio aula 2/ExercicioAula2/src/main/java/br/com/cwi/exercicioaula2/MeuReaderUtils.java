/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.exercicioaula2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Otávio
 */
public class MeuReaderUtils {
    
//Crie um metodo que receba o nome do arquivo e exiba seu conteúdo.
//O arquivo tem deve ser apenas do tipo .txt, caso contrário exibir um mensagem que o arquivo solicitado é incompatível.
//Caso não localizei, exibir um mensagem que o mesmo não existe.
    
    
    public void leArquivo(File file) throws IOException{
        String nomeArquivo = file.getName();
        if(nomeArquivo.contains(".txt")){
            try( 
                Reader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);
                ){
                 buffer.lines().forEach(System.out::println); 

            }catch(FileNotFoundException e){
               
            }
        }else{
             System.out.println("O arquivo não existe");
        }
        
    }
    
}
