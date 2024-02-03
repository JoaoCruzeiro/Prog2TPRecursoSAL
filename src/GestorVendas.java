class GestorVendas extends Utilizador {
    public GestorVendas(String username, String password, String nome, int nCC, int nif, int telefone, String morada, String localidade) {
        super(username, password, Perfil.GESTOR_PRODUCAO, nome, nCC, nif, telefone, morada, localidade);
    }

    public void tratarEncomendas() {
        // Implemente os detalhes necessários aqui
    }

    public void listarExpedicao() {
        // Implemente os detalhes necessários aqui
    }
}