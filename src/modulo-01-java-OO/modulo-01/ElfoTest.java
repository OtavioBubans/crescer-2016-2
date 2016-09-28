

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ElfoTest{
  
    @Test
    public void elfoNasceComNome(){
        // Arrange
        String nomeEsperado = "Bruce wayne";
        // Act
        Elfo elfoDoTeste = new Elfo(nomeEsperado);
        // Assert
        assertEquals(nomeEsperado, elfoDoTeste.getNome());
    }
    
    @Test 
    public void elfoNasceComArco() {
        // Act
        Elfo elfoDoTeste = new Elfo("Elrond");
        // Assert
        assertEquals("Arco", elfoDoTeste.getArco().getDescricao());
        assertEquals(1, elfoDoTeste.getArco().getQuantidade());
    }
    // Escreva cenários de teste para a criação das 42 flechas do elfo 
    // e para o método atirarFlecha.
    @Test
    public void elfoNasceComFlecha(){
        Elfo elfoDoTeste = new Elfo("Legolas");
        assertEquals("Flechas",elfoDoTeste.getFlecha().getDescricao());
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade());
    }
    
    @Test
    public void atiraFlecha (){
        //Arrange
        Elfo elfoDoTeste = new Elfo("Legolas");
        //Act
        elfoDoTeste.atirarFlecha();
        //Assert
        assertEquals(41, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(1, elfoDoTeste.getExperiencia());
    }
   
    @Test
    public void atiraDuasFlechas (){
        //Arrange
        Elfo elfoDoTeste = new Elfo("Legolas");
        //Act
        elfoDoTeste.atirarFlecha();
        elfoDoTeste.atirarFlecha();
        //Assert
        assertEquals(40, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(2, elfoDoTeste.getExperiencia());
    }
     
    @Test
    public void terminaComFlechas(){
        Elfo elfoDoTeste = new Elfo("Legolas");
        
        while( elfoDoTeste.getFlecha().getQuantidade() != 0){
            elfoDoTeste.atirarFlecha();
        }  
        assertEquals(0, elfoDoTeste.getFlecha().getQuantidade());        
    }
    
    
    @Test
    public void testaFlechasNegativas(){ 
        Elfo elfoDoTeste = new Elfo("Legolas");
         
        while( elfoDoTeste.getFlecha().getQuantidade() != 0){
            elfoDoTeste.atirarFlecha();
        } 
        
        elfoDoTeste.atirarFlecha(); // Aqui simula a tentativa 
                                    // de atirar uma flecha com a quantidade 0
        assertEquals(0, elfoDoTeste.getFlecha().getQuantidade());
    }
    
    @Test
    public void tiraVidaDwarves(){
        Elfo elfoDoTeste = new Elfo("Légolas");
        Dwarves anao = new Dwarves();
        elfoDoTeste.atirarEmDwarves(anao);
        assertEquals(100,anao.getVida());
    }
    
    //@Test
   // public void elfoAtiraFlechaEmDwarf(){
        
   // }
   
   
   @Test
   public void testaTexto(){
       Elfo elfoTeste =  new Elfo("Légolas");
       elfoTeste.toString();
       assertEquals("Légolas", elfoTeste.getNome());
       assertEquals(42, elfoTeste.getFlecha());
      // assertEquals();
       
    }
    
    @Test
    public void elfoNovoConstrutor(){
        
        Elfo elfoTeste = new Elfo("Zee",50);
        
        assertEquals("Zee", elfoTeste.getNome());
        assertEquals(50, elfoTeste.getFlecha().getQuantidade());
        
    }
    
    
    
     
}
