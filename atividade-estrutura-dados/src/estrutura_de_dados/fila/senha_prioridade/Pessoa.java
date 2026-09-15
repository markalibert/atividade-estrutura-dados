package estrutura_de_dados.fila.senha_prioridade;

public class Pessoa implements Comparable<Pessoa>{
    //nome
    //tipo de senha (normal ou prioritária)

    private String nome;
    private int prioridade;

    public Pessoa(String nome, int prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int getPrioridade(){
        return this.prioridade;
    }

    @Override
    public String toString() {
        String prioridadeString = "NORMAL";
        if(this.prioridade > 0){
            prioridadeString = "PRIORITÁRIO";
        }
        return "Paciente: " + this.nome + " - Prioridade: " + prioridadeString;
    }

    @Override
    public int compareTo(Pessoa o) {
        if(this.prioridade < o.getPrioridade()){
            return 1;
        }else if(this.prioridade > o.getPrioridade()){
            return -1;
        }
        return 0;
    }
}
