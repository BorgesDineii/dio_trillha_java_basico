public class ComputadorDoPedrinho {
    public static void main (String[] args) {
        MSNMessenger msn = new MSNMessenger();

        //msn.validarConectadoInternet();
        msn.enviarMensagem();
        //msn.salvarHistoricoDeMensagem();

        msn.receberMensagem();
    }
}
