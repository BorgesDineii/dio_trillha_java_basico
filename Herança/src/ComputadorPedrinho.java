import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoDeMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Poliformismo
        /* não sabe qual app 
         * mas devera enviar e receber mensagem
         */
        ServicoDeMensagemInstantanea smi = null;

        String appEscolhido = "telegram";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        if(appEscolhido.equals("facebook"))
            smi = new FacebookMessenger();
        if(appEscolhido.equals("telegram"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
        //abrindo MSN Messenger
        //System.out.println("MSN");
        //MSNMessenger msn = new MSNMessenger();
        //msn.enviarMensagem();
        //msn.receberMensagem();

        //abrindo Facebook Messenger
        //System.out.println("Facebook");
        //FacebookMessenger fMessenger = new FacebookMessenger();
        //fMessenger.enviarMensagem();
        //fMessenger.receberMensagem();

        //abrindo telegram
        //System.out.println("Telegram");
        //Telegram telegram = new Telegram();
        //telegram.enviarMensagem();
        //telegram.receberMensagem();
    }
}
