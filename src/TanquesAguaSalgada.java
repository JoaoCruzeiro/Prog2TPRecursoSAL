import java.time.LocalDate;
import java.time.LocalTime;

public class TanquesAguaSalgada {
    private int id;
    private boolean cheio;
    private boolean evaporado;
    private boolean cristalizado;
    private LocalDate ultimaEnchida;
    private TiposDeSal tiposDeSal;

    public TanquesAguaSalgada(int id, TiposDeSal tiposDeSal) {
        this.id = id;
        this.cheio = false;
        this.evaporado = false;
        this.cristalizado = false;
        this.tiposDeSal = tiposDeSal;
        this.ultimaEnchida = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public boolean isEnchido() {
        return cheio;
    }

    public void encher() {
        this.cheio = true;
    }

    public boolean isEvaporado() {
        return evaporado;
    }

    public void recolherEvaporacao() {
        this.evaporado = true;
    }

    public boolean isCristalizado() {
        return cristalizado;
    }

    public void recolherCristalizacao() {
        this.cristalizado = true;
    }

    public void encherAutomaticamente() {
        // Simular enchimento automático após as 10 da manhã e reset à meia-noite
        if (LocalTime.now().getHour() >= 8 && !cheio) {
            encher();
            ultimaEnchida = LocalDate.now();  // Atualizar a data do último enchimento
        } else if (LocalTime.now().getHour() == 0) {
            cheio = false;
        }
    }

    public void HoraEvaporar() {
        // Simular evaporação após as 10 da manhã e reset à meia-noite
        if (LocalTime.now().getHour() >= 10 && !evaporado) {
            recolherEvaporacao();
        } else if (LocalTime.now().getHour() == 0) {
            evaporado = false;
        }
    }

    public void HoraRecolherCristalizacao() {
        // Verifica a diferença de dias desde a última vez que foi enchido
        long diasDesdeUltimoEnchimento = LocalDate.now().toEpochDay() - ultimaEnchida.toEpochDay();

        // Simular recolhimento de cristalização após as 10 da manhã e reset à meia-noite
        if (LocalTime.now().getHour() >= 15 && !cristalizado) {
            recolherCristalizacao();
        } else if (LocalTime.now().getHour() == 0) {
            cristalizado = false;
        }
    }
}