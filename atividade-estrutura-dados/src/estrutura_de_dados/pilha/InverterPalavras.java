package estrutura_de_dados.pilha;

import java.util.Scanner;

public class InverterPalavras {
    public static void main(String[] args) {
        //Utilize uma pilha para inverter a ordem das palavras da frase:
        //eu gosto de java
        //Saída esperada:
        //java de gosto eu
        Scanner sc = new Scanner(System.in);

        Pilha<String> pilha = new Pilha<>(20);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String palavra = "";

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                pilha.empilha(palavra);
                palavra = "";
                continue;
            }
            palavra += frase.charAt(i);
        }
        pilha.empilha(palavra);

        String fraseInversa = "";

        while (!pilha.estaVazia()){
            fraseInversa += pilha.desempilha() + " ";
        }

        System.out.println(fraseInversa);
    }
}
