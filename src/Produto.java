public class Produto {
    private static int contadorProdutos = 1;
    private int id;
    private String nome;
    private float precoKG;

    public Produto(String nome, float precoKG) {
        this.id = contadorProdutos++;
        this.nome = nome;
        this.precoKG = precoKG;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return precoKG;
    }
}