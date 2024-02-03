import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Cliente extends Utilizador {
public Cliente(String username, String password, String nome, int nCC, int nif, int telefone, String morada, String localidade) {
        super(username, password, Perfil.CLIENTE, nome, nCC, nif, telefone, morada, localidade);
        }
}