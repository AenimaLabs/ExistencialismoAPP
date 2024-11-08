package actividades;

import interfaz.Actividad;

public class Estudiar implements Actividad {
    @Override
    public void realizar() {
        System.out.println("Estudiando programación...");
    }

    @Override
    public boolean esSignificativo() {
        return true; // Estudiar es significativo
    }
}
