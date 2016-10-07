import java.util.List;
import java.util.ArrayList;

public interface ExercitoBase{
 
    //Elfo[] getExercito();
    //void alistarElfo(Elfo elfo);
    //Elfo buscarElfoPeloNome(String nome);
   // ArrayList<Elfo> buscar(Status status);
    
    
    Elfo[] getExercito();
    void alistar(Elfo elfo);
    Elfo buscarElfoPeloNome(String nome);
    ArrayList<Elfo> buscar(Status status);
    void atacar();
    List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes);
    
}
