public class DataTerceiraEra{
    
    private int dia;
    private int mes;
    private int ano;
    
    public DataTerceiraEra(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia(){ return dia;}
    
    public int getMes(){ return mes;}
    
    public int getAno(){ return ano;}
    
    public void setDia( int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public boolean ehBissexto(){
        
        if (( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 )){
            return true;
        }
        else{
            return false;
        }
        
  
    }
    
    
}