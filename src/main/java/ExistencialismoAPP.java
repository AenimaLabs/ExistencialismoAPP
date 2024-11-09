import actividades.Actividades;
import model.Ser;

public class ExistencialismoAPP {
    public static void main(String[] args) {


        Ser serExistencialista = new Ser.SerBuilder()
                .nombre("Tricio")
                .conSentidoDeVida(30) //el sentido de vida inicial puede ser configurado
                .build();

        //Crear algunas actividades
        Actividades estudiar = new Actividades("Estudiando filosofía", 10);
        Actividades meditar = new Actividades("Meditando mucho", 8);

        serExistencialista.buscarSignificado(estudiar);
        serExistencialista.buscarSignificado(meditar);

    }
}
