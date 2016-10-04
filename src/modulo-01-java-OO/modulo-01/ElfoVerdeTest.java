

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class ElfoVerdeTest{
    
    @Test
    public void testaConstrutor(){
        
        String nome = "Otavio";
        ElfoVerde elfo = new ElfoVerde(nome);        
        assertEquals(nome,elfo.getNome());   
    }
    
    
    @Test
    public void testaElfoVerdeComItens(){
        ElfoVerde  elfo = new ElfoVerde("Otavio");
        assertEquals("Espada de aço valiriano", elfo.getInventario().getItens().get(0).getDescricao());
        assertEquals("Arco e Flecha de Vidro", elfo.getInventario().getItens().get(1).getDescricao());
    }
}
