//Classe DataNovo - testando construtor com getters
public class DataNovo
{
    private int dia;
    private int mes;
    private int ano;
    
    public DataNovo(int dia, int mes, int ano){
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
        if (this.dia==-1  || this.mes==-1){
            System.out.println("Erro. Data definida como 1/1/2000");
            this.ano=2020;
            this.mes=1;
            this.dia=1;
        }
    }
    public int getDia(){
	return this.dia;
    } 
    public void setDia(int dia){
        switch(this.mes){
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
                //if((ano%4==0 && ano%100!=0)||(ano%400==0)){
                //São bissextos todos os anos múltiplos de 400
                //Outros multiplos de 100 não são bissextos
                //São bissextos todos os outros múltiplos de 4
                if(this.verificaAnoBissexto()){
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
    }
    public int getMes(){
        return this.mes;
    } 
    public void setMes(int mes){
        //Mês tem que ser entre 1 e 12
        if(mes>=1 && mes<=12){
            this.mes=mes;
        } else {
            this.mes=-1;
        }
    }
    public int getAno(){
	return this.ano;
    } 
    public void setAno(int ano){
        if(this.mes==-1 || this.dia==-1){
            this.ano=2000;
        }else{
            this.ano=ano;
        }
    }
    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
    public Boolean verificaAnoBissexto(){
      if((this.ano%4==0 && this.ano%100!=0)||this.ano%400==0){
          //São bissextos todos os anos múltiplos de 400 *ou* todos os outros múltiplos de 4 *EXCETO* outros multiplos de 100
          return true;
      }else{
          return false;
      } 
    }
    public static void main(String[] args){
        DataNovo data1= new DataNovo(29,2,2025);
        System.out.println("É bissexto? " + data1.verificaAnoBissexto());
        System.out.println(data1.toString());
    }
}
