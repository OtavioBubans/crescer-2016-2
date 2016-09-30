
import java.util.ArrayList;


public class Inventario{
      
    private ArrayList<Item> itens;
    
    public Inventario(){
        itens = new ArrayList<>();
    }
    
    
    public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public void removerItem(Item item){
        itens.remove(item);
    }
    
     public ArrayList<Item> getItens(){
        return this.itens;
    }

    public int getTamanho(){
        return this.itens.size();
    }
    
    public String getDescricoesItens(){
        
        String itensInventario = "";
        
        for(int i=0; i < itens.size(); i++ ){
            itensInventario += itens.get(i).getDescricao();
            if(i < itens.size() - 1){
                itensInventario += ", ";
            }
        }
        
        return itensInventario;
    }
    
    public void ordenarItens(){
        
        int maior = 0;
        Item itemMaior;
        Item itemMenor;
        
        ArrayList<Item> itensAux = new ArrayList<>();
        
        for(int i= 0; i < itens.size(); i++){
            
            for(int j = 1; j < itens.size()-1; j++){
                
                if(itens.get(i).getQuantidade() > itens.get(j).getQuantidade()){ 
                    itemMaior = itens.get(i);
                    itemMenor = itens.get(j);
                 //   itensAux.adicionarItem(itemMenor);
                 //   itensAux.adicionarItem(itemMaior);
                }
            }
        }
 
    }
    
     public void aumentarUnidadesDosItens(int unidades) { 
        for (Item item : itens) { 
            item.aumentarUnidades(unidades); 
        } 
    } 
    
     public void aumentarUnidadesDosItensIrishDwarv(int unidades) { 
        int somatorio = 0;
        int unidade = unidades;
        
        while(unidades > 0){
            somatorio += unidades;
            unidade--;
        }

         for (Item item : itens) { 
            item.aumentarUnidades(unidades * somatorio); 
        } 
    } 
    
    //public void aumentaUnidadesDosItens(){
        
   // }
    
    
   /** public void rodar() {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item("Espada Z", 1));
        itens.add(new Item("Semente dos Deuses", 56));
        itens.add(new Item("Nuvem voadora", 1));
        
        for (int i = 0; i < itens.size(); i++) {
            Item itemAtual = itens.get(i);
            System.out.println(itemAtual.getDescricao());
        }
        
    } */
   
    
}