package actividades;

public class Actividades {
    private String descripcion;
    private double valorSentido;

    public Actividades(String descripcion, double valorSentido) {
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
