// estrutura do controle de fluxo do for

//for (bloco de inicialização; expressão booleana de validação; bloco de atualização) {
    
    // comando que será executado até que a expressão de validação torne-se falsa

//}


public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <=20;  carneirinhos++) {
            System.out.println("Contando carneirinhos" + carneirinhos);
        }
        System.out.println("Joao dormiu");
    }
}


