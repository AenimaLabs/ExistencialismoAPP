import actividades.ActividadClase;
import actividades.Estudiar;
import actividades.Socializar;
import actividades.Trabajar;
import interfaz.Actividad;
import model.Ser;

public class ExistencialismoAPP {
    public static void main(String[] args) {

//        Ser ser = new Ser("Tricio");
//
//        Actividad estudiar = new Estudiar();
//        Actividad trabajar = new Trabajar();
//        Actividad socializar = new Socializar();
//
//        ser.buscarSignificado(estudiar);
//        ser.buscarSignificado(trabajar);
//        ser.buscarSignificado(socializar);

        Ser serExistencialista = new Ser.SerBuilder()
                .nombre("Tricio")
                .conSentidoDeVida(30) //el sentido de vida inicial puede ser configurado
                .build();

        //Crear algunas actividades
        ActividadClase estudiar = new ActividadClase("Estudiando filosofía", 10);
        ActividadClase meditar = new ActividadClase("Meditando mucho", 8);

       serExistencialista.buscarSignificado(estudiar);
       serExistencialista.buscarSignificado(meditar);

    }
}
