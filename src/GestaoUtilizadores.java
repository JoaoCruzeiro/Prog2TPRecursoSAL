import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestaoUtilizadores implements Serializable {
    private List<Utilizador> utilizadores;
    private static final long serialVersionUID = 1L; //???
    private final String caminhoFicheiro = "gestaoutilizadores.ser";

    public List<Utilizador> getUtilizadores() {
        return this.utilizadores;
    }

    public GestaoUtilizadores() {
        this.utilizadores=new ArrayList<>();
        carregarUtilizadores();// Carregar utilizadores no construtor
    }

    void salvarObjetoSerializado(Object objeto) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(caminhoFicheiro))) {
            outputStream.writeObject(objeto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarUtilizadores() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(caminhoFicheiro))) {
            this.utilizadores = (List<Utilizador>) inputStream.readObject();
            System.out.println(this.utilizadores);
        }catch (FileNotFoundException e){
            this.utilizadores.add(new Admin());
            salvarObjetoSerializado(this.utilizadores);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void adicionarUtilizador(Utilizador utilizador) {
        this.utilizadores.add(utilizador);
        System.out.println("Utilizador registado com sucesso!");
        salvarObjetoSerializado(this.utilizadores);
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