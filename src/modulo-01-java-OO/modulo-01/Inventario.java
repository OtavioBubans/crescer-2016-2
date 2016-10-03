
import java.util.ArrayList;


public class Inventario{
      
    private ArrayList<Item> itens;
    
    public Inventario(){
        itens = new ArrayList<>();
    }
    
    //public ArrayList getItens(){
    //    return itens;
    //}

    public int getTamanho(){
        return this.itens.size();
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
    
     public ArrayList<Item> getItens(){
        return this.itens;
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
    
     public void aumentarUnidadesDosItens(int unidades) {
        // Aumenta a unidade de cada item usando o for each
        for (Item item : itens) {
            item.aumentarUnidades(unidades);
        }
    }
    
     public Item getItemComMaiorQuantidade() {
        // maiorAteAgora = 0
        // percorro todos os itens verificando se existe alguém maior que o até agora
        // caso existir, atualiza a variável
        // retorna no final
        int indice = 0, maiorQtdAteAgora = 0;
        
        for (int i = 0; i < itens.size(); i++) {
            int qtdAtual = itens.get(i).getQuantidade();
            if (qtdAtual > maiorQtdAteAgora) {
                maiorQtdAteAgora = qtdAtual;
                indice = i;
            }
        }
        
        boolean temItens = !itens.isEmpty();
        
        // pergunta se o array de itens é igual a 0
        // se for igual a 0 retorna itens 0 
        // caso contrario retorna null
        return temItens ? itens.get(indice) : null;
    }
     
     public void aumentarUnidadesDosItensIrishDwarv(int unidades) { 
        int somatorio = 0;
       // int unidade = unidades;
        
        while(unidades > 0){
            somatorio += unidades;
            unidades--;
        }

         for (Item item : itens) { 
            item.aumentarUnidades(unidades * somatorio); 
        } 
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