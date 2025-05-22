public class MusicBox implements MusicPlayer{

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println("O Music Box esta tocando musica");
    }

    @Override
    public void pauseMusic() {
        // TODO Auto-generated method stub
        System.out.println("O Music Box esta pausando a musica");
    }

    @Override
    public void stopMusic() {
        // TODO Auto-generated method stub
        System.out.println("O Music Box esta parando a musica");
    }
}