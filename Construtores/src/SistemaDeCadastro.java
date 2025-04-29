public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123.132.215.15", "Marcos");

        // definimos o enfereco de marcos
        marcos.setEndereco("Rua das Marias");

        // e como definir o nome e o cpf de marcos?

        // imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
