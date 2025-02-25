import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer as mensagens para o nosso Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        boolean continuar = true;

        // Exibir as mensagens para o nosso usuario
        System.out.println("Nos informe o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Nos informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Conta: ");
        int conta = scanner.nextInt();

        double saldo = 0.0;
        
        // Exibir a mensagem de conta criada  
        
        System.out.println("Olá " + nome +" "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e esse é o saldo da sua conta R$" + saldo + ".");
        
        while (continuar) {
            System.out.println("Gostaria de fazer um deposito? (s/n)");
            String resposta = scanner.nextLine().toLowerCase();

            //System.out.println("\n Escolha uma opção: ");
            //System.out.println("1 - Deposito");
            //System.out.println("2 - Saque");
            //System.out.println("3 - Saldo");
            //System.out.println("4 - Sair");
            //System.err.print("Opção: ");
            //int opcao = scanner.nextInt();
            
            if (resposta.equals("s")) {
                System.out.println("Por favor, insira o valor do depósito!");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Seu depósito de R$ " + valorDeposito + " foi realizado com sucesso!");
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (resposta.equals("n")) {
                System.out.println("Nenhum depósito foi realizado.");
                continuar = false;
            } else {
                System.out.println("Resposta invalida. Por favor, digite 's' para sim ou 'n' para não.");
            }
            System.out.println("Gostaria de fazer um saque? (s/n)");
            String respost1 = scanner.nextLine().toLowerCase();
            if (respost1.equals("s")) {
                System.out.println("Por favor, insira o valor do saque:");
                double valorSaque = scanner.nextDouble();
                saldo -= valorSaque;
                System.out.println("Seu saque de R$ " + valorSaque + "foi realizado com sucesso!");
                System.out.println("Seu saldo é de R$" + saldo);
            }
        }
        System.out.println("Obrigado por usar o simulador de banco!");
    }
}

        // Obter pela scanner os  valores digitados no terminal

        // Exibir a mensagem de conta criada     


