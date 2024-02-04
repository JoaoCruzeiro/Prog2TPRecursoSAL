import java.util.ArrayList;
import java.util.List;

public class LoteFabrico {

    private List<TanquesAguaSalgada> tanquesAssociados;
    private List<Produto> produtosProduzidos;

    public LoteFabrico() {
        this.tanquesAssociados = new ArrayList<>();
        this.produtosProduzidos = new ArrayList<>();
    }

    public void adicionarTanque(TanquesAguaSalgada tanque) {
        tanquesAssociados.add(tanque);
    }

    public void recolherSal() {
        for (TanquesAguaSalgada tanque : tanquesAssociados) {
            if (tanque.isCristalizado()) {
                TiposDeSal tiposDeSal = tanque.getTiposDeSal();
                /* Determina o tipo de produto com base no nome do tipo de sal associado ao tanque.
                Se o tipo de sal for "Flor de Sal", o tipo do produto é definido como "Flor de Sal",
                caso contrário, o tipo do produto é definido como "Sal".*/
                String tipoProduto = tiposDeSal.getNomeTipo().equals("Flor de Sal") ? "Flor de Sal" : "Sal";
                Produto produto = new Produto(tiposDeSal);
                produtosProduzidos.add(produto);
            }
        }
    }

    public List<Produto> getProdutosProduzidos() {
        return produtosProduzidos;
    }
}
