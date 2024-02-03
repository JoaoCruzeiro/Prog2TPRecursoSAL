public class ProdutoEncomendado {
    private Produto produto;
    private int quantidade;

    public ProdutoEncomendado(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
