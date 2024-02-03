class GestorProducao extends Utilizador {
    public GestorProducao(String username, String password, String nome, int nCC, int nif, int telefone, String morada, String localidade) {
        super(username, password, Perfil.GESTOR_PRODUCAO, nome, nCC, nif, telefone, morada, localidade);
    }

    public void criarLoteFabrico() {
        // Implemente os detalhes necessários aqui
    }

    public void recolherProdutoFinal() {
        // Implemente os detalhes necessários aqui
    }
}