package estrutura_de_dados.vetor;

import java.util.Scanner;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String livro;
        int num;

        //criar um vetor com capacidade para 10 livros;
        Vetor biblioteca = new Vetor(10);

        //adicionar 7 titulos;
        biblioteca.adiciona("O Pequeno Príncipe");
        biblioteca.adiciona("O Mulato");
        biblioteca.adiciona("A Casa Verde");
        biblioteca.adiciona("O Quinze");
        biblioteca.adiciona("A Bíblia");
        biblioteca.adiciona("A Odisseia");
        biblioteca.adiciona("A Ilíada");

        //mostrar os livros;
        System.out.println(biblioteca);

        //informar a quantidade;
        System.out.println(biblioteca.tamanho());

        //consultar um livro pela posicao;
        //informar caso nao seja encontrado;
        //utilizar try/catch para tratar uma posicao invalida.
        try {
            System.out.print("Digite o índice do livro: ");
            num = sc.nextInt();
            System.out.println(biblioteca.busca(num));
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //procurar um livro pelo titulo;
        //informar caso nao seja encontrado;
        sc.nextLine();
        System.out.print("Digite o nome do livro: ");
        livro = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < biblioteca.tamanho(); i++) {
            if (biblioteca.busca(i).equals(livro)) {
                encontrado = true;
                System.out.println("O livro foi encontrado!");
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Livro não encontrado!");
        }
    }
}