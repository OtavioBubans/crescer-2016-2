

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


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
    
    @Test
    public void dwarvesAddUmItem(){
        Dwarves lin = new Dwarves();
        Item item = new Item("Espada",4);
        
        lin.adicionarItem(item);
        
        assertEquals(1,lin.getInventario().getTamanho());
    }
    
    @Test
    public void dwarvesAdd2ItemRemoveUmItem(){
        Dwarves lin = new Dwarves();
        Item item = new Item("Espada",4);
        Item item2 = new Item("Machado",4);
        
        lin.adicionarItem(item);
        lin.adicionarItem(item2);
        lin.perderItem(item);
        
        assertEquals(1,lin.getInventario().getTamanho());
    }
    
    @Test
    public void removeItemRepetido(){
        //Rever teste, pois não garante que remove o item repetido
        //apenas é certo que remove 1 Item
        
        Dwarves lin = new Dwarves();
        
        Item item1 = new Item("Machado",4);
        Item item2 = new Item("Espada",4);
        Item item3 = new Item("Escudo",5);
        Item item4 = new Item("Espada",4);
        Item item5;
        
        lin.adicionarItem(item1);
        lin.adicionarItem(item2);
        lin.adicionarItem(item3);
        lin.adicionarItem(item4);
        
        lin.perderItem(item2);
       
        assertEquals(3,lin.getInventario().getTamanho());
        
        
    }
    
    

    
    
}
