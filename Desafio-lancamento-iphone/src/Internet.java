public class Internet implements Navegador{

    @Override
    public void exibirPagina() {
        System.out.println("O Iphone esta exibindo a pagina do site no navegador.");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("O Iphone esta adicionando uma nova aba no navegador.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("O Iphone esta atualizando a pagina no navegador.");
    }
}
