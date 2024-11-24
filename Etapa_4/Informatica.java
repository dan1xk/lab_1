public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor com todos os atributos
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos,double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Construtor sem o salário base
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Métodos de acesso (getters e setters)
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return super.toString() + ", Seguro de Eletrônicos: R$ " + seguroEletronicos;
    }
}
