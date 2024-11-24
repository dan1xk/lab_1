import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeMaxima) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeMaxima];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping [Nome: " + nome +
               ", Endereço: " + endereco +
               ", Lojas: " + Arrays.toString(lojas) + "]";
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true; 
            }
        }
        return false; 
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null; 
                return true; 
            }
        }
        return false; 
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipoLoja) {
                    case "Cosmético":
                        if (loja instanceof Cosmetico) contador++;
                        break;
                    case "Vestuário":
                        if (loja instanceof Vestuario) contador++;
                        break;
                    case "Bijuteria":
                        if (loja instanceof Bijuteria) contador++;
                        break;
                    case "Alimentação":
                        if (loja instanceof Alimentacao) contador++;
                        break;
                    case "Informática":
                        if (loja instanceof Informatica) contador++;
                        break;
                    default:
                        return -1; 
                }
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = -1;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }
}
