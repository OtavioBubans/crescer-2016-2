
public class Dwarves{
     
    private String nome;
    private int vida = 110;
    private DataTerceiraEra dataNascimento;
    
    //private double numeroSorte;
    
    public Dwarves(String nome, DataTerceiraEra dataNascimento){
        this.nome=nome;
        this.dataNascimento = dataNascimento;
        //vida=110;
    }
    
    public Dwarves(){
        dataNascimento = new DataTerceiraEra(1,1,1);
    }
    
    public void perdeVida(){
        vida -= 10;    
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida( int v){
        vida = v;
        
    }
    
    public double getNumeroSorte(){
        double numeroSorte = 101.0;
        if(dataNascimento.ehBissexto() == true && vida >= 80 && vida <=90){
            numeroSorte = numeroSorte * -33;
        }
        
        if(dataNascimento.ehBissexto() == false && nome == "Seixas" && nome == "Meireles"){
           numeroSorte = numeroSorte * 33;
           numeroSorte = numeroSorte % 100;
        }
        return numeroSorte;
        
    }

}
