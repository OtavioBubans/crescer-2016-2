
public class Dwarves{
    
    private String nome;
    private int vida;
    
    public Dwarves(String nome){
        this.nome=nome;
        vida=110;
    }
    // Permitir que Elfos atirem flechas em Dwarves (anões)! 
    // Lembrem-se que um Dwarf nasce com 110 unidades de vida 
    // e perde 10 a cada flechada.
    
    public void perdeVida(int v){
        vida = vida-v;
        
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida( int v){
        vida = v;
        
    }
    
    
    
  
}
