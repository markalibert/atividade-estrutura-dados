package estrutura_de_dados.fila.atendimento_banco;

import estrutura_de_dados.fila.Fila;

import java.util.Scanner;

public class AtendimentoDoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fila fila = new Fila(6);

        //enfileirar 6 clientes;
        for(int i = 0; i < 6; i++) {
            System.out.print("Digite o nome do cliente: ");
            String nome = sc.nextLine();

            fila.enfileirar(new Cliente(nome));
        }

        //atender os clientes em ordem de chegada;
        while (!fila.estaVazia()) {
            System.out.println("Cliente da vez: " + fila.desenfileirar());
        }
        System.out.println("Fila vazia!");
    }
}
