

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class ElfoTest{
  
    @Test
    public void elfoNasceComNome(){
        // Arrange
        String nomeEsperado = "Bruce wayne";
        // Act
        Elfo elfoDoTeste = new Elfo(nomeEsperado);
        // Assert
        assertEquals(nomeEsperado, elfoDoTeste.getNome());
    }
    
    @Test 
    public void elfoNasceComArco() {
        // Act
        Elfo elfoDoTeste = new Elfo("Elrond");
        // Assert
        assertEquals("Arco", elfoDoTeste.getArco().getDescricao());
        assertEquals(1, elfoDoTeste.getArco().getQuantidade());
    }
    
    @Test
    public void elfoNasceComFlecha(){
        Elfo elfoDoTeste = new Elfo("Legolas");
        assertEquals("Flechas",elfoDoTeste.getFlecha().getDescricao());
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade());
    }
    
    @Test
    public void atiraFlecha (){
        //Arrange
        Elfo elfoDoTeste = new Elfo("Legolas");
        //Act
        elfoDoTeste.atirarFlecha(new Dwarves());
        //Assert
        assertEquals(41, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(1, elfoDoTeste.getExperiencia());
    }
     
   /** @Test
    public void atiraFlechaEmDwarves (){
        //Arrange
        Elfo elfoDoTeste = new Elfo("Legolas");
        //Act
        elfoDoTeste.atirarEmDwarves( new Dwarves());
        //Assert
        assertEquals(41, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(1, elfoDoTeste.getExperiencia());
    }*/
    
   //atirarEmDwarves
    
   @Test
    public void atiraDuasFlechas (){
        //Arrange
        Elfo elfoDoTeste = new Elfo("Legolas");
        //Act
        elfoDoTeste.atirarFlecha(new Dwarves());
        elfoDoTeste.atirarFlecha(new Dwarves());
        //Assert
        assertEquals(40, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(2, elfoDoTeste.getExperiencia());
    }
    
    @Test
    public void elfoNaoAtiraFlecha(){
        // Arrange & Act
        Elfo elfoTeste = new Elfo("Zee");
        // Assert
        assertEquals(42, elfoTeste.getFlecha().getQuantidade());
        assertEquals(0, elfoTeste.getExperiencia());
    }
     
    @Test
    public void terminaComFlechas(){
        Elfo elfoDoTeste = new Elfo("Legolas");
        
        while( elfoDoTeste.getFlecha().getQuantidade() != 0){
            elfoDoTeste.atirarFlecha(new Dwarves());
        }  
        assertEquals(0, elfoDoTeste.getFlecha().getQuantidade());        
    }
    
 
    @Test
    public void testaFlechasNegativas(){ 
        Elfo elfoDoTeste = new Elfo("Legolas");
         
        while( elfoDoTeste.getFlecha().getQuantidade() != 0){
            elfoDoTeste.atirarFlecha(new Dwarves());
        } 
        
        elfoDoTeste.atirarFlecha(new Dwarves()); // Aqui simula a tentativa 
                                    // de atirar uma flecha com a quantidade zero
        assertEquals(0, elfoDoTeste.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoAcertaFlechaEmUmDwarves(){
        Elfo elfoDoTeste = new Elfo("Légolas");
        Dwarves anao = new Dwarves();
        elfoDoTeste.atirarFlecha(anao);
        assertEquals(100,anao.getVida());
    }
    
     @Test
    public void elfoAcertaDuasFlechasEmUmDwarves(){
        Elfo elfoDoTeste = new Elfo("Légolas");
        Dwarves anao = new Dwarves();
        elfoDoTeste.atirarFlecha(anao);
        elfoDoTeste.atirarFlecha(anao);
        assertEquals(90,anao.getVida());
    }
  
    @Test
    public void criarElfoInformandoZeroFlechas(){
        Elfo elfoTeste = new Elfo("Zee", 0);
        assertEquals(0, elfoTeste.getFlecha().getQuantidade());
    }
    
    @Test
   public void elfoTesteToString(){
       Elfo elfoTeste =  new Elfo("Legolas");
       assertEquals("Legolas possui 42 flechas e 0 nível de experiência.",
                     elfoTeste.toString());
    }
    
    @Test
    public void elfoAtiraFlechaToString(){
        Elfo elfoTeste = new Elfo("Lubin");
        elfoTeste.atirarFlecha( new Dwarves());
        assertEquals("Lubin possui 41 flechas e 1 nível de experiência.",
            elfoTeste.toString());
    }
    
     @Test
    public void elfoAtiraDuasFlechasEToString() {
        Elfo elfoTeste = new Elfo("Legolas");
        elfoTeste.atirarFlecha(new Dwarves());
        elfoTeste.atirarFlecha(new Dwarves());
        assertEquals("Legolas possui 40 flechas e 2 níveis de experiência.",
            elfoTeste.toString());

    }
    
       @Test
    public void elfoNovoConstrutor(){
        
        Elfo elfoTeste = new Elfo("Zee",50);
        
        assertEquals("Zee", elfoTeste.getNome());
        assertEquals(50, elfoTeste.getFlecha().getQuantidade());
        
    }
    
   /** @Test
    public void criarElfoInformandoZeroFlechas() {
        Elfo elrond = new Elfo("Elrond", 0);
        assertEquals(0, elrond.getFlecha().getQuantidade());
    }*/
    
     @Test
    public void criarElfoInformandoFlechasNegativas() {
        Elfo elrond = new Elfo("Elrond", -56);
        assertEquals(42, elrond.getFlecha().getQuantidade());
    }
    
   
    @Test
    public void elfoNasceVivo() { 
        Elfo elfo = new Elfo("Zee"); 
        assertEquals(Status.VIVO, elfo.getStatus()); 
    } 
    
    @Test
    public void elfoNasceComArcoEFlechaInventario(){
        // Está dando uma mensagem diferente na hora de compilar 
        // mas não aparece erro do java
        // O programa compila normal
        
        ArrayList<Item> itens = new ArrayList<>();
        
        Elfo elfoTeste = new Elfo("Legolas");
        itens = elfoTeste.getInventario().getItens();
        assertEquals(2,elfoTeste.getInventario().getTamanho());
        
    }
    
    @Test
    public void nasceCom100DeVida(){
        Elfo elfo = new Elfo("Otavio");
        assertEquals(100, elfo.getVida());
    }
    
}
