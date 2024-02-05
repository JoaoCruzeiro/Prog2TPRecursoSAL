import java.util.ArrayList;
import java.util.List;

public class GestaoUtilizadores {
    private List<Utilizador> utilizadores;

    public GestaoUtilizadores() {
        this.utilizadores = new ArrayList<>();
    }

    public void adicionarUtilizador(Utilizador utilizador) {
        this.utilizadores.add(utilizador);
    }

    public List<Utilizador> obterUtilizadores() {
        return this.utilizadores;
    }

    public void listarUtilizadores() {
        for (Utilizador utilizador : this.utilizadores) {
            System.out.println(utilizador);
        }
    }

    public Utilizador autenticarUtilizador(String username, String password) {
        for (Utilizador utilizador : utilizadores) {
            if (utilizador.getUsername().equals(username) && utilizador.getPassword().equals(password)) {
                return utilizador;
            }
        }
        System.out.println("Falha na autenticação. Utilizador não reconhecido.");
        return null;
    }
}
