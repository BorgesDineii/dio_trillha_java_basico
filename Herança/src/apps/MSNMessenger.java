package apps;
public class MSNMessenger  extends ServicoDeMensagemInstantanea {
    
    public void enviarMensagem() {
        validarConexaoAInternet();
        System.out.println("Enviando mensagem do MSN Messenger");
    }
    
    public void receberMensagem() {
        System.out.println("Recebendo mensagem do MSN Messenger");

    }
}
