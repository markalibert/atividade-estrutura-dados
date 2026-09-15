package estrutura_de_dados.fila.impressao_urgencia;

import estrutura_de_dados.fila.FilaComPrioridade;

public class UrgenciaDeImpressao {
    public static void main(String[] args) {
        FilaComPrioridade<Documento> fila = new FilaComPrioridade<>(5);

        fila.enfileirar(new Documento("Carta", 1));
        fila.enfileirar(new Documento("Jornal", 3));
        fila.enfileirar(new Documento("Xerox", 2));
        fila.enfileirar(new Documento("Impressao", 1));
        fila.enfileirar(new Documento("Pintura", 3));

        //documentos mais urgentes devem ser impressos primeiro;
        //se dois documentos tiverem a mesma prioridade, manter a ordem de chegada.

        while (!fila.estaVazia()) {
            System.out.println(fila.desenfileirar());
        }
    }
}
