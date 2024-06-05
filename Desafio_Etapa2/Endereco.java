
//Classe Endereço
public class Endereco
{
   private String nomeDaRua;
   private String cidade;
   private String estado;
   private String pais;
   private String cep;
   private String numero;
   private String complemento;
  
    //Métodos construtores
    ////Todos - Etapa1
   public Endereco(String nomeDaRua,String cidade,String estado,String pais,String cep,String numero,String complemento){
       this.nomeDaRua=nomeDaRua;
       this.cidade=cidade;
       this.estado=estado;
       this.pais=pais;
       this.cep=cep;
       this.numero=numero;
       this.complemento=complemento;

   }
   ////Vazio
   public Endereco(){
       
   }
   //Métodos de acesso
   public String getNomeDaRua(){
       return nomeDaRua;
   } 
   public void setNomeDaRua(String nomeDaRua){
       this.nomeDaRua=nomeDaRua;
   }
   public String getCidade(){
       return cidade;
   } 
   public void setCidade(String cidade){
       this.cidade=cidade;
   }
   public String getEstado(){
       return estado;
   } 
   public void setEstado(String estado){
       this.estado=estado;
   }
   public String getPais(){
       return pais;
   } 
   public void setPais(String pais){
       this.pais=pais;
   }
   public String getCep(){
       return cep;
   } 
   public void setCep(String cep){
       this.cep=cep;
   }
   public String getNumero(){
       return numero;
   } 
   public void setNumero(String numero){
       this.numero=numero;
   }
   public String getComplemento(){
       return complemento;
   } 
   public void setComplemento(String complemento){
       this.complemento=complemento;
   }
   
   //Método toString
   public String toString(){
       return this.nomeDaRua + ", " + this.numero +", " + this.complemento + ", " + this.cidade + "/" + this.estado + " - " + this.pais + " - CEP " + this.cep;
   }
   /*public static void main(String[] args){
    *   Endereco end1 = new Endereco("Rua dos Andradas","Porto Alegre", "RS","Brasil","91180-359","118","Andar 6");
    *   System.out.println(end1.toString());
  * }
  * */
}
