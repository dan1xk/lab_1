public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Meta de Vendas: " + metaVendas;
    }
}
