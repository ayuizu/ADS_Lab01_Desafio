
/**
 */
public class Shopping
{
    // Atributos
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    //Método construtor
    public Shopping(String nome, Endereco endereco, int quantidadeLojas)
    {
        this.nome=nome;
        this.endereco=endereco;
        this.lojas = new Loja[quantidadeLojas];
    }
    
    //Métodos de acesso
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja[] getLojas() {
        return this.lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    
    //Método toString()
    public String toString(){
        String nomeLojas = "";
        if(lojas.length>0){
            for(int i = 0; i<lojas.length; i++){
                if(this.lojas[i]!=null)
                    nomeLojas += "\n" + lojas[i].getNome();
            }
        }
        return "Shopping\nNome: " + this.nome + "\nEndereço: " + endereco.toString() + "\nLojas: " + nomeLojas;
    }
    
    //Método para inserir loja 
        public boolean insereLoja(Loja loja){
        boolean inserido = false;
        for(int i = 0; i<this.lojas.length; i++){
            if(this.lojas[i]==null){
                lojas[i]=loja;
                inserido=true;
                break;
            }
        }
        return inserido;
    }
    //Método para remover loja
    public boolean removeLoja(String nome){
        boolean removido = false;
        if(lojas.length>0){
            for(int i = 0; i<this.lojas.length; i++){
                if(this.lojas[i]!=null){
                    if(this.lojas[i].getNome()==nome){
                        lojas[i]=null;
                        removido=true;
                        break;
                    }
                }
            }
        }
        return removido;
    }
    
    //Método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipo){
        int contador = 0;
        switch(tipo){
            case "Cosmético":
                for(int i = 0; i<this.lojas.length; i++){
                    if(lojas[i]!=null && lojas[i] instanceof Cosmetico){
                        contador++;
                    }
                };
                break;
            case "Vestuario":
                for(int i = 0; i<this.lojas.length; i++){
                    if(lojas[i]!=null && lojas[i] instanceof Vestuario){
                        contador++;
                    }
                };
                break;
            case "Bijuteria":
                for(int i = 0; i<this.lojas.length; i++){
                    if(lojas[i]!=null && lojas[i] instanceof Bijuteria){
                        contador++;
                    }
                };
                break;
            case "Alimentação":
                for(int i = 0; i<this.lojas.length; i++){
                    if(lojas[i]!=null && lojas[i] instanceof Alimentacao){
                        contador++;
                    }
                };
                break;
            case "Informática":
                for(int i = 0; i<this.lojas.length; i++){
                    if(lojas[i]!=null && lojas[i] instanceof Informatica){
                        contador++;
                    }
                };
                break;
            default:
                System.out.println("Opção inválida");
        }
        if(contador>0)
            return contador;
        else
            return -1;
    }
    
    //Método lojaSeguroMaisCaro
    public Informatica lojaSeguroMaisCaro(){
        double maiorSeguro=0;
        int posicaoMaiorSeguro=0;
        if(lojas.length>0){
            for(int i = 0; i<this.lojas.length; i++){
                if(lojas[i]!=null && lojas[i] instanceof Informatica){
                    if(((Informatica)lojas[i]).getSeguroEletronicos() > maiorSeguro){
                        maiorSeguro=((Informatica)lojas[i]).getSeguroEletronicos();
                        posicaoMaiorSeguro=i;
                    }
                }
            }
        }
        if(maiorSeguro>0)
            return (Informatica)lojas[posicaoMaiorSeguro];
        else
            return null;
    }
    //Testando métodos do Shopping
    /*
    public static void main(String[] args){
        Endereco e1 = new Endereco("Rua dos Andradas","Porto Alegre", "RS","Brasil","91180-359","118","Andar 6");
        Data d1 = new Data(1,1,2023);
        Cosmetico lojaCosmetico1 = new Cosmetico("Loja Cosmético 1", 10, 2100, e1, d1, 20, 10);
        Cosmetico lojaCosmetico2 = new Cosmetico("Loja Cosmético 2", 10, 2100, e1, d1, 20, 10);
        Cosmetico lojaCosmetico3 = new Cosmetico("Loja Cosmético 3", 10, 2100, e1, d1, 20, 10);
        Vestuario lojaVestuario = new Vestuario("Loja Vestuário", 10, 2100, e1, d1, false, 10);
        Bijuteria lojaBijuteria = new Bijuteria("Loja Bijuteria", 10, 2100, e1, d1, 5000, 10);
        Alimentacao lojaAlimentacao = new Alimentacao("Loja Alimentação", 10, 2100, e1, d1, d1, 10);
        Informatica lojaInformatica1 = new Informatica("Loja Informática 1", 10, 2100, e1, d1, 3000, 10);
        Informatica lojaInformatica2 = new Informatica("Loja Informática 2", 10, 2100, e1, d1, 4000, 10);
        Informatica lojaInformatica3 = new Informatica("Loja Informática 3", 10, 2100, e1, d1, 5000, 10);
        Shopping s1 = new Shopping("Iguatemi",e1,20);
        s1.insereLoja(lojaCosmetico1);
        s1.insereLoja(lojaCosmetico2);
        s1.insereLoja(lojaCosmetico3);
        s1.insereLoja(lojaVestuario);
        s1.insereLoja(lojaBijuteria);
        s1.insereLoja(lojaAlimentacao);
        s1.insereLoja(lojaInformatica1);
        s1.insereLoja(lojaInformatica2);
        s1.insereLoja(lojaInformatica3);
        //Imprimindo dados do array lojas
        Loja[] lojas = s1.getLojas();
        for(int i = 0; i<s1.getLojas().length; i++){
            if(lojas[i]!=null)
                System.out.println(lojas[i].toString());
        }
        //Imprimindo dados do shopping
        System.out.println(s1.toString());
        //Metodo seguroMaisCaro
        System.out.println(s1.lojaSeguroMaisCaro().toString());
        //Metodo qtd por tipo
        System.out.println(s1.quantidadeLojasPorTipo("Cosmetico"));
    }
    */
}
