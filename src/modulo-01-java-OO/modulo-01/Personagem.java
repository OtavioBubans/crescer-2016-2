public abstract class Personagem{
    
    protected String nome;
    protected Inventario inventario;
    protected Status status;
    protected int experiencia;
    protected int vida;
    
    
    public Personagem(String nome){
        this.nome = nome;
        this.status = Status.VIVO; 
        this.inventario = new Inventario();
        
    }
    
     public void setNome(String n) {
        nome = n;
    }
    
    public String getNome() {
        return nome;
    }
    
    public Inventario getInventario(){
        return inventario;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){ 
        return status;
    }
    
    public int getVida(){
        return this.vida;
    }
    
      public void adicionarItem(Item item){
        this.inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        this.inventario.removerItem(item);
    }
    
    
    
}