/**
 * Classe Data
 */
public class Data
{
    private int dia;
    private int mes;
    private int ano;
    
    //Métodos construtores
    public Data(){
        
    }
    ////Etapa1
    public Data(int dia, int mes, int ano){
        //Mês tem que ser entre 1 e 12
        if(mes>=1 && mes<=12){
            this.mes=mes;
        } else {
            this.mes=-1;
        }
        //Dia varia entre 1-31, 1-30, 1-28 ou 1-29
        switch(mes){
            case 1,3,5,7,8,10,12:
                if(dia>=1 && dia<=31){
                    this.dia=dia;
                }else{
                    this.dia=-1;
                }
            case 4,6,9,11:
                if(dia>=1 && dia<=30){
                    this.dia=dia;
                }else{
                    this.dia=-1;
                }
            case 2:
                if((ano%4==00 && ano%100!=0)||ano%400==0){
                      //São bissextos todos os anos múltiplos de 400
                      //Outros multiplos de 100 não são bissextos
                      //São bissextos todos os outros múltiplos de 4
                 //if(verificaAnoBissexto()){
                      if(dia>=1 && dia<=29){
                          this.dia=dia;
                      }else{
                          this.dia=-1;
                      }
                }else{
                      if(dia>=1 && dia<=28){
                          this.dia=dia;
                      }else{
                          this.dia=-1;
                      }
                }
        }
        if(this.mes==-1 || this.dia==-1){
            this.dia=1;
            this.mes=1;
            this.ano=2000;
        }else{
            this.ano=ano;
        }
    }
    
    //Métodos de acesso
    public int getDia(){
        return this.dia;
    } 
    public void setDia(int dia){
    this.dia=dia;
    }
    public int getMes(){
        return this.mes;
    } 
    public void setMes(int mes){
        this.mes=mes;
    }
    public int getAno(){
        return this.ano;
    } 
    public void setAno(int ano){
        this.ano=ano;
    }
    
    //Método toString
    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
    
    //Método verificaAnoBissexto
    public Boolean verificaAnoBissexto(){
      if((this.ano%4==00 && this.ano%100!=0)||this.ano%400==0){
          //São bissextos todos os anos múltiplos de 400 *ou* todos os outros múltiplos de 4 *EXCETO* outros multiplos de 100
          return true;
      }else{
          return false;
      } 
    }
    
    //Testando verificaAnoBissexto
    /*
    public static void main(String[] args){
        Data data1= new Data(29,2,2029);
        System.out.println("É bissexto? " + data1.verificaAnoBissexto());
        System.out.println(data1.toString());
    }
    */
}
