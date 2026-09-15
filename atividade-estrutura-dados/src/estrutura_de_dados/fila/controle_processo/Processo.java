package estrutura_de_dados.fila.controle_processo;

public class Processo {
    //identificador
    //tempo estimado de execução
    private int id;
    private int tempoProcesso;

    private static int idSomador = 1;

    public Processo(int tempoProcesso) {
        this.tempoProcesso = tempoProcesso;
        this.id = idSomador++;
    }

    @Override
    public String toString() {
        return "Processo{" + "id=" + id + ", tempo de processo=" + tempoProcesso + '}';
    }

    public int getTempoProcesso() {
        return tempoProcesso;
    }
}
