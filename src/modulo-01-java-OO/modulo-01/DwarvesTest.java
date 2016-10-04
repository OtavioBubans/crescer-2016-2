

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
    public void dwarfNasceVivo(){
         assertEquals(Status.VIVO, new Dwarves().getStatus());
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
    public void dwarfCriadoInformandoNomeENascimento() {
        Dwarves gimli = new Dwarves("Gimli", new DataTerceiraEra(12, 11, 1900));
        assertEquals("Gimli", gimli.getNome());
        assertEquals(12, gimli.getDataNascimento().getDia());
        assertEquals(11, gimli.getDataNascimento().getMes());
        assertEquals(1900, gimli.getDataNascimento().getAno());
    }
    
    @Test
    public void dwarfCriadoSemInformarNomeENascimento() {
        Dwarves dwarv = new Dwarves();
        assertNull(dwarv.getNome());
        assertEquals(1, dwarv.getDataNascimento().getDia());
        assertEquals(1, dwarv.getDataNascimento().getMes());
        assertEquals(1, dwarv.getDataNascimento().getAno());
    }
    
    
      @Test
    public void gerarNumeroAnoBissextoVidaEntre80e90() {
        // Arrange
        Dwarves bernardin = new Dwarves("Bernardin", new DataTerceiraEra(01, 01, 2016));
        bernardin.perdeVida();
        bernardin.perdeVida();
        bernardin.perdeVida();
        // Act
        double resultado = bernardin.getNumeroSorte();
        // Assert
        assertEquals(-3333.0, resultado, .0);
    }
    
     @Test
    public void gerarNumeroAnoNaoBissextoNomeSeixas() {
        // Arrange
        Dwarves seixas = new Dwarves("Seixas", new DataTerceiraEra(01, 01, 2015));
        // Act
        double resultado = seixas.getNumeroSorte();
        // Assert
        assertEquals(33.0, resultado, .0);
    }
    
      @Test
    public void gerarNumeroAnoNaoBissextoNomeMeireles() {
        // Arrange
        Dwarves seixas = new Dwarves("Meireles", new DataTerceiraEra(01, 01, 2015));
        // Act
        double resultado = seixas.getNumeroSorte();
        // Assert
        assertEquals(33.0, resultado, .0);
    }
    
    @Test
    public void gerarNumeroSemEntrarNasCondicoes() {
        // Arrange
        Dwarves balin = new Dwarves("Balin", new DataTerceiraEra(1, 1, 2015));
        // Act
        double resultado = balin.getNumeroSorte();
        // Assert
        assertEquals(101.0, resultado, .0);
    }
    
     @Test
    public void dwarfPerderVidaComNumeroSorteNegativo() {
        // Arrange
        Dwarves dwarf = new Dwarves("Gimli", new DataTerceiraEra(1,1,2000));
        dwarf.perdeVida();
        dwarf.perdeVida();
        // Act
        dwarf.perdeVida();
        // Assert
        assertEquals(2, dwarf.getExperiencia());
        assertEquals(90, dwarf.getVida(), .0);   
    }
    
      @Test
    public void dwarfPerderVidaComAnoNaoBissextoMeirelesNaoPerde() {
        Dwarves meireles = new Dwarves("Meireles", new DataTerceiraEra(2, 3, 2015));
        meireles.perdeVida();
        assertEquals(0, meireles.getExperiencia());
        assertEquals(110, meireles.getVida(), .0);
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
