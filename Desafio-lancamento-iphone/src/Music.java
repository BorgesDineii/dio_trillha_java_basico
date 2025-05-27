public class Music implements MusicPlayer{

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

}
