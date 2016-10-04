
public class ElfoVerde extends Elfo{
    
    //    "Espada de aço valiriano"
    //    "Arco e Flecha de Vidro"
    
    public ElfoVerde(String nome){
        
        super(nome);
        this.inventario.removerItem(inventario.getItens().get(1));
        this.inventario.removerItem(inventario.getItens().get(0));
        this.inventario.adicionarItem(new Item("Espada de aço valiriano",1));
        this.inventario.adicionarItem(new Item("Arco e Flecha de Vidro",1));
    }
    
   
}
