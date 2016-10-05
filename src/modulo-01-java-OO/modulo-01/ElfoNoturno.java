
public class ElfoNoturno extends Elfo{
    
    public ElfoNoturno(String nome){
        super(nome);
    }
    
    public ElfoNoturno(String nome, int qtdFlechas){
        super(nome,qtdFlechas);
    }
    
    public void atirarFlecha(Dwarves dwarf){
        if(status == Status.VIVO && getFlecha().getQuantidade() > 0){
        
        super.atirarFlechas(dwarf,3);
        this.vida *= 0.95;
        this.status = (int) this.vida == 0 ? Status.MORTO : this.status;
        
       }
    }
 
}
