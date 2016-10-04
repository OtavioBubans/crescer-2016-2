
public class ElfoNoturno extends Elfo{
    
    public ElfoNoturno(String nome){
        super(nome);
    }
    
    public void atirarFlecha(){
        super.atirarFlecha();
        experiencia += 2;
    }
 
}
