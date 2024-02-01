import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Utilizador implements Serializable{

    private List<Encomendas> encomendas;

    public Cliente() {
        super();
        this.encomendas = new ArrayList();
    }
}