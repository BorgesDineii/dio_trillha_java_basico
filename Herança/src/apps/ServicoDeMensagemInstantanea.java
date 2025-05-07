package apps;
public abstract class ServicoDeMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoAInternet() {
        System.out.println("Validando se esta conectado a internet");
    }
    //public void enviarMensagem() {
    //    validarConexaoAInternet();
    //    System.out.println("Enviando mensagem");
    //    salvarHistoricoMensagem();
    //}
    //public void receberMensagem() {
    //    System.out.println("Recebendo mensagem");
   // }
    //private void validarConexaoAInternet() {
    //    System.out.println("Validando conexão com a internet");
    //}
    //private void salvarHistoricoMensagem() {
    //    System.out.println("Salvando historico de mensagens");
    //}
}
