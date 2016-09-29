

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DwarvesTest
{
    
    @Test
    public void dwarfNasce10Vida(){
        
        Dwarves dwarf = new Dwarves();
        assertEquals(110, dwarf.getVida());  
        
    }
    
    @Test
    public void perdeVidaSeisVezes(){
        Dwarves dwarf = new Dwarves();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        assertEquals(50, dwarf.getVida());
        
        
    }
    
}