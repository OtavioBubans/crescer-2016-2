

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
    
    @Test
    public void imprimiItens(){
        
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
        

        assertEquals("Espada, Escudo, Machado, Armadura, Capa", inventario.getDescricoesItens());
    }
    
     @Test
    public void aumentar1000UnidadesDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(1000);
        assertEquals(1002, inventario.getItens().get(0).getQuantidade());
        assertEquals(1045, inventario.getItens().get(1).getQuantidade());
        assertEquals(1003, inventario.getItens().get(2).getQuantidade());
    }
    
    
    
    
     @Test
    public void aumentar1UnidadeDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(1);
        assertEquals(3, inventario.getItens().get(0).getQuantidade());
        assertEquals(46, inventario.getItens().get(1).getQuantidade());
        assertEquals(4, inventario.getItens().get(2).getQuantidade());
    }

    @Test
    public void aumentar0UnidadeDosItens() {
        Inventario inventario = criarInventarioCom3Itens();
        inventario.aumentarUnidadesDosItens(0);
        assertEquals(2, inventario.getItens().get(0).getQuantidade());
        assertEquals(45, inventario.getItens().get(1).getQuantidade());
        assertEquals(3, inventario.getItens().get(2).getQuantidade());
    }

    @Test
    public void aumentarUnidadeSemItens() {
        Inventario inventario = new Inventario();
        inventario.aumentarUnidadesDosItens(1000);
        assertEquals(0, inventario.getItens().size());
    }

    @Test
    public void itemComMaiorQuantidadeCom3Itens() {
        Inventario inventario = criarInventarioCom3Itens();
        Item item = inventario.getItemComMaiorQuantidade();
        assertEquals("Poção polissuco", item.getDescricao());
        assertEquals(45, item.getQuantidade());
    }

    @Test
    public void itemComMaiorQuantidadeCom3ItensDeQuantidadesIguais() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada de aço", 2));
        inventario.adicionarItem(new Item("Poção polissuco", 2));
        inventario.adicionarItem(new Item("Lucky egg", 2));
        Item item = inventario.getItemComMaiorQuantidade();
        assertEquals("Espada de aço", item.getDescricao());
        assertEquals(2, item.getQuantidade());
    }

    @Test
    public void itemComMaiorQuantidadeComInventarioVazio() {
        Inventario inventario = new Inventario();
        Item item = inventario.getItemComMaiorQuantidade();
        assertNull(item);
    }

    @Test
    public void ordenarItensBaguncados() {
        // Arrange
        Inventario mochila = new Inventario();
        Item armadura = new Item("Armadura", 9);
        Item escudo = new Item("Escudo", 99);
        Item canivete = new Item("Canivete suíço", 2);
        mochila.adicionarItem(armadura);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens();
        // Assert
        assertEquals(canivete, mochila.getItens().get(0));
        assertEquals(armadura, mochila.getItens().get(1));
        assertEquals(escudo, mochila.getItens().get(2));
    }

    @Test
    public void ordenarItensComMesmaQuantidade() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 9);
        Item escudo = new Item("Escudo", 9);
        Item canivete = new Item("Canivete suíço", 9);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens();
        // Assert
        assertEquals(elderScroll, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(canivete, mochila.getItens().get(2));
    }

    @Test
    public void ordenarItensVazio() {
        // Arrange
        Inventario mochila = new Inventario();
        // Act
        mochila.ordenarItens();
        // Assert
        assertEquals(0, mochila.getItens().size());
    }

    @Test
    public void aumentarUnidadesProporcionalComInventarioVazio() {
        Inventario inventario = new Inventario();
        inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        assertTrue(inventario.getItens().isEmpty());
    }

    @Test
    public void aumentarUnidadesProporcionalComApenasUmItem() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada", 1));
        inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        assertEquals(1001, inventario.getItens().get(0).getQuantidade());
    }

    @Test
    public void aumentarUnidadesProporcionalComApenasDoisItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Balas .44", 2));
        inventario.adicionarItem(new Item("Balas .12", 3));
        inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        assertEquals(3002, inventario.getItens().get(0).getQuantidade());
        assertEquals(6003, inventario.getItens().get(1).getQuantidade());
    }
    
    @Test
    public void ordenarItensDescendenteComItensOrdenadosAscendente() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 1);
        Item escudo = new Item("Escudo", 2);
        Item canivete = new Item("Canivete suíço", 3);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE);
        // Assert
        assertEquals(canivete, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(elderScroll, mochila.getItens().get(2));
    }
    
    @Test
    public void ordenarItensDescendenteComItensMesmaQuantidade() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 1);
        Item escudo = new Item("Escudo", 1);
        Item canivete = new Item("Canivete suíço", 1);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE);
        // Assert
        assertEquals(elderScroll, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(canivete, mochila.getItens().get(2));
    }
    
    @Test
    public void ordenarItensDescendenteJaOrdenado() {
        // Arrange
        Inventario mochila = new Inventario();
        Item elderScroll = new Item("Elder Scroll", 3);
        Item escudo = new Item("Escudo", 2);
        Item canivete = new Item("Canivete suíço", 1);
        mochila.adicionarItem(elderScroll);
        mochila.adicionarItem(escudo);
        mochila.adicionarItem(canivete);
        // Act
        mochila.ordenarItens(TipoOrdenacao.DESCENDENTE);
        // Assert
        assertEquals(elderScroll, mochila.getItens().get(0));
        assertEquals(escudo, mochila.getItens().get(1));
        assertEquals(canivete, mochila.getItens().get(2));
    }
    
     private Inventario criarInventarioCom3Itens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada de aço", 2));
        inventario.adicionarItem(new Item("Poção polissuco", 45));
        inventario.adicionarItem(new Item("Lucky egg", 3));
        return inventario;
    }
  
    
    
   
}
