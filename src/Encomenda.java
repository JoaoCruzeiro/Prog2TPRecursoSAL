import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private List<LoteFabrico> lotesFabrico;
    private String moradaEntrega;
    private LocalDate dataEncomenda;
    private boolean enviada;

    public Encomenda(Cliente cliente) {
        this.cliente = cliente;
        this.lotesFabrico = new ArrayList<>();
        this.dataEncomenda = LocalDate.now();
        this.enviada = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public String getMoradaEntrega() {
        return moradaEntrega;
    }

    public LocalDate getDataEncomenda() {
        return dataEncomenda;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }

    // Método para adicionar um loteFabrico à encomenda
    public void adicionarLote(LoteFabrico loteFabrico) {
        lotesFabrico.add(loteFabrico);
    }


    @Override
    public String toString() {
        return "Encomenda{" +
                "cliente=" + cliente +
                ", produtos=" + produtos +
                ", moradaEntrega='" + moradaEntrega + '\'' +
                ", dataEncomenda=" + dataEncomenda +
                ", enviada=" + enviada +
                '}';
    }
}