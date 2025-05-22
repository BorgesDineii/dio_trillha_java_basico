public class Smartphone implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println("O smartphone esta tocando musica");
    }

    @Override
    public void pauseMusic() {
        // TODO Auto-generated method stub
        System.out.println("O smartphone esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        // TODO Auto-generated method stub
        System.out.println("O smartphone esta parando a musica");
    }

    @Override
    public void playVideo() {
        // TODO Auto-generated method stub
        System.out.println("O smartphone esta reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        // TODO Auto-generated method stub
        System.out.println("O smartphone esta pausando o video");
    }

    @Override
    public void stopVideo() {
        // TODO Auto-generated method stub
        System.out.println("O smartphone esta parando o video");
    }

}
