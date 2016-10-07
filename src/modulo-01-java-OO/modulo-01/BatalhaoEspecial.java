import java.util.ArrayList;
import java.util.HashMap;

import java.util.Collection;

public class BatalhaoEspecial{
    
    private HashMap<String,Elfo> exercito;
    
    public BatalhaoEspecial(){
       exercito = new HashMap<>();
    }
    
    public void alistarElfo(Elfo elfo){
       
        if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
            this.exercito.put(elfo.getNome(),elfo);
        }       
    }
     
   //public Elfo[] getExercito(){
       
   //    return.exercito.valu
       
   // }
   
   
    
    public int getTamanho(){ 
        return exercito.size();
    }
    
    public Elfo buscarElfoPeloNome(String nome){
        
        return exercito.get(nome);       
    }
    
    public ArrayList<Elfo> buscar(Status status){
        
        ArrayList<Elfo> elfos = new ArrayList<>();
       
        for(int i=0; i < exercito.size(); i++){
          
           // if(status == getExercito().get(i).getStatus()){
           //     elfos.add(getExercito().get(i));
           //}
            
        }
        
        return elfos;
     
    }
    
    
    
    
    
}