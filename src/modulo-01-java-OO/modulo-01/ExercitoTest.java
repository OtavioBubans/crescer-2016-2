import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class ExercitoTest{
    
    
    @After 
    // executa após cada cenário de testes. 
    public void tearDown() { 
        System.gc(); 
    }
    
    
    @Test
    public void alistaElfosNormais(){
        
        Exercito exercito = new Exercito();
        Elfo elfoNormal = new Elfo("Otávio");
        
        exercito.alistar(elfoNormal); 
        assertEquals(0, exercito.getTamanho());
        
        Elfo elfoNovo = new ElfoVerde("Otávio");
        exercito.alistar(elfoNovo);
        
        assertEquals(1,exercito.getTamanho());
        
    }
    
    @Test
    public void alistaUmElfoNoturno(){
        Exercito exercito = new Exercito();
        ElfoNoturno elfoNoturno = new ElfoNoturno("Jaule",60);
        ElfoNoturno elfoNoturno1 = new ElfoNoturno("Bit", 90);
        
        exercito.alistar(elfoNoturno);
        exercito.alistar(elfoNoturno1);
        
        assertEquals(2,exercito.getTamanho());
        assertEquals("Jaule",elfoNoturno.getNome());
        assertEquals("Bit",elfoNoturno1.getNome());
    }
    
    @Test
    public void alistarUmElfoVerde(){
        
        Exercito exercito = new Exercito();
        ElfoVerde elfoVerde = new ElfoVerde("Otávio", 50);
        ElfoVerde elfoVerde1 = new ElfoVerde("Gwart", 70);
        
        exercito.alistar(elfoVerde);
        exercito.alistar(elfoVerde1);
        
        assertEquals(2,exercito.getTamanho());
        assertEquals("Otávio",elfoVerde.getNome());
        assertEquals("Gwart",elfoVerde1.getNome());
    }
    
    @Test
    public void alistarElfosVerdesENoturnos(){
        /*Exercito exercito = new Exercito();
        
        ElfoVerde elfoVerde = new ElfoVerde("Otávio", 50);
        ElfoNoturno elfoNoturno1 = new ElfoNoturno("Bit", 90);
        
        exercito.alistar(elfoVerde);
        exercito.alistar(elfoNoturno1);
        
        assertEquals(2,exercito.getTamanho());
        assertEquals("Otávio",elfoVerde.getNome());
        assertEquals("Bit",elfoNoturno1.getNome());
        
        assertEquals("Otávio", exercito.getExercito().get(0).getNome());
        assertEquals("Bit", exercito.getExercito().get(1).getNome());
        */
       Exercito exercito = new Exercito();
       Elfo elfoNoturno = new ElfoNoturno("Night Elf");
       exercito.alistar(elfoNoturno);
       assertEquals(elfoNoturno, exercito.getExercito()[0]);
        
    }
    
    @Test
    public void buscaElfo(){
        Exercito exercito = new Exercito();
        
        exercito.alistar(new ElfoVerde("Otavio",10));
        exercito.alistar(new ElfoVerde("Legolas",20)); 
        exercito.alistar(new ElfoVerde("Gwart", 30));
        
        ElfoVerde elfoVerde = new ElfoVerde("Bit", 40);
        exercito.alistar(elfoVerde);
        exercito.alistar(new ElfoVerde("Bee",50));
        exercito.alistar(new ElfoVerde("Zua",60));
        
        Elfo nomeBuscado = exercito.buscarElfoPeloNome(elfoVerde.getNome());
        
        assertEquals("Bit",nomeBuscado.getNome());
    }
    
    @Test
    public void buscaElfoInexistente(){
        Exercito exercito = new Exercito();
        
        exercito.alistar(new ElfoVerde("Otavio",10));
        exercito.alistar(new ElfoVerde("Legolas",20));
        exercito.alistar(new ElfoVerde("Gwart", 30));
        exercito.alistar(new ElfoVerde("Bit", 40));
        exercito.alistar(new ElfoVerde("Bee",50));
        exercito.alistar(new ElfoVerde("Zua",60));
        
        Elfo nomeBuscado = exercito.buscarElfoPeloNome("Batman");
        
        assertEquals(null,nomeBuscado);
    }
    
    @Test
    public void testaBuscaMorto(){
        
       Exercito exercito = new Exercito();
        Elfo recruta1 = new ElfoVerde("Elfo Recruta");
        Elfo recruta2 = criarElfoNoturnoEMatalo();
        Elfo recruta3 = new ElfoVerde("Elfo Recruta");
        exercito.alistar(recruta1);
        exercito.alistar(recruta2);
        exercito.alistar(recruta3);
        ArrayList<Elfo> resultado = exercito.buscar(Status.MORTO);
        assertEquals(1, resultado.size());
        assertEquals(recruta2, resultado.get(0));
    }
    
    @Test
    public void testaBuscaVivo(){
        
        Exercito exercito = new Exercito();
        
        ArrayList<Elfo> elfos = new ArrayList<>();
        
        exercito.alistar(new ElfoNoturno("Otavio",10)); //
        exercito.alistar(new ElfoVerde("Legolas",20));
        exercito.alistar(new ElfoVerde("Gwart", 30)); //
        exercito.alistar(new ElfoNoturno("Bit", 40));
        exercito.alistar(new ElfoVerde("Bee",50)); //
        exercito.alistar(new ElfoVerde("Zua",60));
        
        Status status = Status.VIVO;
          
        elfos = exercito.buscar(status);
        
        assertEquals(6,elfos.size());
        
        assertEquals(Status.VIVO, elfos.get(0).getStatus()); 
        assertEquals(Status.VIVO, elfos.get(1).getStatus());
        assertEquals(Status.VIVO, elfos.get(2).getStatus());
        assertEquals(Status.VIVO, elfos.get(3).getStatus()); 
        assertEquals(Status.VIVO, elfos.get(4).getStatus());
        assertEquals(Status.VIVO, elfos.get(5).getStatus());

    }
    
    @Test
    public void testaOrdenacao(){
        
        Exercito exercito = new Exercito();
        List<Elfo> elfos = new ArrayList<>();
        
        exercito.alistar(new ElfoNoturno("Otavio",10)); //
        exercito.alistar(new ElfoVerde("Legolas",20));
        exercito.alistar(new ElfoVerde("Gwart", 30)); //
        exercito.alistar(new ElfoNoturno("Bit", 40));
        exercito.alistar(new ElfoVerde("Bee",50)); //
        exercito.alistar(new ElfoVerde("Zua",60));
        
        elfos = exercito.getExercito1();
 
        exercito.getOrdemDeAtaque(elfos);
        
        
        //assertEquals(6,exercito.getTamanho());
        
        assertEquals(elfos.get(0).getNome(), "Legolas");
        assertEquals(elfos.get(1).getNome(), "Gwart");
        assertEquals(elfos.get(2).getNome(), "Bee");
        assertEquals(elfos.get(3).getNome(), "Zua");
        assertEquals(elfos.get(4).getNome(), "Otavio");
        assertEquals(elfos.get(5).getNome(), "Bit");
        
        
        
        
    }
    
    private ElfoNoturno criarElfoNoturnoEMatalo() {
        ElfoNoturno suicida = new ElfoNoturno("Elfo kamikaze", 90);
        for (int i = 0; i < 90; i++)
            suicida.atirarFlecha(new Dwarves());
        return suicida;
    }
    
    
    
    

}
