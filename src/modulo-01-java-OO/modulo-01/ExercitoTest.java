import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class ExercitoTest{
    
    
      @Test
    public void alistaUmElfoNoturno(){
        Exercito exercito = new Exercito();
        ElfoNoturno elfoNoturno = new ElfoNoturno("Jaule",60);
        ElfoNoturno elfoNoturno1 = new ElfoNoturno("Bit", 90);
        
        exercito.alistarElfo(elfoNoturno);
        exercito.alistarElfo(elfoNoturno1);
        
        assertEquals(2,exercito.getTamanho());
        assertEquals("Jaule",elfoNoturno.getNome());
        assertEquals("Bit",elfoNoturno1.getNome());
    }
    
    @Test
    public void alistarUmElfoVerde(){
        
        Exercito exercito = new Exercito();
        ElfoVerde elfoVerde = new ElfoVerde("Otávio", 50);
        ElfoVerde elfoVerde1 = new ElfoVerde("Gwart", 70);
        
        exercito.alistarElfo(elfoVerde);
        exercito.alistarElfo(elfoVerde1);
        
        assertEquals(2,exercito.getTamanho());
        assertEquals("Otávio",elfoVerde.getNome());
        assertEquals("Gwart",elfoVerde1.getNome());
    }
    
    @Test
    public void alistarElfosVerdesENoturnos(){
        Exercito exercito = new Exercito();
        
        ElfoVerde elfoVerde = new ElfoVerde("Otávio", 50);
        ElfoNoturno elfoNoturno1 = new ElfoNoturno("Bit", 90);
        
        exercito.alistarElfo(elfoVerde);
        exercito.alistarElfo(elfoNoturno1);
        
        assertEquals(2,exercito.getTamanho());
        assertEquals("Otávio",elfoVerde.getNome());
        assertEquals("Bit",elfoNoturno1.getNome());
        
        assertEquals("Otávio", exercito.getExercito().get(0).getNome());
        assertEquals("Bit", exercito.getExercito().get(1).getNome());
        
    }
    
    @Test
    public void buscaElfo(){
        Exercito exercito = new Exercito();
        
        exercito.alistarElfo(new ElfoVerde("Otavio",10));
        exercito.alistarElfo(new ElfoVerde("Legolas",20));
        exercito.alistarElfo(new ElfoVerde("Gwart", 30));
        exercito.alistarElfo(new ElfoVerde("Bit", 40));
        exercito.alistarElfo(new ElfoVerde("Bee",50));
        exercito.alistarElfo(new ElfoVerde("Zua",60));
        
        String nomeBuscado = exercito.buscarElfoPeloNome("Bit");
        
        assertEquals("Bit",nomeBuscado);
    }
    
    @Test
    public void buscaElfoInexistente(){
        Exercito exercito = new Exercito();
        
        exercito.alistarElfo(new ElfoVerde("Otavio",10));
        exercito.alistarElfo(new ElfoVerde("Legolas",20));
        exercito.alistarElfo(new ElfoVerde("Gwart", 30));
        exercito.alistarElfo(new ElfoVerde("Bit", 40));
        exercito.alistarElfo(new ElfoVerde("Bee",50));
        exercito.alistarElfo(new ElfoVerde("Zua",60));
        
        String nomeBuscado = exercito.buscarElfoPeloNome("Batman");
        
        assertEquals(null,nomeBuscado);
    }
    
    
  
    
  


   
}
