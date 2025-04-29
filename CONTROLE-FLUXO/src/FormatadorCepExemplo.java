/*import java.util.Locale;
import java.util.Scanner;
*/
public class FormatadorCepExemplo {
    public static void main(String[] args) {
        /*try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Insira seu CEP:");
            String formatarCep = scanner.next();
        }*/
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidadoExepcion e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP não corresponde com a regra de negócio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidadoExepcion {
        if(cep.length() != 8)
            throw new CepInvalidadoExepcion();

            return "23.765-064";
    }
}
