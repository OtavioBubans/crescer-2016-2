
import java.util.ArrayList;

public class Exercito{
    
    private ArrayList<Elfo> exercito;
    
    public Exercito(){
        this.exercito = new ArrayList<>();
    }
    
    public void alistarElfo(Elfo elfo){
       
        if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
            exercito.add(elfo);
        }       
    }
    
    public ArrayList<Elfo> getExercito(){
        return this.exercito;
    }
    
    public int getTamanho(){
        return exercito.size();
    }
    
    public Elfo buscarElfoPeloNome(String nome){
        
        for(int i = 0; i < getTamanho(); i++){ 
           boolean achou = nome.equals(exercito.get(i).getNome());
            if(achou){
               return exercito.get(i);
           }
        }
        return null;
    }
    
    public ArrayList<Elfo> buscar(Status status){
        
        ArrayList<Elfo> elfos = new ArrayList<>();
        
        for(int i=0; i < getTamanho(); i++){
            if(status == getExercito().get(i).getStatus()){
                elfos.add(getExercito().get(i));
            }
            
        }
        
        return elfos;
    }
    
   
}
