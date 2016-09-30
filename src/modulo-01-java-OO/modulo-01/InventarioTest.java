

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class InventarioTest{
    
    @Test
    public void addUmItem(){
        
        Inventario inventario = new Inventario();
        Item item = new Item();
        
        inventario.adicionarItem(item);
        
        assertEquals(1, inventario.getTamanho());
    }
    
     @Test
    public void add5Iten(){
        
        Inventario inventario = new Inventario();
        Item item = new Item();
        
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        
        assertEquals(5, inventario.getTamanho());
    }
    
    @Test
    public void addERemove1Item(){
        Inventario inventario = new Inventario();
        Item item = new Item();
        
        inventario.adicionarItem(item);
        inventario.removerItem(item);
        assertEquals(0, inventario.getTamanho());
    }
    
    @Test
    public void add5ItensRemove2(){
        
        Inventario inventario = new Inventario();
        Item item = new Item();
        
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.removerItem(item);
        inventario.removerItem(item);
        assertEquals(3, inventario.getTamanho());
    }
    
     @Test
    public void add5ItensRemove5(){
        
        Inventario inventario = new Inventario();
        Item item = new Item();
        
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.adicionarItem(item);
        inventario.removerItem(item);
        inventario.removerItem(item);
        inventario.removerItem(item);
        inventario.removerItem(item);
        inventario.removerItem(item);
        assertEquals(0, inventario.getTamanho());
    }
    
    @Test
    public void removeInventarioVazio(){
        Inventario inventario = new Inventario();
        Item item = new Item();
        
        inventario.removerItem(item);
        assertEquals(0, inventario.getTamanho());
    }
    
  
    
    
   
}
