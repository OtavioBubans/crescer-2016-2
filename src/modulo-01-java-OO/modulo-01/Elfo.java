public class Elfo extends Personagem {
    
    private static int contadorDeElfos;
    
    public static int getContador(){
        return Elfo.contadorDeElfos;
    }
    

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
        this.inicializarInventario(numFlechas);
        Elfo.contadorDeElfos++;
    }
    
    protected void finalize () throws Throwable{
        super.finalize();
        Elfo.contadorDeElfos--;
    }
    
    public static int getContadorDeElfos(){
        return Elfo.contadorDeElfos;
    }
    
    
    
    
    protected void inicializarInventario(int quantidadeFlechas) {
        this.inventario.adicionarItem(new Item("Arco", 1));
        this.inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }
    
    public Item getArco(){
        return this.inventario.getItens().get(0);
    }
    
    public Item getFlecha(){
        return this.inventario.getItens().get(1);
    }
    
    //public Inventario getInventario(){
    //    return inventario;
    //}
 
    /** Minha tentativa de atirar flecha com um método atirarFlecha 
     *  que era chamado pelo método atirarEmDwarves
     * 
     * public void atirarFlecha() {
        if(getFlecha().getQuantidade() >= 1){
            getFlecha().setQuantidade(getFlecha().getQuantidade() - 1);
            experiencia++;
        }
    }
    
    protected void atirarEmDwarves( Dwarves anao, int fatorExperiencia ){
        if(getFlecha().getQuantidade() > 0){
            atirarFlecha();
            //anao.setVida(anao.getVida() - 10);
            //experiencia ++;
            experiencia += 1 * fatorExperiencia; 
            
            anao.perdeVida();
        }
    }
    
    public void atirarEmDwarves( Dwarves anao ){
        atirarEmDwarves(anao, 1);
    }
    */
    
   public void atirarFlecha(Dwarves dwarf) {
        atirarFlechas(dwarf, 1);
    }

    protected void atirarFlechas(Dwarves dwarf, int fatorExperiencia) {
        int quantidadeFlechas = getFlecha().getQuantidade();
        boolean temFlecha = quantidadeFlechas > 0;
        if (temFlecha) {
            getFlecha().setQuantidade(quantidadeFlechas - 1);
            experiencia += 1 * fatorExperiencia;
            dwarf.perdeVida();
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