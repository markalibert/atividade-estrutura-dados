package estrutura_de_dados.fila.fila_supermercado;

public class Cliente {
    //nome
    //quantidade de produtos
    private String nome;
    private int quantProduto;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome;
    }
}
