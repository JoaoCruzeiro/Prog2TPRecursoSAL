public class SistemaProucaoSal {
    public static void main(String[] args) {
        // Criando instâncias com dados específicos
        Cliente cliente = new Cliente("cliente1", "senhaCliente","NomeCliente", 123456, 789012345, 987654321, "Rua Cliente, 123", "Cidade");

        GestorProducao gestorProducao = new GestorProducao("Maria", "senhaProducao", "Gestor Producao", 0, 0, 0, "N/A", "N/A");

        GestorVendas gestorVendas = new GestorVendas("Antonio", "senhaVendas", "Gestor Vendas", 0, 0, 0, "N/A", "N/A");

        //Produtos (Tipos de Sal)
        TiposDeSal sal = new TiposDeSal("Sal", 5.0f);
        TiposDeSal florDeSal = new TiposDeSal("Flor de Sal", 8.0f);

        // Criar tanques
        TanquesAguaSalgada tanque1 = new TanquesAguaSalgada(1, sal);
        TanquesAguaSalgada tanque2 = new TanquesAguaSalgada(2, sal);
        TanquesAguaSalgada tanque3 = new TanquesAguaSalgada(3, florDeSal);


        // Associar tanques a um lote
        LoteFabrico lote = new LoteFabrico();
        lote.adicionarTanque(tanque1);
        lote.adicionarTanque(tanque2);
        lote.adicionarTanque(tanque3);

        // Produzir lote
        lote.encherAutomaticamente();
        lote.recolherSal();
        lote.recolherFlorDeSal();
    }
}