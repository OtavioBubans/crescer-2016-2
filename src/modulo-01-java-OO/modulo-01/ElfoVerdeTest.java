

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class ElfoVerdeTest{
    
    
     @After 
    // executa após cada cenário de testes. 
    public void tearDown() { 
        System.gc(); 
    }
    
    @Test
    public void testaConstrutor(){
        
        String nome = "Otavio";
        ElfoVerde elfo = new ElfoVerde(nome);        
        assertEquals(nome,elfo.getNome());   
    }
    
    
    @Test
    public void testaElfoVerdeComItens(){
        ElfoVerde  elfo = new ElfoVerde("Otavio");
        assertEquals("Arco de Vidro", elfo.getInventario().getItens().get(0).getDescricao());
        assertEquals("Flecha de Vidro", elfo.getInventario().getItens().get(1).getDescricao());
    }
    
    @Test
    public void nasceCom100DeVida(){
        ElfoVerde elfo = new ElfoVerde("Otavio");
        assertEquals(100, elfo.getVida());
    }
    
    @Test
    public void experienciaEmDobro(){
        
        ElfoVerde elfo = new ElfoVerde("Otavio", 3);
       
        elfo.atirarFlecha(new Dwarves());
        elfo.atirarFlecha(new Dwarves());
        elfo.atirarFlecha(new Dwarves());
       
        assertEquals(6, elfo.getExperiencia());
        
    }
   
      
}
