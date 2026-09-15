package estrutura_de_dados.vetor;

public class ValidacaoDeCapacidade {
    public static void main(String[] args) {
        //criar um vetor com capacidade para 5 elementos;
        Vetor vetor = new Vetor(5);

        //adicionar 5 elementos;
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        //mostrar o vetor;
        System.out.println(vetor);

        //mostrar o tamanho;
        System.out.println(vetor.tamanho());

        //tentar adicionar um sexto elemento;
        vetor.adiciona("F");

        //verificar o retorno de adiciona();
        boolean encontrado = false;
        for (int i = 0; i < vetor.tamanho(); i++) {
            if(vetor.busca(i).equals("F")){
                System.out.println("Foi encontrado!");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Não foi encontrado!");
        }
    }
}
