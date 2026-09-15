package estrutura_de_dados.fila.controle_processo;

import estrutura_de_dados.fila.Fila;

public class ControleProcesso {
    public static void main(String[] args) {
        Fila<Processo> fila = new Fila(10);

        //adicionar processos à fila;
        fila.enfileirar(new Processo(10));
        fila.enfileirar(new Processo(3));
        fila.enfileirar(new Processo(9));
        fila.enfileirar(new Processo(23));
        fila.enfileirar(new Processo(12));

        //executar em ordem de chegada;
        for(int i = 0; i < 5; i++) {
            //remover cada processo ao terminar;
            //mostrar qual processo está em execução.
            System.out.println(fila.desenfileirar());
        }
    }
}
