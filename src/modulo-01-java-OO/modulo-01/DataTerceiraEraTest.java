

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
   
}
