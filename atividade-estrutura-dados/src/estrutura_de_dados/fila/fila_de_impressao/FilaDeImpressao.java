package estrutura_de_dados.fila.fila_de_impressao;

import estrutura_de_dados.fila.Fila;

import java.util.Scanner;

public class FilaDeImpressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enfileirar 5 documentos;
        Fila fila = new Fila(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do Documento: ");
            String nome = sc.nextLine();

            System.out.print("Digite o número de páginas do Documento: ");
            int numPag = sc.nextInt();
            sc.nextLine();

            fila.enfileirar(new Documento(nome, numPag));
        }

        //mostrar a fila inicial;
        System.out.println(fila.espiar());

        //imprimir os documentos em ordem;
        System.out.println(fila);

        //ao imprimir, remover da fila;
        //mostrar qual documento esta sendo impresso.
        System.out.println(fila.desenfileirar());
    }
}
