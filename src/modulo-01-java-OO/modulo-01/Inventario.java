
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
        
        for(int i = 0; i < itens.size(); i++){
            if(item.equals(itens.get(i))){
                itens.remove(i);
                return;
            }
        }
 
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
    
    
    
    public ArrayList getItens(){
        return itens;
    }

    public int getTamanho(){
        return this.itens.size();
    }
    
    
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