import java.io.Serializable;

public class Utilizador implements Serializable{

    private String nome;
    private int nCC;
    private int nif;
    private int telefone;
    private String morada;
    private String localidade;
    private String username;
    private String password;
    private Perfil perfil;

    public Utilizador(String username, String password, Perfil perfil, String nome, int nCC, int nif, int telefone, String morada, String localidade) {
        this.username = username;
        this.password = password;
        this.perfil = perfil;
        this.nome = nome;
        this.nCC = nCC;
        this.nif = nif;
        this.telefone = telefone;
        this.morada = morada;
        this.localidade = localidade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnCC() {
        return nCC;
    }

    public void setnCC(int nCC) {
        this.nCC = nCC;
    }

    public int getNif() {
        return nif;
    }


    public void setNif(int nif) {
        this.nif = nif;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    public String getMorada() {
        return morada;
    }


    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Nao precisa de setters porque noa vai ser alterado
    public Perfil getPerfil() {
        return perfil;
    }
}