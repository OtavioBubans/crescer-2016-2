
public class Dwarves{
    
   // private String nome;
    private int vida=110;
    
   /** public Dwarves(String nome){
        this.nome=nome;
        vida=110;
    }*/
    
    // Permitir que Elfos atirem flechas em Dwarves (anões)! 
    // Lembrem-se que um Dwarf nasce com 110 unidades de vida 
    // e perde 10 a cada flechada.
    
    public void perdeVida(){
        vida -= 10;;
        
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida( int v){
        vida = v;
        
    }
    
    
    
  
}
