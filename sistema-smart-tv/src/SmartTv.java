public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void aumentarVolume (){
        System.out.println("Aumentando o volume " + volume);
        volume ++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume " + volume);
        volume --;
    }

    public void aumentarCanal (){
        System.out.println("Trocando o canal " + canal);
        canal++;
    }
    public void diminuirCanal (){
        System.out.println("Diminuindo o canal " + canal);
        canal--;
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void ligar (){
        ligada=true;
    }
    public void desligada (){
        ligada=false;
    }
}