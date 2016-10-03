
public class IrishDwarf extends Dwarves{
    
    //private String nome;
   // private int vida = 110;
   // private DataTerceiraEra dataNascimento;
   // private int experiencia;
   // private Status status;
    //private Inventario inventario;
    
    
    public IrishDwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome,dataNascimento);
        
        //this.nome=nome;
        //this.dataNascimento = dataNascimento;
        //this.status = Status.VIVO;
        //this.inventario = new Inventario();
        //vida=110;
    }
    
    public IrishDwarf(){
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
    
   // public int getVida(){ return vida; }
    
   // public void setVida( int v){vida = v;}
    
   // public String getNome(){return this.nome;}
    
   // public int getExperiencia(){ return experiencia;}
       
   // public Status getStatus(){ return status;}
    
   // public DataTerceiraEra getDataNascimento(){ return this.dataNascimento;}
    
    public void tentarSorte() { 
        boolean temSorte = getNumeroSorte() == -3333; 
        
        if (temSorte) { 
            // aumenta 1000 unidades para todos itens do inventario 
            inventario.aumentarUnidadesDosItensIrishDwarv(1000); 
        } 
    }
        
}
