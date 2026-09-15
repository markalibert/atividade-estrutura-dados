package estrutura_de_dados.pilha;

import java.util.Scanner;

public class InverterPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha<String> letras = new Pilha<>(10);

        //Utilize uma pilha para inverter a palavra:
        //hello

        //Saída esperada:
        //olleh

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            String letra = palavra.charAt(i) + "";
            letras.empilha(letra);
        }

        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(letras.desempilha());
        }
    }
}
