
/**
 * Lohas de E0 a E19
 */
public class Loja
{
    //Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    
    //Métodos construtores
    ////Vazio
    public Loja(){
        
    }
    ////Todos - Etapa1
    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=salarioBaseFuncionario;
    }
    ////Só nome e qtd funcionarios - Etapa1
    public Loja(String nome,int quantidadeFuncionarios){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=-1;   
    }
    ////Todos - Etapa2
    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=salarioBaseFuncionario;
        this.endereco=endereco;
        this.dataFundacao= dataFundacao;
    }
    ////Só nome, qtd funcionarios, end e data - Etapa2
    public Loja(String nome,int quantidadeFuncionarios,Endereco endereco, Data dataFundacao){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=-1;   
        this.endereco=endereco;
        this.dataFundacao= dataFundacao;
    }
    //Métodos de acesso (getters e setters)
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios=quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return this.salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario=salarioBaseFuncionario;
    }
    //Método de acesso - Endereco e dataFundacao
    public Endereco getEndereco(){
        return this.endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }
    public Data getDataFundacao(){
        return this.dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao=dataFundacao;
    }
    //Método toString()

    public String toString(){
        return "\nNome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionários: R$ " + this.salarioBaseFuncionario + "\nEndereço: " + this.endereco.toString() + "\nData de fundação: " + this.dataFundacao.toString();
    }
    //Método gastos com salário
    public double gastosComSalario(){
        if (this.salarioBaseFuncionario!=-1)
            return quantidadeFuncionarios*salarioBaseFuncionario;
        else
            return -1;
    }
    //Metodo tamanho da loja
    public char tamanhoDaLoja(){
        if (this.quantidadeFuncionarios>=0 && quantidadeFuncionarios<10)
            return 'P';
        else if (this.quantidadeFuncionarios>=10 && quantidadeFuncionarios<=30)
            return 'M';
        else if (this.quantidadeFuncionarios>=31)
            return 'G';
        else
            return ' ';
    }
    //Teste toString
    /**
    public static void main(String[] args){
        Endereco endereco = new Endereco("Rua dos Andradas","Porto Alegre","RS","Brasil","90000-100","1234","Andar Térreo");
        Data data = new Data(16,5,2018);
        Loja loja = new Loja("Paquetá",9,2189.90, endereco,data);
        System.out.println(loja.toString());
    }*/
}
