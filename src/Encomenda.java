import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private static int contadorEncomendas = 1; // Contador para gerar IDs únicos para cada encomenda
    private int id;
    private Cliente cliente;
    private List<ProdutoEncomendado> produtos;

    public Encomenda(Cliente cliente) {
        this.id = contadorEncomendas++;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ProdutoEncomendado> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(new ProdutoEncomendado(produto, quantidade));
    }

    // Outros métodos relacionados a Encomenda, se necessário
}
