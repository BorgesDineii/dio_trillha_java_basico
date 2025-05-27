public class Telefone implements LigacaoIphone{

    @Override
    public void fazerLigacao() {
        System.out.println("O Iphone esta realizando ligação.");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("O iphone esta atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O Iphone esta iniciando o correio de Voz.");
    }
}
