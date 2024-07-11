package list.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoquePordutoMap;

    //construtor
    public EstoqueProdutos() {
        this.estoquePordutoMap = new HashMap<>();
    }
    
    //metodos
    public void adiconarProduto(long cod, String nome, int quantidade, double preco) {
        estoquePordutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoquePordutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoquePordutoMap.isEmpty()) {
            for(Produto produto : estoquePordutoMap.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if (!estoquePordutoMap.isEmpty()) {
            for(Produto produto : estoquePordutoMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();

        estoque.adiconarProduto(1L, "Produto A", 10, 5.0);
        estoque.adiconarProduto(2L, "Produto B", 5, 10.0);
        estoque.adiconarProduto(03L, "Produto C", 2, 15.0);

        estoque.exibirProduto();

        System.out.println("Valor total de estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }
}
