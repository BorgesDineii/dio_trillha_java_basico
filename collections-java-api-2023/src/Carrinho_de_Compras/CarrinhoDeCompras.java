package Carrinho_de_Compras;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<CarrinhoDeCompras> produtoList;

    public CarrinhoDeCompras() {
        this.produtoList = new ArrayList<>();
    }
    public void adicionarProdutos(String produto) {
        produtoList.add(new Produto(produto));
    }
}
