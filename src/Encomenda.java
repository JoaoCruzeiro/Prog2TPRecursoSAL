import java.util.ArrayList;
import java.util.List;

public class Encomenda {

    private Cliente cliente;
    private List<Produto> produtosEncomendados;

    public Encomenda(Cliente cliente) {
        this.cliente = cliente;
        this.produtosEncomendados = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtosEncomendados.add(produto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutosEncomendados() {
        return produtosEncomendados;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtosEncomendados) {
            total += produto.getTiposDeSal().getPrecoKG();
        }
        return total;
    }
}