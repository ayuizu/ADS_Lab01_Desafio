/** 
 * Cosmético herda Loja  
*/
public class Cosmetico extends Loja
{
    private double taxaComercializacao;

    //Métodos Construtores
    public Cosmetico()
    {
    }
    public Cosmetico(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int estoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,estoqueProdutos);
        this.taxaComercializacao=taxaComercializacao;
    }
    
    //Métodos de Acesso
    public double getTaxaComercializacao(){
        return this.taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao=taxaComercializacao;
    }
    
    //Método toString() sobrescrito
    public String toString(){
        return super.toString()+ "\nTaxa de comercialização: " + this.taxaComercializacao;
    }
    
    //Testando classe Cosmetico
    /*
    public static void main(String[] args){
        Cosmetico com1 = new Cosmetico("Bela Maria", 6, 1500.90, new Endereco("Av. Assis Brasil","Porto Alegre", "RS","Brasil","90010-180","1800","Loja 20"), new Data(1,9,2010), 0.16);
        System.out.println(com1.toString());
    }
    */
}
