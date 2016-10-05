import java.util.*;

public class ElfoVerde extends Elfo{
    
    //    "Espada de aço valiriano"
    //    "Arco e Flecha de Vidro"
    
    public ElfoVerde(String nome){
        super(nome);
          
    }
    
     public ElfoVerde(String nome,int numFlechas){
        super(nome,numFlechas);
        //this.inventario.removerItem(inventario.getItens().get(1));
        //this.inventario.removerItem(inventario.getItens().get(0));
        //this.inventario.adicionarItem(new Item("Espada de aço valiriano",1));
        //this.inventario.adicionarItem(new Item("Arco e Flecha de Vidro",numFlechas));
       // super(nome, quantidadeFlecha);
     }
    
    @Override
    public void atirarFlecha(Dwarves dwarf){
        super.atirarFlechas(dwarf,2);
            
    }
    
    @Override
    protected void inicializarInventario(int quantidadeFlechas) {
        this.adicionarItem(new Item("Arco de Vidro", 1));
        this.adicionarItem(new Item("Flecha de Vidro", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }
    
    public void adicionarItem(Item item) {        
        String[] validas = getNomesValidos();
        boolean podeAdicionar = item != null && new ArrayList<>(Arrays.asList(validas)).contains(item.getDescricao());

        if (podeAdicionar) {
            super.adicionarItem(item);
        }
    }

    private String[] getNomesValidos() {
        return new String[] { 
            "Espada de aço valiriano", 
            "Arco de Vidro",
            "Flecha de Vidro"
        };
    }
    
   
    
    
   
}
