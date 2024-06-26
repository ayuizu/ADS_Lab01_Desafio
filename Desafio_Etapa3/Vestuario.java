
/**
 * Vestuário herda Loja
 */
public class Vestuario extends Loja
{
    private boolean produtosImportados;

    //Métodos Construtores
    public Vestuario()
    {
    }
    public Vestuario(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados=produtosImportados;
    }
    
    //Métodos de Acesso
    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados=produtosImportados;
    }
    
    //Método toString() sobrescrito
    public String toString(){
        return super.toString()+ "\nVende produtos importados: " + this.produtosImportados;
    }
    
    //Testando classe Cosmetico
    /*
    public static void main(String[] args){
        Vestuario vest1 = new Vestuario("Fashion Empire", 10, 1300.90, new Endereco("Av. Sertório","Porto Alegre", "RS","Brasil","90030-100","1900","Loja 1"), new Data(9,12,2018), true);
        System.out.println(vest1.toString());
    }
    */
}
