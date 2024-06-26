
/**
Onde fica o método main
 */

public class Principal
{
    private Loja loja;
    private Produto produto;
    
    public static void main(String[] args){
        System.out.println("Menu principal");
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
        int opcaoMenu;
        do{
            opcaoMenu=Teclado.leInt("Digite a sua opção: ");
            if(opcaoMenu==1){
                System.out.println("Criar uma loja");
                
                System.out.println("--Dados da loja--");
                String nome = Teclado.leString("Nome da loja: ");
                int quantidadeFuncionarios=Teclado.leInt("Número de funcionários: ");
                double salarioBaseFuncionario=Teclado.leDouble("Salário base dos funcionários: ");
                System.out.println("--Endereço da Loja--");
                String nomeDaRua = Teclado.leString("Rua: ");
                String numero = Teclado.leString("Número: ");
                String complemento = Teclado.leString("Complemento: ");
                String cidade = Teclado.leString("Cidade: ");
                String estado = Teclado.leString("Estado: ");
                String pais = Teclado.leString("País: ");
                String cep = Teclado.leString("CEP: ");
                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                
                System.out.println("--Data de fundação da loja--");
                Data dataFundacao = new Data(Teclado.leInt("Dia: "),Teclado.leInt("Mês: "),Teclado.leInt("Ano: "));
                
                Loja loja = new Loja(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao);
                
                System.out.println("--Loja cadastrada:--");
                System.out.println(loja.toString());
            }else if(opcaoMenu==2){
                System.out.println("Criar um produto");  
                System.out.println("--Dados do produto--");
                Produto produto = new Produto(Teclado.leString("Nome: "),Teclado.leDouble("Preço: "), new Data(Teclado.leInt("Dia vencimento: "),Teclado.leInt("Mês vencimento: "), Teclado.leInt("Ano vencimento: ")));
                System.out.println("--Produto cadastrado:--");
                System.out.println(produto.toString());
                produto.estaVencido(new Data(20,10,2023));
                
            }else if(opcaoMenu==3){
                System.out.println("Sair");  
            }else{
                System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcaoMenu!=1 && opcaoMenu!=2 && opcaoMenu!=3);
    
    }
}

