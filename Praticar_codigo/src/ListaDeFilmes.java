import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeFilmes {
    private List<Filmes> filmesList;

    public ListaDeFilmes () {
        this.filmesList = new ArrayList<>();
    }

    public void adicionarFilmes (String filme, String genero) {
        filmesList.add(new Filmes(filme, genero));
    }

    public void removeFilmes(String filme) {
        List<Filme> filmeParaRemover= new ArrayList<>();
        if (!filmesList.isEmpty()) {
            for(Filme f: filmesList) {
                if(f.getFilme().equalsIgnoreCase(nome)) {
                    filmeParaRemover.add(f);
                }
            }
        filmesList.removeAll(filmeParaRemover);
        } else {
            System.out.println("A lista esta vazia");
        }
    }
    public void exibirListaFilmes() {
        if(!filmesList.isEmpty()) {
            System.out.println(filmesList);
        } else {
            System.out.println("A lista esta vazia");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeFilmes = new ArrayList<>();

        String resposta;
        //ListaDeFilmes listaDeFilmes = new listaDeFilmes();

        do {
            System.out.println("Digite o nome do filme: ");
            String filme = scanner.nextLine();
            listaDeFilmes.add(filme);

            System.out.println("Gostaria de adicionar mais um filme? \n y - sim \n n - não");
            resposta = scanner.nextLine().toLowerCase();
        }
        while (resposta.equals("y"));
            System.out.println("\n Lista de filmes: ");
            for (String f : listaDeFilmes) {
                System.out.println("- " + f);
            }
        scanner.close();   
        }
}

