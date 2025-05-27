public class Iphone implements LigacaoIphone, MusicPlayer, Navegador{
    @Override
    public void playMusic() {
        System.out.println("O Iphone esta tocando musica.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O iphone esta pausando musica.");
    }

    @Override
    public void selecionarMusic() {
        System.out.println("O iphone esta selecionando musica.");
    }
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
    @Override
    public void exibirPagina() {
        System.out.println("O Iphone esta exibindo a pagina do site no navegador.");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("O Iphone esta adicionando uma nova aba no navegador.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("O Iphone esta atualizando a pagina no navegador.");
    }
}