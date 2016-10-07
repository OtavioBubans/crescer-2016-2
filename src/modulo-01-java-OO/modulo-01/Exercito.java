import java.util.List;
import java.util.ArrayList;

public class Exercito implements ExercitoBase{

    private ArrayList<Elfo> exercito;

    public Exercito(){
        this.exercito = new ArrayList<>();
    }

    public Elfo[] getExercito(){
        return exercito.toArray(new Elfo[exercito.size()]);        
    }
    
    public ArrayList<Elfo> getExercito1(){
       return exercito;
    }

    public void alistar(Elfo elfo){
        if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
            exercito.add(elfo);
        }       
    }

    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){

        List<Elfo> elfosOrdenados = new ArrayList<>();

        for(int v=0; v < atacantes.size(); v++){
            if(atacantes.get(v).getStatus() == Status.VIVO 
            && atacantes.get(v) instanceof ElfoVerde) 
                elfosOrdenados.add(atacantes.get(v));

        }

        for(int n=0; n < atacantes.size(); n++){
            if(atacantes.get(n).getStatus() == Status.VIVO 
            && atacantes.get(n) instanceof ElfoNoturno) 
                elfosOrdenados.add(atacantes.get(n));
        }

        return elfosOrdenados;
    }

    // public ArrayList<Elfo> getExercito(){
    //     return this.exercito;
    // }

    public int getTamanho(){
        return exercito.size();
    }

    public Elfo buscarElfoPeloNome(String nome){

        /*for(int i = 0; i < exercito.size(); i++){ 
        boolean achou = nome.equals(exercito.get(i).getNome());
        if(achou){
        return exercito.get(i);
        }
        }
        return null; */

        // Java 8: contingente.filter(elfo -> nome.equals(elfo.getNome()))[0];
        // C# 3: contingente.FirstOrDefault(elfo => elfo.Nome == nome);
        // ES 2015 / ES6: contingente.filter(elfo => nome == elfo.nome)[0];
        // JS 5: contingente.filter(function(elfo) { return elfo.nome == nome })[0];
        // Ruby: contingente.filter_by { |x| x.nome == nome }

        for (Elfo elfo : exercito) {
            if (nome.equals(elfo.getNome())) {
                return elfo;
            }
        }
        return null;

    }

    public ArrayList<Elfo> buscar(Status status){

        //ArrayList<Elfo> elfos = new ArrayList<>();

        //for(int i=0; i < exercito.size(); i++){
        /**
         * comentarios temporario
         */

        //if(status == getExercito().get(i).getStatus()){
        //    elfos.add(getExercito().get(i));
        //   }   
        //}
        //return elfos;   

        // C#: return contingente.Where(x => x.Status == status);
        ArrayList<Elfo> resultado = new ArrayList<>();

        for (Elfo elfo : exercito) {
            if (elfo.getStatus() == status) {
                resultado.add(elfo);
            }
        }

        return resultado;

    }

    public void atacar() {
        System.out.println("Exército normal atacando");
    }
}