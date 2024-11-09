package actividades;

import interfaz.Actividad;

public class ActividadFactory {

    public static Actividad crearActividad(String tipo) {

        return switch (tipo.toLowerCase()) {
            case "estudiar" -> new Estudiar();
            case "trabajar" -> new Trabajar();
            case "socializar" -> new Socializar();
            default -> throw new IllegalArgumentException("Tipo de actividad desconocida");
        };
    }
}
