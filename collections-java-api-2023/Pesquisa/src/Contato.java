public class Contato {
    private String nome;

    private int numero;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numero=" + numero + "]";
    }
}
