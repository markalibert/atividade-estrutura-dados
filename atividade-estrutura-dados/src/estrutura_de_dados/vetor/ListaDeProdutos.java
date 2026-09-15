package estrutura_de_dados.vetor;

import java.util.Scanner;

public class ListaDeProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar um vetor com capacidade para 8 produtos
        Vetor lista = new Vetor(8);

        //adicionar 5 produtos;
        lista.adiciona("Café");
        lista.adiciona("Açucar");
        lista.adiciona("Arroz");
        lista.adiciona("Feijão");
        lista.adiciona("Cuscuz");

        //exibir o vetor;
        System.out.println("Lista de produtos: " + lista);

        //tentar adicionar produtos ate atingir a capacidade maxima;
        while (lista.espacosDisponiveis() > 0){
            System.out.print("Digite um produto: ");
            String nome = sc.nextLine();
            lista.adiciona(nome);
        }

        //verificar o retorno do metodo adiciona;
        System.out.println("Lista de produtos: " + lista);

        //informar ao usuario quando nao houver mais espaço para adicionar produtos.
        System.out.println("Lista de produtos completa!");
    }
}