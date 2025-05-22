public class Computer implements MusicPlayer, VideoPlayer{

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println("O computador esta tocando musica");
    }

    @Override
    public void pauseMusic() {
        // TODO Auto-generated method stub
        System.out.println("O computador esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        // TODO Auto-generated method stub
        System.out.println("O computador esta parando a musica");
    }

    @Override
    public void playVideo() {
        // TODO Auto-generated method stub
        System.out.println("O computador esta reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        // TODO Auto-generated method stub
        System.out.println("O computador esta pausando o video");
    }

    @Override
    public void stopVideo() {
        // TODO Auto-generated method stub
        System.out.println("O computador esta parando o video");
    }
}
