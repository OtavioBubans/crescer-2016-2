

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class ElfoNoturnoTest{
    
    
    @After 
    // executa após cada cenário de testes. 
    public void tearDown() { 
        System.gc(); 
    } 
    
    
   @Test 
    public void experienciaEmTriplo(){
        ElfoNoturno elfo = new ElfoNoturno("Otavio");
       
        elfo.atirarFlecha(new Dwarves());
        elfo.atirarFlecha(new Dwarves());

        assertEquals(6, elfo.getExperiencia());
   }
   
   @Test
   public void testaVida(){
        ElfoNoturno elfo = new ElfoNoturno("Otavio");
        
        elfo.atirarFlecha(new Dwarves());
        
        assertEquals(95,elfo.getVida());
       
    }
    
    @Test
   public void atira2FlechasEPerdeVida(){
        ElfoNoturno elfo = new ElfoNoturno("Otavio");
        
        elfo.atirarFlecha(new Dwarves()); 
        elfo.atirarFlecha(new Dwarves());
        
        assertEquals(90,elfo.getVida());
       
    }
    

}
