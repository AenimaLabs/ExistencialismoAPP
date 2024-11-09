package actividades;

import interfaz.Actividad;

public class ActividadFactory {
    public static Actividad crearActividad(String tipo) {
        switch (tipo.toLowerCase()) {
            case "estudiar":
                return new Estudiar();

            case "trabajar":
                return new Trabajar();

            case "socializar":
                return new Socializar();

            default:
                throw new IllegalArgumentException("Tipo de actividad desconocida");
        }
    }
}
