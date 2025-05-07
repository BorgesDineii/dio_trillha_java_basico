package apps;
public class FacebookMessenger extends ServicoDeMensagemInstantanea {
    public void enviarMensagem() {
        validarConexaoAInternet();
        System.out.println("Enviando mensagem do Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem do Facebook");
    }
}
