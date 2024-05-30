
//Classe Produto
public class Produto
{
    //Atributos
    private String nome;
    private double preco;
    //Métodos construtores
    ////Vazio
    public Produto(){
        
    }
    ////Todos - Etapa1
    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }

   //Métodos setter e getter
    public void setNome(String nome){
      this.nome=nome;
    }
    public String getNome(){
      return this.nome;
    }
    public void setPreco(double preco){
      this.preco=preco;
    }
    public double getPreco(){
      return this.preco;
    }

    //Método toString()
    public String toString(){
        return "Nome do produto: " + this.nome + "\nPreço do produto: R$" + this.preco;
    }
   
}
