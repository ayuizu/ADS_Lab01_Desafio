/**
 * Classe Principal - Menu
 */
public class Principal

{
    private Loja loja;
    private Produto produto;
    
    public static void main(String[] args){
        int opcaoMenu;        
        do{
            System.out.println("\n---Menu principal---");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
    
            do{
                opcaoMenu=Teclado.leInt("Digite a sua opção: ");
                if(opcaoMenu!=1 && opcaoMenu!=2 && opcaoMenu!=3)
                    System.out.println("Opção inválida. Tente novamente.");
                }while(opcaoMenu!=1 && opcaoMenu!=2 && opcaoMenu!=3);
            
            if(opcaoMenu==1){
                int numCategoria;
                do{
                    System.out.println("---Criar uma loja---");
                    System.out.println("Categorias disponíveis:"); 
                    System.out.println("(1) Cosmético \n(2) Vestuário\n(3) Bijuteria\n(4) Alimentação\n(5) Informática");
                    numCategoria=Teclado.leInt("Digite a sua opção: ");
                    if(numCategoria!=1 && numCategoria!=2 && numCategoria!=3 && numCategoria!=4 &&numCategoria!=5)
                        System.out.println("Opção inválida. Digite novamente.");
                }while(numCategoria!=1 && numCategoria!=2 && numCategoria!=3 && numCategoria!=4 &&numCategoria!=5);
                
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
                
                System.out.println("--Estoque--");
                int qtdProd = Teclado.leInt("Quantidade máxima de produtos no estoque: ");
                
                switch(numCategoria){
                    case 1:
                        //Cosmético
                        Double taxaComercializacao = Teclado.leDouble("Taxa de comercialização: ");
                        Cosmetico cosm = new Cosmetico(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao, taxaComercializacao, qtdProd);
                        System.out.println("\n--Loja de Cosméticos cadastrada com sucesso--");
                        System.out.println(cosm.toString());
                        break;
                    case 2:
                        //Vestuário
                        boolean prodImportados;
                        char importado = Teclado.leChar("A loja vende produtos importados [S ou N]? ");
                        if(importado=='s' || importado=='S'){
                            prodImportados=true;
                        }
                        else{
                            prodImportados=false;
                        }
                        Vestuario vest = new Vestuario(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao, prodImportados, qtdProd);
                        System.out.println("\n--Loja de Vestuário cadastrada com sucesso--");
                        System.out.println(vest.toString());
                        break;
                    case 3:
                        //Bijuteria
                        Double metaVendas = Teclado.leDouble("Meta de vendas: ");
                        Bijuteria biju = new Bijuteria(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao, metaVendas, qtdProd);
                        System.out.println("\n--Loja de Bijuterias cadastrada com sucesso--");
                        System.out.println(biju.toString());
                        break;
                    case 4:
                        //Bijuteria
                        System.out.println("--Data do alvará--");
                        int diaAlv = Teclado.leInt("Dia: ");
                        int mesAlv = Teclado.leInt("Mês: ");
                        int anoAlv = Teclado.leInt("Ano: ");
                        Data dataAlvara = new Data(diaAlv, mesAlv, anoAlv);
                        Alimentacao alim = new Alimentacao(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao, dataAlvara, qtdProd);
                        System.out.println("\n--Loja de Alimentação cadastrada com sucesso--");
                        System.out.println(alim.toString());
                        break;
                    case 5:
                        //Informatica
                        Double valorSeguro = Teclado.leDouble("Valor do seguro para eletrônicos: ");
                        Informatica infor = new Informatica(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao, valorSeguro, qtdProd);
                        System.out.println("\n--Loja de Informática cadastrada com sucesso--");
                        System.out.println(infor.toString());
                        break;
                    default:
                        break;
                }
            }else if(opcaoMenu==2){
                System.out.println("Criar um produto");  
                System.out.println("--Dados do produto--");
                Produto produto = new Produto(Teclado.leString("Nome: "),Teclado.leDouble("Preço: "), new Data(Teclado.leInt("Dia vencimento: "),Teclado.leInt("Mês vencimento: "), Teclado.leInt("Ano vencimento: ")));
                System.out.println("\n--Produto cadastrado com sucesso--");
                System.out.println(produto.toString());
                if(produto.estaVencido(new Data(20,10,2023))){
                    System.out.println("O produto está vencido em 20/10/2023");
                }else{
                    System.out.println("O produto não está vencido em 20/10/2023");
                }
                
            }else if(opcaoMenu==3){
                System.out.println("Sair");  
            }else{
                System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcaoMenu!=3);
    }
}