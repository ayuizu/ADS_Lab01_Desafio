
/**
 * Alimentação herda Loja e se associa com Data
 */
public class Alimentacao extends Loja
{
    private Data dataAlvara;

    //Métodos Construtores
    public Alimentacao()
    {
    }
    public Alimentacao(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara,int estoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,estoqueProdutos);
        this.dataAlvara=dataAlvara;
    }
    
    //Métodos de Acesso
    public Data getDataAlvara(){
        return this.dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara=dataAlvara;
    }
    
    //Método toString() sobrescrito
    public String toString(){
        return super.toString()+ "\nData do alvará: " + this.dataAlvara.toString();
    }
    
    //Testando classe Cosmetico
    /*
    public static void main(String[] args){
        Alimentacao ali1 = new Alimentacao("Formosa", 6, 2100.90, new Endereco("Av. Osvaldo Aranha","Porto Alegre", "RS","Brasil","90010-250","472",""), new Data(9,5,2011), new Data(1,6,2024));
        System.out.println(ali1.toString());
    }
    */
}

