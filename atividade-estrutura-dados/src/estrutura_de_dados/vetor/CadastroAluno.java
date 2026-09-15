package estrutura_de_dados.vetor;

import estrutura_de_dados.vetor.Vetor;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vetor classe = new Vetor(10);

        classe.adiciona("Matheus");
        classe.adiciona("Arthur");
        classe.adiciona("Fernanda");
        classe.adiciona("Rafael");
        classe.adiciona("João");
        classe.adiciona("Juan");

        System.out.println("Alunos da classe: " + classe);

        System.out.println("Quantidade de alunos: " + classe.tamanho());

        System.out.println("Aluno da posição 3 é: " + classe.busca(3));

        boolean encontrado = false;
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        for (int i = 0; i < classe.tamanho(); i++) {
            if (classe.busca(i).equals(nome)) {
                System.out.println("Posição: " +  i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }
}