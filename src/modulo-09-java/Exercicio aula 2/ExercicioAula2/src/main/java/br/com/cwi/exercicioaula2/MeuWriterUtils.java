/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.exercicioaula2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 *
 * @author Otávio
 */
public class MeuWriterUtils {
// Crie um metodo que receba o nome do arquivo e o conteudo que ele deve receber (String, List).
//O arquivo tem deve ser apenas do tipo .txt, caso contrário exibir um mensagem que o arquivo solicitado é incompatível.
//Caso não localizei, exibir um mensagem que o mesmo não existe.
    
    public void escreveNoArquivo(String nomeArquivo, List<String> conteudo) throws IOException{
        if(nomeArquivo.contains(".txt")){
        
            try(Writer writer = new FileWriter(nomeArquivo, true);
                BufferedWriter buffer = new BufferedWriter(writer);
                ){
                
              for( String item : conteudo){
                  buffer.newLine();
                  buffer.append(item);
              }
                
            } catch (FileNotFoundException e) {
            }
        }else{
            System.out.println("O arquivo .txt não existe");
        }
    }

}
