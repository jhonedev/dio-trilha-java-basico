package list.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import list.Ordenacao.Produto.ComparatorPorPreco;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    //construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //metodos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }
}
