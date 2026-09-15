package estrutura_de_dados.fila.fila_de_impressao;

public class Documento {
    //nome do documento
    //número de páginas

    String nome;
    int numPaginas;

    public Documento(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Paginas: " + this.numPaginas;
    }
}
