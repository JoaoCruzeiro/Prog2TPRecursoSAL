import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

class GestorProducao extends Utilizador {
    private List<TanquesAguaSalgada> tanquesDisponiveis;
    private List<LoteFabrico> lotesFabrico;
    private List<Produto> produtosProduzidos;
    public GestorProducao(String username, String password, String nome, int nCC, int nif, int telefone, String morada, String localidade) {
        super(username, password, Perfil.GESTOR_PRODUCAO, nome, nCC, nif, telefone, morada, localidade);
        this.tanquesDisponiveis = tanquesDisponiveis;
        this.lotesFabrico = new ArrayList<>();
        this.produtosProduzidos = new ArrayList<>();
    }

    public LoteFabrico criarLoteFabrico(TanquesAguaSalgada tanque, int quantidadeProdutos, LocalDate dataProducao) {
        // Criação do lote
        LoteFabrico loteFabrico = new LoteFabrico(tanque, dataProducao);

        // Adiciona a quantidade especificada de produtos ao lote, associando-os ao tanque
        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto produto = new Produto(tanque.getTiposDeSal()); // Cria um produto com o tipo de sal do tanque
            loteFabrico.adicionarProduto(produto);
        }

        // Adiciona o lote fabricado à lista de lotesFabrico do Gestor de Produção
        lotesFabrico.add(loteFabrico);

        // Retorna o lote fabricado
        return loteFabrico;
    }
    public void recolherProdutoFinal() {
        // Implemente os detalhes necessários aqui
    }
}