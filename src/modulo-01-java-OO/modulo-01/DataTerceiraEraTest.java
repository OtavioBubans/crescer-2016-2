

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DataTerceiraEraTest{
    
    @Test
    public void testaData(){
        
        DataTerceiraEra data = new DataTerceiraEra(1,5,2005);
        assertEquals(1,data.getDia());
        assertEquals(5,data.getMes());
        assertEquals(2005,data.getAno());
    }    
    
    @Test
    public void testaDataInexistente(){
        
        DataTerceiraEra data = new DataTerceiraEra(40,15,403);
        assertEquals(40,data.getDia());
        assertEquals(15,data.getMes());
        assertEquals(403,data.getAno());
        
    }
    
     @Test
    public void criarAno3019QueNaoEhBissexto() {
        // Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 10, 3019);
        // Act
        boolean obtido = data.ehBissexto();
        // Assert
        assertFalse(obtido);
    }
    
    @Test
    public void criarAno2000QueEhBissexto() {
        // Arrange
        DataTerceiraEra data = new DataTerceiraEra(1, 1, 2000);
        // Act
        boolean obtido = data.ehBissexto();
        // Assert
        assertTrue(obtido);
    }
    
    @Test
    public void criarAno1900NaoEhBissexto() {
        assertFalse(new DataTerceiraEra(1,1,1900).ehBissexto());
    }
    
     @Test
    public void criarAno2012QueEhBissexto() {
        assertTrue(new DataTerceiraEra(04, 05, 2012).ehBissexto());
    }
    
    @Test
    public void criarAno2200QueNaoEhBissexto() {
        assertFalse(new DataTerceiraEra(04, 05, 2200).ehBissexto());
    }
    
      @Test
    public void criarAno2015QueNaoEhBissexto() {
        assertFalse(new DataTerceiraEra(04, 05, 2015).ehBissexto());
    }
    
    
   
}
