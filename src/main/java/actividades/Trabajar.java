package actividades;

import interfaz.Actividad;

public class Trabajar implements Actividad {

    @Override
    public void realizar() {
        System.out.println("Este trabajo no me gusta...");

    }


    @Override
    public boolean esSignificativo() {
        return false; // Este trabajo no es significativo
    }
}
