package estrutura_de_dados.fila.agendamento_tarefa;

import estrutura_de_dados.fila.FilaComPrioridade;

public class AgendamentoTarefas {
    public static void main(String[] args) {
        FilaComPrioridade<Tarefa> filaComPrioridade = new FilaComPrioridade<>(10);

        //enfileirar várias tarefas;
        filaComPrioridade.enfileirar(new Tarefa("Matemática", 1));
        filaComPrioridade.enfileirar(new Tarefa("Português", 2));
        filaComPrioridade.enfileirar(new Tarefa("História", 1));
        filaComPrioridade.enfileirar(new Tarefa("Programação", 3));
        filaComPrioridade.enfileirar(new Tarefa("Banco de Dados", 2));
        filaComPrioridade.enfileirar(new Tarefa("Inglês", 1));
        filaComPrioridade.enfileirar(new Tarefa("Estrutura de Dados", 3));

        //manter a fila ordenada pela prioridade;
        //executar sempre a tarefa mais prioritária;
        //mostrar a fila antes e depois de cada execução.

        for (int i = 0; i < 7; i++){
            System.out.println("Lista de chamada: " + filaComPrioridade);
            System.out.println("Tarefa chamada: " + filaComPrioridade.desenfileirar() +"\n");
        }
    }
}
