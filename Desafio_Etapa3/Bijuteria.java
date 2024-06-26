
/**
 * Bijuteria herda Loja
 */
public class Bijuteria extends Loja
{
    private double metaVendas;

    //Métodos Construtores
    public Bijuteria()
    {
    }
    public Bijuteria(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas=metaVendas;
    }
    
    //Métodos de Acesso
    public double getMetaVendas(){
        return this.metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas=metaVendas;
    }
    
    //Método toString() sobrescrito
    public String toString(){
        return super.toString()+ "\nMeta de vendas: R$ " + this.metaVendas;
    }
    
    //Testando classe Cosmetico
    /*
    public static void main(String[] args){
        Bijuteria biju1 = new Bijuteria("Lily Bijus", 3, 1600.90, new Endereco("Av. Independência","Porto Alegre", "RS","Brasil","90010-250","880","Loja 4"), new Data(9,5,2011), 18000.00);
        System.out.println(biju1.toString());
    }
    */
}
