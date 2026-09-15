package estrutura_de_dados.vetor;

public class ConsultaDePosicoes {
    public static void main() {
        String linguagem;
        //criar vetor
        Vetor vetor = new Vetor(10);

        //adiciona
        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("JavaScript");
        vetor.adiciona("C#");
        vetor.adiciona("PHP");

        //exibir o elemento da posicao 0;
        System.out.println(vetor.busca(0));

        //exibir o elemento da posicao 2;
        System.out.println(vetor.busca(2));

        //buscar "PHP" e informar sua posicao;
        linguagem = "PHP";
        boolean encontrado = false;
        for(int i = 0; i < vetor.tamanho(); i++){

            if (vetor.busca(i).equals(linguagem)){
                System.out.println("Posição de 'PHP' é: " + i);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Não Encontrado!");
        }

        //buscar "Python" e informar sua posicao;
        linguagem = "Python";
        encontrado = false;
        for(int i = 0; i < vetor.tamanho(); i++){

            if (vetor.busca(i).equals(linguagem)){
                System.out.println("Posição de 'PHP' é: " + i);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Não Encontrado!");
        }

        //buscar um elemento que nao existe e interpretar o retorno -1;
        try {
            vetor.busca(8);
        } catch (IllegalArgumentException e) {
            System.out.println("-1");
        }

        //tentar buscar uma posicao invalida e observar a excecao.
        vetor.busca(8);
    }
}
