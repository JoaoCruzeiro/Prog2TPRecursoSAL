import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoteFabrico {
    private TanquesAguaSalgada tanqueAssociado;
    private List<Produto> produtosProduzidos;
    private LocalDate dataProducao;

    public LoteFabrico(TanquesAguaSalgada tanqueAssociado, LocalDate dataProducao) {
        this.tanqueAssociado = tanqueAssociado;
        this.produtosProduzidos = new ArrayList<>(); // Inicializa a lista de produtos
        this.dataProducao = dataProducao;
    }

    public TanquesAguaSalgada getTanquesAssociado() {
        return tanqueAssociado;
    }

    public void setTanquesAssociados(TanquesAguaSalgada tanqueAssociado) {
        this.tanqueAssociado = tanqueAssociado;
    }

    public List<Produto> getProdutosProduzidos() {
        return produtosProduzidos;
    }
    public void adicionarProduto(Produto produto) {
        produtosProduzidos.add(produto);
    }
}