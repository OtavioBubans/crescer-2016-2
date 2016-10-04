

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

}
