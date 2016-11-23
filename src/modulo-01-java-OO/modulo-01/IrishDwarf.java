
public class IrishDwarf extends Dwarves{
      
    public IrishDwarf(){
        //dataNascimento = new DataTerceiraEra(1,1,1);
        // status = Status.VIVO;
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    public IrishDwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome,dataNascimento);
    }
    
    public void tentarSorte() { 
        boolean temSorte = getNumeroSorte() == -3333; 
        
        if (temSorte) { 
            // aumenta 1000 unidades para todos itens do inventario 
            //inventario.aumentarUnidadesDosItensIrishDwarv(1000);
            inventario.aumentarUnidadesProporcionalQuantidadePorItem();
        } 
    }
        
}
