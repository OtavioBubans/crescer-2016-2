

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class InventarioTest{
    
    @Test
    public void addUmItem(){
        
        Inventario inventario = new Inventario();
        Item item = new Item("Espada",4);
        
        inventario.adicionarItem(item);
        
        assertEquals(1, inventario.getTamanho());
    }
    
     @Test
    public void add5Iten(){
        
        Inventario inventario = new Inventario();
        Item item1 = new Item("Espada",4);
        Item item2 = new Item("Escudo",4);
        Item item3 = new Item("Machado",6);
        Item item4 = new Item("Armadura",2);
        Item item5 = new Item("Capa",25);
        
        inventario.adicionarItem(item1);
        inventario.adicionarItem(item2);
        inventario.adicionarItem(item3);
        inventario.adicionarItem(item4);
        inventario.adicionarItem(item5);
        
        assertEquals(5, inventario.getTamanho());
    }
    
    @Test
    public void addERemove1Item(){
        Inventario inventario = new Inventario();
        Item item = new Item("Espada",5);
        
        inventario.adicionarItem(item);
        inventario.removerItem(item);
        assertEquals(0, inventario.getTamanho());
    }
    
    @Test
    public void add5ItensRemove2(){
        
        Inventario inventario = new Inventario();
        Item item1 = new Item("Espada",4);
        Item item2 = new Item("Escudo",4);
        Item item3 = new Item("Machado",6);
        Item item4 = new Item("Armadura",2);
        Item item5 = new Item("Capa",25);
        
        inventario.adicionarItem(item1);
        inventario.adicionarItem(item2);
        inventario.adicionarItem(item3);
        inventario.adicionarItem(item4);
        inventario.adicionarItem(item5);
        inventario.removerItem(item1);
        inventario.removerItem(item3);
        assertEquals(3, inventario.getTamanho());
    }
    
     @Test
    public void add5ItensRemove5(){
        
        Inventario inventario = new Inventario();
        Item item1 = new Item("Espada",4);
        Item item2 = new Item("Escudo",4);
        Item item3 = new Item("Machado",6);
        Item item4 = new Item("Armadura",2);
        Item item5 = new Item("Capa",25);
        
        inventario.adicionarItem(item1);
        inventario.adicionarItem(item2);
        inventario.adicionarItem(item3);
        inventario.adicionarItem(item4);
        inventario.adicionarItem(item5);
        inventario.removerItem(item1);
        inventario.removerItem(item2);
        inventario.removerItem(item3);
        inventario.removerItem(item4);
        inventario.removerItem(item5);
        assertEquals(0, inventario.getTamanho());
    }
    
    @Test
    public void removeInventarioVazio(){
        Inventario inventario = new Inventario();
        Item item = new Item("Espada",4);
        
        inventario.removerItem(item);
        assertEquals(0, inventario.getTamanho());
    }
    
  
    
    
   
}
