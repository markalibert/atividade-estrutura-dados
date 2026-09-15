package estrutura_de_dados.fila.chamada_telefonica;

public class Chamada {
    //nome da pessoa
    //assunto

    private String nome;
    private String assunto;

    public Chamada(String nome, String assunto){
        this.nome = nome;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Ligação de: " + this.nome + " - Assunto: " + this.assunto;
    }
}
