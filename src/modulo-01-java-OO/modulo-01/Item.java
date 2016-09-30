public class Item {
    private String descricao;
    private int quantidade;
    
    public Item(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    //public Item(){
    //    this(null,0);
    //}
    
    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
   
    public String getDescricao() {
        return descricao;
    }
    
    public void ganhaMilUnidades(){
        // usar metodo set do item
        this.quantidade += 1000;
    }
    
    public void aumentarUnidades(int unidades) { 
        quantidade += unidades; 
    } 
    
    
}









