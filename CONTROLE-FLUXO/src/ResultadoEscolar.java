public class ResultadoEscolar {
    public static void main (String[] args) {
        int nota = 6;

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Esta reprovado meu nobre";
        System.out.println(resultado);

        //if(nota >= 7){
        //    System.out.println("Aprovado!");
        //} else if (nota >= 5 && nota < 7) {
        //    System.out.println("Poxa meu nobre, você esta de recuperação!");
        //} else {
        //    System.out.println("Tu tem que estudar mais meu nobre, esta de reprovado!");
        //}

    }
}
