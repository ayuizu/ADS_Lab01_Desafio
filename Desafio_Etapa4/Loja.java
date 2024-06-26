/**
 * Classe Loja - associa com Data e Endereco
 */
public class Loja
{
    //Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    //Métodos construtores
    public Loja(){
        
    }
    ////Etapa 1
    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=salarioBaseFuncionario;
    }
    public Loja(String nome,int quantidadeFuncionarios){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=-1;   
    }
    ////Etapa2
    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=salarioBaseFuncionario;
        this.endereco=endereco;
        this.dataFundacao= dataFundacao;
    }
    public Loja(String nome,int quantidadeFuncionarios,Endereco endereco, Data dataFundacao){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=-1;   
        this.endereco=endereco;
        this.dataFundacao= dataFundacao;
    }
    ////Etapa4
    public Loja(String nome,int quantidadeFuncionarios,Endereco endereco, Data dataFundacao,int quantidadeEstoque){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=-1;   
        this.endereco=endereco;
        this.dataFundacao= dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeEstoque];
    }
    public Loja(String nome,int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeEstoque){
        this.nome=nome;
        this.quantidadeFuncionarios=quantidadeFuncionarios;
        this.salarioBaseFuncionario=salarioBaseFuncionario;
        this.endereco=endereco;
        this.dataFundacao= dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeEstoque];
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
    public Produto[] getEstoqueProdutos(){
        return this.estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    //Método toString()
    public String toString(){
        String nomeProdutos = "";
        if(this.estoqueProdutos.length>0){
            nomeProdutos="\nProdutos em estoque:";
            for(int i = 0; i<this.estoqueProdutos.length; i++){
                if(estoqueProdutos[i]!=null)
                    nomeProdutos += "\n- " + estoqueProdutos[i].getNome();
            } 
        }
        int quantidadeEstoque = estoqueProdutos.length;
        return "Nome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionários: R$ " + this.salarioBaseFuncionario + "\nEndereço: " + this.endereco.toString() + "\nData de fundação: " + this.dataFundacao.toString() + "\nQuantidade máxima de estoque: " + quantidadeEstoque + nomeProdutos;
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
    
    //Método para imprimir produtos
    public void imprimeProdutos(){
        for(int i = 0; i<this.estoqueProdutos.length; i++){
            if(this.estoqueProdutos[i]!=null)
                System.out.println(this.estoqueProdutos[i].toString() + "\n");
        }
    }
    
    //Método para inserir produtos
    public boolean insereProduto(Produto produto){
        boolean inserido = false;
        for(int i = 0; i<this.estoqueProdutos.length; i++){
            if(this.estoqueProdutos[i]==null){
                estoqueProdutos[i]=produto;
                inserido=true;
                break;
            }
        }
        return inserido;
    }
    
    //Método para remover produtos
    public boolean removeProduto(String nome){
        boolean removido = false;
        for(int i = 0; i<this.estoqueProdutos.length; i++){
            if(this.estoqueProdutos[i]!=null){
                if(this.estoqueProdutos[i].getNome()==nome){
                    estoqueProdutos[i]=null;
                    removido=true;
                }
            }
        }
        return removido;
    }
    //Teste toString(), inserirProduto(), imprimeProduto() e removerProduto();
    /*
    public static void main(String[] args){
        Endereco endereco = new Endereco("Rua dos Andradas","Porto Alegre","RS","Brasil","90000-100","1234","Andar Térreo");
        Data data = new Data(16,5,2018);
        Loja loja = new Loja("Paquetá",9,2189.90, endereco,data, 10);
        //Produto p1 = new Produto("Caneta",9.90, new Data(13,06,2035));
        Produto[] estoque = new Produto[10];
        loja.setEstoqueProdutos(estoque);
        
        loja.insereProduto(new Produto("Caneta",9.90, new Data(13,06,2035)));
        loja.insereProduto(new Produto("Lapiseira",24.90, new Data(13,06,2045)));
        loja.imprimeProdutos();
        System.out.println(loja.toString());
        loja.removeProduto("Caneta");
        System.out.println(loja.toString());
    }
    
    */
}
