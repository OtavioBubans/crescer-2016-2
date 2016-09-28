

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
        Elfo elfoDoTeste = new Elfo("Legolas");
        elfoDoTeste.atirarFlecha();
        assertEquals(41, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(1, elfoDoTeste.getExperiencia());
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
       // assertEquals(0, elfoDoTeste.getFlecha().getQuantidade());
        
        elfoDoTeste.atirarFlecha();
        assertEquals((0-1), elfoDoTeste.getFlecha().getQuantidade());
        
        
    }
     
}
