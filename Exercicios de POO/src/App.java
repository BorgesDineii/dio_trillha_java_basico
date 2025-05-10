import java.util.Scanner;

public class App {

    private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("======= Escolha uma das opções: =========");
            System.out.println("1 - Dar banho no pet:");
            System.out.println("2 - Abastecer a maquina com água");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verificar água da maquina");
            System.out.println("5 - Verificar shampoo da maquina");
            System.out.println("6 - Verifcar se tem per no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 7 -> setPetInPetMachine();
                    
               }

        }
        while (option !=0);
    }

    public void setPetMachine() {
        System.out.println("Informe o nome do pet");
        var name = scanner.next();
        var pet 
    }
}
