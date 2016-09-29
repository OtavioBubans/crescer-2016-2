
public class Dwarves{
     
    private String nome;
    private int vida = 110;
    private DataTerceiraEra dataNascimento;
    private int experiencia;
    private Status status;
    
    //private double numeroSorte;
    
    public Dwarves(String nome, DataTerceiraEra dataNascimento){
        this.nome=nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        //vida=110;
    }
    
    public Dwarves(){
        dataNascimento = new DataTerceiraEra(1,1,1);
        status = Status.VIVO;
    }
    
    public void perdeVida(){
       if(vida > 0){
           
            if(getNumeroSorte() < 0.0){
               experiencia = experiencia + 2;
            }else if(getNumeroSorte() >= 0 && getNumeroSorte() <= 100){
                // TO-DO  melhorar este código, remover este if inutil
            }else{
                vida -= 10;
            }
        }else{
            status = Status.MORTO;
        }      
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida( int v){
        vida = v;
    }
    
    public Status getStatus(){
        return status;
    }
    
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
    
    
    }


