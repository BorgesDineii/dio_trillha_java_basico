package Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoas> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoaList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordernarPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoas> ordernarPorAltura() {
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoas("João",20, 1.86);
        ordenacaoPessoas.adicionarPessoas("Borges", 25, 1.70);
        ordenacaoPessoas.adicionarPessoas("Pedro", 28, 1.76);

        System.out.println(ordenacaoPessoas.ordernarPorIdade());
        System.out.println(ordenacaoPessoas.ordernarPorAltura());
    }
}
