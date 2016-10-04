

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class ElfoNoturnoTest{
    
    
   @Test 
    public void experienciaEmTriplo(){
        ElfoNoturno elfo = new ElfoNoturno("Otavio");
       
        elfo.atirarFlecha();
        elfo.atirarFlecha();

        assertEquals(6, elfo.getExperiencia());
   }
   
   @Test
   public void testaVida(){
        ElfoNoturno elfo = new ElfoNoturno("Otavio");
        
        elfo.atirarFlecha();
        
        assertEquals(95,elfo.getVida());
       
    }
    
    @Test
   public void atira2FlechasEPerdeVida(){
        ElfoNoturno elfo = new ElfoNoturno("Otavio");
        
        elfo.atirarFlecha(); 
        elfo.atirarFlecha();
        
        assertEquals(90,elfo.getVida());
       
    }
    

}
