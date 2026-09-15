package estrutura_de_dados.fila.impressao_urgencia;

public class Documento implements Comparable<Documento>{
    //nome
    //quantidade de paginas
    //nivel de prioridade

    private String nome;
    private int quantidadePaginas;
    private int prioridade;

    public Documento(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Documento: " + this.nome + " - Prioridade: " + this.prioridade;
    }

    @Override
    public int compareTo(Documento o) {
        if (this.prioridade < o.prioridade) {
            return 1;
        } else if (this.prioridade > o.prioridade) {
            return -1;
        }
        return 0;
    }
}