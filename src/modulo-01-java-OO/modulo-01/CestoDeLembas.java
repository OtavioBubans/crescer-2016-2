public class CestoDeLembas{
    
    private int quantidade;
    
    
    public CestoDeLembas(int quantidade){
        this.quantidade=quantidade;
    }
    
     public boolean podeDividirEmPares() {
        return quantidade > 2 && quantidade % 2 == 0 && quantidade <= 100;
    }
    
    
    
       /** public boolean dividirLembas(int lembas){
            if( podeDividir(lembas) == true && lembas >= 2 && lembas <=100)
                return true;
            else{
                return false;
            }
        }     
    public boolean podeDividir( int n){
        if( n % 2 == 0){
            return true;
        }else{ 
            return false;
        }
    }*/
    

}