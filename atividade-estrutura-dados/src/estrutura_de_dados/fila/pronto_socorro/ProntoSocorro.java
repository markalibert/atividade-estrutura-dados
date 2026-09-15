package estrutura_de_dados.fila.pronto_socorro;

import estrutura_de_dados.fila.FilaComPrioridade;

public class ProntoSocorro {
    public static void main(String[] args) {
        //enfileirar 6 pacientes;
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>(6);

        fila.enfileirar(new Paciente("Pedro", 3));
        fila.enfileirar(new Paciente("Joaquim", 1));
        fila.enfileirar(new Paciente("Marcos", 2));
        fila.enfileirar(new Paciente("Felipe", 3));
        fila.enfileirar(new Paciente("Julio", 1));
        fila.enfileirar(new Paciente("Augusto", 1));

        //mostrar a fila organizada;
        System.out.println(fila);

        //atender os pacientes em ordem de prioridade;
        //mostrar quem foi atendido a cada remoção.
        while (!fila.estaVazia()) {
            System.out.println("Paciente atendido: " + fila.desenfileirar().getNome());
        }
    }
}
