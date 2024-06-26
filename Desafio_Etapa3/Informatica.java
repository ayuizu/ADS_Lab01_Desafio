/**
 * Informatica herda Loja
 */
public class Informatica extends Loja
{
    private double seguroEletronicos;

    //Métodos Construtores
    public Informatica()
    {
    }
    public Informatica(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos=seguroEletronicos;
    }
    
    //Métodos de Acesso
    public double getSeguroEletronicos(){
        return this.seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos=seguroEletronicos;
    }
    
    //Método toString() sobrescrito
    public String toString(){
        return super.toString()+ "\nSeguro para eletrônicos: R$ " + this.seguroEletronicos;
    }
    
    //Testando classe Cosmetico
    /*
    public static void main(String[] args){
        Informatica info1 = new Informatica("Severo Roth", 3, 1800.90, new Endereco("Av. Alberto Bins","Porto Alegre", "RS","Brasil","90010-000","3890","Loja 1"), new Data(9,8,2003), 150000.00);
        System.out.println(info1.toString());
    }
    */
}
