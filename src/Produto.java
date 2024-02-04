//Esta classe simboliza uma embalagem que contem um tipo de sal

public class Produto {

    private TiposDeSal tiposDeSal;

    public Produto(TiposDeSal tiposDeSal) {
        this.tiposDeSal = tiposDeSal;
    }

    public TiposDeSal getTiposDeSal() {
        return tiposDeSal;
    }
}

