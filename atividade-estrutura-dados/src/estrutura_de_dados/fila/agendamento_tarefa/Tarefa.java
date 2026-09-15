package estrutura_de_dados.fila.agendamento_tarefa;

public class Tarefa implements Comparable<Tarefa>{
    //nome
    //prioridade
    private String nome;
    private int prioridade;

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Prioridade: " + this.prioridade;
    }

    @Override
    public int compareTo(Tarefa o) {
        if (this.prioridade > o.prioridade) {
            return -1;
        }else if (this.prioridade < o.prioridade){
            return 1;
        }
        return 0;
    }
}
