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
            //System.out.println("Gostaria de fazer um deposito? (s/n)");
            //String resposta = scanner.nextLine().toLowerCase();

            System.out.println("\n Escolha uma opção: ");
            System.out.println(" 1 - Deposito");
            System.out.println(" 2 - Saque");
            System.out.println(" 3 - Saldo");
            System.out.println(" 4 - Sair");
            System.err.print("Opção: ");
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("Por favor, insira o valor do depósito!");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Seu depósito de R$ " + valorDeposito + " foi realizado com sucesso!");
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Por favor insira o valor do saque");
                double valorSaque = scanner.nextDouble();
                if (valorSaque > 0 && valorSaque <= saldo) {
                    saldo -= valorSaque;
                    System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
                } else if (valorSaque > saldo){
                    System.out.println("Sua conta possui o saldo de R$" + saldo +". Saldo insuficiente para saque! Por favor realize um depósito!");
                } else {
                    System.out.println("Valor invalido para saque.");
                }
                //continuar = false;
            } else if (opcao == 3) {
                System.out.println("O seu saldo atual é de R$" + saldo );
            } else if (opcao == 4) {
                continuar = false;
                System.out.println("Obrigado por usar o simulador de banco!");
            } else {
                System.out.println("Opção invalida. Tente novamente.");
            }
            //System.out.println("Gostaria de fazer um saque? (s/n)");
            //String respost1 = scanner.nextLine().toLowerCase();
            //if (respost1.equals("s")) {
            //    System.out.println("Por favor, insira o valor do saque:");
            //    double valorSaque = scanner.nextDouble();
            //    saldo -= valorSaque;
            //    System.out.println("Seu saque de R$ " + valorSaque + "foi realizado com sucesso!");
            //    System.out.println("Seu saldo é de R$" + saldo);
            //}
        }
        scanner.close();
        //System.out.println("Obrigado por usar o simulador de banco!");
    }
}

        // Obter pela scanner os  valores digitados no terminal

        // Exibir a mensagem de conta criada     


