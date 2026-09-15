package estrutura_de_dados.fila.senha_prioridade;

import estrutura_de_dados.fila.FilaComPrioridade;

import java.util.Scanner;

public class SenhaPrioridade{
    public static void main(String[] args) {
        //fila prioritario
        //fila normal
        // se não houver prioritarias, atender a fila normal;
        //se não houver normais, atender a prioritaria;
        //mostrar a ordem de atendimento.

        Scanner sc = new Scanner(System.in);

        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>(5);

        //atender 3 pessoas prioritarias para 1 pessoa normal;
        fila.enfileirar(new Pessoa("Joaquim", 0));
        fila.enfileirar(new Pessoa("Lurdes", 1));
        fila.enfileirar(new Pessoa("Manuel", 1));
        fila.enfileirar(new Pessoa("Pedro", 0));

        while (!fila.estaVazia()) {
            System.out.println("Fila de espera: " + fila);
            System.out.println("Senha chamada: " + fila.desenfileirar());
        }
    }
}
