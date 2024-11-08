import actividades.Estudiar;
import actividades.Socializar;
import actividades.Trabajar;
import interfaz.Actividad;
import model.Ser;

public class ExistencialismoAPP {
    public static void main(String[] args) {

        Ser ser = new Ser("Tricio");

        Actividad estudiar = new Estudiar();
        Actividad trabajar = new Trabajar();
        Actividad socializar = new Socializar();

        ser.buscarSignificado(estudiar);
        ser.buscarSignificado(trabajar);
        ser.buscarSignificado(socializar);


    }
}
