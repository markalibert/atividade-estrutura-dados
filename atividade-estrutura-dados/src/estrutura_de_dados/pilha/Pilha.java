package estrutura_de_dados.pilha;

public class Pilha<T> {
    //Crie uma classe Pilha que utilize um vetor para armazenar os elementos.
    //A classe deve possuir:
    //um vetor chamado elementos
    //uma variavel chamada tamanho
    //Implemente os metodos:
    //empilha(String elemento)
    //desempilha()
    //topo()
    //estaVazia()
    //tamanho()
    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {

            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public void empilha(T elemento) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T desempilha() {
        if(estaVazia()) {
            return null;
        }

        T elemento = this.elementos[this.tamanho - 1];
        this.elementos[this.tamanho -1] = null;
        this.tamanho--;
        return elemento;
    }

    public T topo() {
        if(estaVazia()) {
            return null;
        }

        return this.elementos[this.tamanho - 1];
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
        }

}