package estrutura_de_dados.fila.pronto_socorro;

public class Paciente implements Comparable<Paciente>{
    //nome
    //prioridade
    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String prioridadeString = "Baixa";
        if(this.prioridade == 2){
            prioridadeString = "Média";
        }else if(this.prioridade == 3){
            prioridadeString = "Urgente";
        }
        return "Paciente: " + this.nome + ", prioridade: " + prioridadeString + "\n";
    }

    @Override
    public int compareTo(Paciente o) {
        if(this.prioridade < o.getPrioridade()){
            return 1;
        }else if(this.prioridade > o.getPrioridade()){
            return -1;
        }
        return 0;
    }
}
