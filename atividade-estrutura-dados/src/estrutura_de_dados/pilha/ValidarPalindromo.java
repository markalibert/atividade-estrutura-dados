package estrutura_de_dados.pilha;

import java.util.Scanner;

public class ValidarPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha<String> letras = new Pilha<>(10);

        //Crie um programa que verifique se uma palavra é um palíndromo utilizando pilha.

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            String letra = palavra.charAt(i) + "";
            letras.empilha(letra);
        }

        boolean palavraValido = true;

        for (int i =  0; i < palavra.length(); i++) {
            if(!letras.desempilha().equals(palavra.charAt(i) + "")) {
                palavraValido = false;
            }
        }

        if (palavraValido) {
            System.out.println(palavra+ " -> É palíndromo");
        } else{
            System.out.println(palavra+ " -> Não é palíndromo");
        }
    }
}
