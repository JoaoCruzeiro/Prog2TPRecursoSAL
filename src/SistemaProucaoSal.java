public class SistemaProucaoSal {
    public static void main(String[] args) {
        // Criando instâncias com dados específicos
        Cliente cliente = new Cliente("cliente1", "senhaCliente","NomeCliente", 123456, 789012345, 987654321, "Rua Cliente, 123", "Cidade");

        GestorProducao gestorProducao = new GestorProducao("Maria", "senhaProducao", "Gestor Producao", 0, 0, 0, "N/A", "N/A");

        GestorVendas gestorVendas = new GestorVendas("Antonio", "senhaVendas", "Gestor Vendas", 0, 0, 0, "N/A", "N/A");

        //Produtos (Tipos de Sal)
        Produto sal = new Produto("Sal", 5.00f);
        Produto florDeSal = new Produto("Flor de Sal", 8.00f);
    }
}