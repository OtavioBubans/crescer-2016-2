
public class ElfoVerde extends Elfo{
    
    //    "Espada de aço valiriano"
    //    "Arco e Flecha de Vidro"
    
    public ElfoVerde(String nome){
        this(nome,42);
        
        
    }
    
     public ElfoVerde(String nome,int numFlechas){
        super(nome);
        this.inventario.removerItem(inventario.getItens().get(1));
        this.inventario.removerItem(inventario.getItens().get(0));
        this.inventario.adicionarItem(new Item("Espada de aço valiriano",1));
        this.inventario.adicionarItem(new Item("Arco e Flecha de Vidro",numFlechas));
     }
    
    public void atirarFlecha(){
        super.atirarFlecha();
        experiencia++;       
       
    }
    
   
    
    
   
}
