import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Cliente extends Utilizador {
        private List<Encomenda> encomendas;
        public Cliente(String username, String password, String nome, int nCC, int nif, int telefone, String morada, String localidade) {
                super(username, password, Perfil.CLIENTE, nome, nCC, nif, telefone, morada, localidade);
                this.encomendas = new ArrayList<>();
        }

        public Encomenda criarEncomenda() {
                Encomenda encomenda = new Encomenda(this);
                encomendas.add(encomenda);
                return encomenda;
        }

        /*
         Chama o metodo criado -adicionarLote- criado em encomenda
         Adiciona os produtos de um lote à lista de produtos encomendados de uma encomenda.
         -encomenda: A encomenda à qual os produtos do lote serão adicionados.
         -loteFabrico: O lote de fabrico contendo os produtos a serem adicionados à encomenda.
         */
        public void adicionarLoteEncomenda(Encomenda encomenda, LoteFabrico loteFabrico) {
                // Chama o método da encomenda que lida com a adição de produtos de um lote.
                encomenda.adicionarLote(loteFabrico);
        }
}