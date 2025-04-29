import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();
        try {
            // chamandoo metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);
        }catch ( ParametrosInvalidosException e) {
            // Imprime a mensagem de que o segundo parametro deve ser maior que o primeiro
            System.out.println("O segundo parametro deve ser maior que o primeiro parametro!");
        }
        terminal.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se o parametroUm é maior que o parametrosdois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro parametro!");
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os numeros com base na variavek contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }    
}
