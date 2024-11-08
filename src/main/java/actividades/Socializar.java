package actividades;

import interfaz.Actividad;

public class Socializar implements Actividad {
    @Override
    public void realizar() {
        System.out.println("Conociendo otras personas...");
    }

    @Override
    public boolean esSignificativo() {
        return true; //Socializar es significativo para algunos
    }
}
