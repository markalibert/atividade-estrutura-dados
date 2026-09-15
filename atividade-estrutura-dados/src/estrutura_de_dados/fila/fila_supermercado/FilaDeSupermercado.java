package estrutura_de_dados.fila.fila_supermercado;

import estrutura_de_dados.fila.Fila;

import java.util.Scanner;

public class FilaDeSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fila fila = new Fila<>(5);

        //enfileirar 5 clientes;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome do Cliente: ");
            String nome = sc.nextLine();
            fila.enfileirar(new Cliente(nome));
        }

        while (!fila.estaVazia()){
            System.out.println("Cliente da vez: " + fila.desenfileirar());
            System.out.println("Quantidade de Clientes na fila: " + fila.tamanho());
        }
    }
}
