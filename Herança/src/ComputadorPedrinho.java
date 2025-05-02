public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        //abrindo Facebook Messenger
        System.out.println("Facebook");
        FacebookMessenger fMessenger = new FacebookMessenger();
        fMessenger.enviarMensagem();
        fMessenger.receberMensagem();

        //abrindo telegram
        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
