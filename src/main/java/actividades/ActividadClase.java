package actividades;

public class ActividadClase {
    private String descripcion;
    private double valorSentido;

    public ActividadClase(String descripcion, double valorSentido) {
        this.descripcion = descripcion;
        this.valorSentido = valorSentido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorSentido() {
        return valorSentido;
    }
}
