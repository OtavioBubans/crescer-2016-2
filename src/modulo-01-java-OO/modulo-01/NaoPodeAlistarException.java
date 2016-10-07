
public class NaoPodeAlistarException extends Exception{
    
   public NaoPodeAlistarException(){
        
        super("Não foi possivel alistar Elfo Normal");
        
    }

    public NaoPodeAlistarException(String erro){
        
        super(erro);
        
    }
    
}
