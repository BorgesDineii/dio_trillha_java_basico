public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("TV  está ligadas? " + smartTv.ligada);
        smartTv.ligar ();
        System.out.println("Novo status -> Tv ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(22);
        System.out.println("Canal Atual: "+ smartTv.canal);


        smartTv.desligada ();
        System.out.println("Novo status -> Tv desligada? "+ smartTv.ligada);

    }
}
