import actividades.ActividadFactory;
import actividades.Estudiar;
import actividades.Socializar;
import actividades.Trabajar;
import interfaz.Actividad;
import model.Ser;

public class ExistencialismoAPP {
    public static void main(String[] args) {

        Ser ser = new Ser("Tricio");


        Actividad estudiar = ActividadFactory.crearActividad("estudiar");
        Actividad trabajar = ActividadFactory.crearActividad("trabajar");
        Actividad socializar = ActividadFactory.crearActividad("socializar");


        ser.buscarSignificado(estudiar);
        ser.buscarSignificado(trabajar);
        ser.buscarSignificado(socializar);


    }
}
