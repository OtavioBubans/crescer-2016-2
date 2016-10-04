
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
    
     public ArrayList<Item> getItens(){
        return this.itens;
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public void removerItem(Item item){
        
       // for(int i = 0; i < itens.size(); i++){
       //     if(item.equals(itens.get(i))){
                itens.remove(item);
       //         return;
       //     }
       // }
 
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
    
    public void aumentarUnidadesProporcionalQuantidadePorItem() {
        for (Item item : this.itens) {
            item.aumentarProporcionalQuantidade();
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
    
     public void ordenarItens() {
        ordenarItens(TipoOrdenacao.ASCENDENTE);
    }
    
    public void ordenarItens(TipoOrdenacao tipoOrdenacao) {
        // Versão mais estável do Bubblesort - Melhor caso O(n), Pior caso O(n^2)
        // homenagem ao do-while: para forçar entrada na lógica
        boolean posicoesSendoTrocadas;
        boolean ascendente = tipoOrdenacao == TipoOrdenacao.ASCENDENTE;
        do {
            posicoesSendoTrocadas = false;
            for (int j = 0; j < this.itens.size() - 1; j++) {
                Item itemAtual = this.itens.get(j);
                Item proximo = this.itens.get(j + 1);

                boolean precisaTrocar = 
                    ascendente ? itemAtual.getQuantidade() > proximo.getQuantidade() : itemAtual.getQuantidade() < proximo.getQuantidade();

                if (precisaTrocar) {
                    this.itens.set(j, proximo);
                    this.itens.set(j + 1, itemAtual);
                    posicoesSendoTrocadas = true;
                }
            }
        } while (posicoesSendoTrocadas);

    }
    
    
    /**
     * 
     public void ordenarItens () {
        
        int min = 0;
            for (int i = 0; i < itens.size(); i++) {
                min = i; // mínimo inicial
                for (int j = i+1; j < itens.size(); j++){
                    if (itens.get(j).getQuantidade() < itens.get(min).getQuantidade()){
                        min = j; // acha o novo mínimo
                    }
                int novoMin = itens.get(i).getQuantidade(); // coloca o novo mínimo (min)
                //a[i] = a[min]; // na posição correta (i)
                itens.set(itens.get(i),itens.get(min));
                //a[min] = T;
                itens.set(min,novoMin);
               }
        }
    }*/
    
    
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