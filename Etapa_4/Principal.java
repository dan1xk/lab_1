import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Criar Loja ---");
                    scanner.nextLine(); 

                    System.out.print("Nome da loja: ");
                    String nomeLoja = scanner.nextLine();

                    System.out.print("Quantidade de funcionários: ");
                    int qtdFuncionarios = scanner.nextInt();

                    System.out.print("Salário base dos funcionários (-1 para não definido): ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Insira os dados do endereço:");
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();

                    System.out.print("Número: ");
                    String numero = scanner.nextLine();

                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();

                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();

                    System.out.print("País: ");
                    String pais = scanner.nextLine();

                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();

                    System.out.print("Complemento: ");
                    String complemento = scanner.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    System.out.println("Insira a data de fundação (dia, mês, ano):");
                    System.out.print("Dia: ");
                    int dia = scanner.nextInt();

                    System.out.print("Mês: ");
                    int mes = scanner.nextInt();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();

                    System.out.print("Quantidade máxima de produtos no estoque: ");
                    int maxProdutos = scanner.nextInt();

                    Data dataFundacao = new Data(dia, mes, ano);

                    loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, endereco, dataFundacao, maxProdutos);
                    break;

                case 2:
                    System.out.println("\n--- Criar Produto ---");
                    scanner.nextLine();

                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();

                    System.out.println("Insira a data de validade (dia, mês, ano):");
                    System.out.print("Dia: ");
                    int diaVal = scanner.nextInt();

                    System.out.print("Mês: ");
                    int mesVal = scanner.nextInt();

                    System.out.print("Ano: ");
                    int anoVal = scanner.nextInt();

                    Data dataValidade = new Data(diaVal, mesVal, anoVal);

                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }

            if (loja != null && produto != null) {
                Data referencia = new Data(20, 10, 2023);
                System.out.println("\n--- Resultados ---");
                System.out.println(produto.estaVencido(referencia) ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
                System.out.println(loja);
            }
        }
    }
}
