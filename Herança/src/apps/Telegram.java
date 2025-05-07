package apps;
public class Telegram  extends ServicoDeMensagemInstantanea{
    public void enviarMensagem() {
        validarConexaoAInternet();
        System.out.println("Enviando mensagem do Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem do Telegram");
    }
}
