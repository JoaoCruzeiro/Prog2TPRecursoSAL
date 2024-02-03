public class TiposDeSal {

    private String nomeTipo;
    private float precoKG;

    public TiposDeSal(String nomeTipo, float precoKG) {
        this.nomeTipo = nomeTipo;
        this.precoKG = precoKG;
    }

    public float getPrecoKG() {
        return precoKG;
    }

    public void setPrecoKG(float precoKG) {
        this.precoKG = precoKG;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
}