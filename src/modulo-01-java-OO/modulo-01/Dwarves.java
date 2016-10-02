import java.util.ArrayList;

public class Dwarves{
     
    private String nome;
    private int vida = 110;
    private int experiencia;
    private DataTerceiraEra dataNascimento;
    private Status status;
    private Inventario inventario;
    
    
    //private double numeroSorte;
    
    public Dwarves(String nome, DataTerceiraEra dataNascimento){
        this.nome=nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
        //vida=110;
    }
    
    public Dwarves(){
        //dataNascimento = new DataTerceiraEra(1,1,1);
        // status = Status.VIVO;
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    public void perdeVida(){
      //minha tentativa. Não deu certo pra fazer os testes. Não dizia
        /** if(vida > 0){
           
            if(getNumeroSorte() < 0.0){
               experiencia = experiencia + 2;
            }else if(getNumeroSorte() >= 0 && getNumeroSorte() <= 100){
                // TO-DO  melhorar este código, remover este if inutil
            }else{
                vida -= 10;
            }
        }else{
            status = Status.MORTO;
        }   */  
        
        boolean estaMorto = status.equals(Status.MORTO);
        
        if(estaMorto){
            return;
        }
        
        double numero = this.getNumeroSorte();
        if(numero < 0){
            this.experiencia += 2;
        }
        
        if(numero > 100){
            int vidaAposFlechada = this.vida - 10;
            if(vidaAposFlechada == 0){
                status = Status.MORTO;
            }
            
            if(vida > 0){
                vida = vidaAposFlechada;
            }
        }
        
    }
    
    public int getVida(){ return vida; }
    
    public void setVida( int v){vida = v;}
    
    public String getNome(){return this.nome;}
    
    public int getExperiencia(){ return experiencia;}
       
    public Status getStatus(){ return status;}
    
    public DataTerceiraEra getDataNascimento(){ return this.dataNascimento;}
    
    public Inventario getInventario(){return inventario;}
    
        
    public double getNumeroSorte(){
        double numeroSorte = 101.0;
        if(dataNascimento.ehBissexto() == true && vida >= 80 && vida <=90){
            numeroSorte = numeroSorte * -33;
        }
        
        if(dataNascimento.ehBissexto() == false && nome == "Seixas" || nome == "Meireles"){
           numeroSorte = numeroSorte * 33;
           numeroSorte = numeroSorte % 100;
        }
        return numeroSorte;
        
    }
    
    public void adicionarItem(Item item){
        this.inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        this.inventario.removerItem(item);
    }
    
    
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        if (temSorte) {
            // aumenta 1000 unidades para todos itens do inventario
            inventario.aumentarUnidadesDosItens(1000);
        }
    }
    
    }


