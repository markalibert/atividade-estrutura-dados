package estrutura_de_dados.fila.atendimento_banco;

public class Cliente {
    //nome
    //numero da senha
    private String nome;
    private int senha;

    private static int proximaSenha = 1;

    public Cliente(String nome) {
        this.nome = nome;
        this.senha = proximaSenha++;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Senha: " + senha;
    }
}
