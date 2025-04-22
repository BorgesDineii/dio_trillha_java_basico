package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("Controlando a entrada dos itens");
    }
    private void controleSaida() {
        System.out.println("Controlando saída de itens.");
    }
    void entregarIngredientes() {
        System.out.println("Entregando ingredientes.");
        controleSaida();
    }
    void trocarGas() {
        System.out.println("Almoxarife trocando o gás.");   
    }
}
