package estrutura_de_dados.fila.chamada_telefonica;

import estrutura_de_dados.fila.Fila;

public class ChamadaTelefonica {
    public static void main(String[] args) {
        Fila<Chamada> chamadaFila = new Fila<>(10);

        //enfileirar as chamadas recebidas;
        chamadaFila.enfileirar(new Chamada("Carlos", "Emergencia"));
        chamadaFila.enfileirar(new Chamada("Ana", "Particular"));
        chamadaFila.enfileirar(new Chamada("Felipe", "Particular"));
        chamadaFila.enfileirar(new Chamada("Joana", "Servidor Publico"));
        chamadaFila.enfileirar(new Chamada("Suzy", "Particular"));

        //atender uma por vez;
        //mostrar a chamada atual;

        for (int i = 0; i < 5; i++) {
            System.out.println(chamadaFila.desenfileirar());

            //mostrar quantas ainda estão aguardando.
            System.out.println("Chamadas no aguardo: " + chamadaFila + "\n");
        }
    }
}
