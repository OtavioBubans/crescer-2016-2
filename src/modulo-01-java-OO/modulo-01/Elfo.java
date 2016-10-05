public class Elfo extends Personagem {
    

    
    public Elfo(String n) {
       /** nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas", 42);
        experiencia = 0;
        */
       this(n,42);
    }
    
    public Elfo(String nome, int numFlechas){
        super(nome);
       // this.nome =  nome;
       /* arco = new Item("Arco", 1);
        flecha = new Item("Flechas", numFlechas >= 0 ? numFlechas : 42);
        status = Status.VIVO;
        this.inventario = new Inventario();
        */
       //inventario.adicionarItem(flecha);
       //inventario.adicionarItem(arco);
        //experiencia = 0;
        this.vida = 100;
        this.inicializaInventario(numFlechas);
    }
    
    public void inicializaInventario(int quantFlechas){
        this.inventario.adicionarItem(new Item("Arco", 1));
        this.inventario.adicionarItem(new Item("Flechas", quantFlechas >= 0 ? quantFlechas : 42));
        
    }
    
   
    public Item getArco(){
        return this.inventario.getItens().get(0);
    }
    
    public Item getFlecha(){
        return this.inventario.getItens().get(1);
    }
    
    public Inventario getInventario(){
        return inventario;
    }
 
    public void atirarFlecha() {
        if(getFlecha().getQuantidade() >= 1){
            getFlecha().setQuantidade(getFlecha().getQuantidade() - 1);
            experiencia++;
        }
    }
    
 
    public void atirarEmDwarves( Dwarves anao ){
        if(getFlecha().getQuantidade() > 0){
            atirarFlecha();
            //anao.setVida(anao.getVida() - 10);
            //experiencia ++;
            anao.perdeVida();
        }
        
    }
    
    public String toString (){
        /**return this.nome + " possui " + flecha.getQuantidade() + 
                " e"  + this.experiencia + "niveis de Experiência.";
        */   
         //return "<nome> possui <flechas> flechas e <exp> níveis de experiência.";

        boolean flechaNoSingular = this.getFlecha().getQuantidade() == 1;
        boolean experienciaNoSingular = this.experiencia == 0 || this.experiencia == 1;
        
        // %s== String | %d== Digito 
        return String.format("%s possui %d %s e %d %s de experiência.",
            this.nome,
            this.getFlecha().getQuantidade(),
            // ?:
            flechaNoSingular ? "flecha" : "flechas",
            this.experiencia,
            experienciaNoSingular ? "nível" : "níveis"
        );
    }
    
      // public void atirarFlechaRefactory(){
   //     flecha.setQuantidade(flecha.getQuantidade()-1);
   //     experiencia++;
   // }
    
    
}