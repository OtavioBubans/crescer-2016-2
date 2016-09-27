

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
    public void elfoNasceComArco(){
        
    }
}
