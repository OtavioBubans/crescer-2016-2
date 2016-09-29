

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DwarvesTest
{
    
    @Test
    public void dwarfNasce110Vida(){
        
        Dwarves dwarf = new Dwarves();
        
        assertEquals(110, dwarf.getVida());  
    }
    
    @Test
    public void perdeVidaUmaVez(){
        Dwarves dwarf = new Dwarves();
        dwarf.perdeVida();
        assertEquals(100, dwarf.getVida());
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
    
   // @Test
   // public void dwarfNasceVivo(){
   // }
    
    @Test
    public void dwarfRecebeUmFlechaFicaVivo(){
        Dwarves dwarf = new Dwarves();
        
        dwarf.perdeVida();
        
        assertEquals(Status.VIVO, dwarf.getStatus());
    }
    
    @Test
    public void dwarfLeva5FlechasFicaVivo(){
        Dwarves dwarf = new Dwarves();     
        
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        assertEquals(Status.VIVO, dwarf.getStatus());
        
    }
    
    
    
     @Test
    public void dwarfLeva11FlechasFicaMorre(){
        Dwarves dwarf = new Dwarves();     
        
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        assertEquals(Status.MORTO, dwarf.getStatus());
        
    }
    
    @Test
    public void dwarfLeva11FlechasVida0(){
        Dwarves dwarf = new Dwarves();     
        
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        assertEquals(0, dwarf.getVida());
        
    }
    
    @Test
    public void dwarfCriadoInformandoNomeENascimento() {
        Dwarves gimli = new Dwarves("Gimli", new DataTerceiraEra(12, 11, 1900));
        assertEquals("Gimli", gimli.getNome());
        assertEquals(12, gimli.getDataNascimento().getDia());
        assertEquals(11, gimli.getDataNascimento().getMes());
        assertEquals(1900, gimli.getDataNascimento().getAno());
    }
    
    
}
