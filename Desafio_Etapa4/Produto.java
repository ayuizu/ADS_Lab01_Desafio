/**
 * Classe Produto - associa com Data
 */
public class Produto
{
    //Atributos
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //Métodos construtores
    public Produto(){
        
    }
    ////Etapa1
    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }
    ////Etapa2
    public Produto(String nome,double preco, Data dataValidade){
        this.nome=nome;
        this.preco=preco;
        this.dataValidade=dataValidade;
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
    public void setDataValidade(Data dataValidade){
        this.dataValidade=dataValidade;
    }
    public Data getDataValidade(){
        return this.dataValidade;
    }
    
    //Método toString()
    public String toString(){
        return "Nome do produto: " + this.nome + "\nPreço do produto: R$" + this.preco + "\nData de validade: " + this.dataValidade.toString();
    }
    
    //Método estaVencido()
    public boolean estaVencido(Data data){
        if((data.getAno()*365+data.getMes()*30+data.getDia())>(this.dataValidade.getAno()*365+this.dataValidade.getMes()*30+this.dataValidade.getDia())){
            return true;
        }else{
            return false;
        }
    }
    
    //Testando toString e estaVencido
    /*
    public static void main(String[] args){
        Data data = new Data(8,6,2023);
        Produto produto = new Produto("Caneta",1.90,data);
        System.out.println(produto.toString());
        System.out.println("Está vencido? " + produto.estaVencido(new Data(20,10,2023)));
    }
    */
}
