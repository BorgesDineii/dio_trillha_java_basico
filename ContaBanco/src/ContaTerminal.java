import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer as mensagens para o nosso Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        // Exibir as mensagens para o nosso usuario
        System.out.println("Nos informe o seu nome! ");
        String nome = scanner.next();

        System.out.println("Nos informe seu sobrenome! ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Conta!");
        int conta = scanner.nextInt();
        
        double saldo = 237.48;

        // Exibir a mensagem de conta criada  
        System.out.println("Olá " + nome +" "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + "e seu saldo " + saldo + " já está disponível para saque");
    }

        // Obter pela scanner os  valores digitados no terminal

        // Exibir a mensagem de conta criada     
}

