
/**
 * Lohas de E0 a E19
 */
public class Loja
{
    //Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
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
    //Método toString()
    public String toString(){
        return "\nNome da loja: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionários: R$" + this.salarioBaseFuncionario;
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

}
