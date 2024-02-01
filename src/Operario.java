import java.io.Serializable;

public class Operario implements Serializable {

    private String nome;
    private int nifOperario;
    private int nSegSocial;
    private int contacto;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNifTrabalhador() {
        return nifOperario;
    }

    public void setNifTrabalhador(int nifTrabalhador) {
        this.nifOperario = nifTrabalhador;
    }

    public int getnSegSocial() {
        return nSegSocial;
    }


    public void setnSegSocial(int nSegSocial) {
        this.nSegSocial = nSegSocial;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
