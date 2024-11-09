package model;

import actividades.ActividadClase;
import interfaz.Actividad;

public class Ser {

    //atributos
    private String nombre;
    private double sentidoDeVida;

    //constructor vacío
    public Ser() {
    }

    public Ser(String nombre) {
        this.nombre = nombre;
    }

    //constructor privado para el uso exclusivo de Builder
    private Ser(String nombre, double sentidoDeVida) {
        this.nombre = nombre;
        this.sentidoDeVida = sentidoDeVida;
    }


    //getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSentidoDeVida(ActividadClase meditar) {
        return sentidoDeVida;
    }

    public void setSentidoDeVida(double sentidoDeVida) {
        this.sentidoDeVida = sentidoDeVida;
    }

    //metodo de clase
    public void buscarSignificado (ActividadClase actividadClase){
        System.out.println(nombre + " busca significado en " + actividadClase.getDescripcion());
        sentidoDeVida += actividadClase.getValorSentido();
        System.out.println("Sentido de vida actual: " + sentidoDeVida);
    }

    @Override
    public String toString() {
        return "Ser{" +
                "nombre='" + nombre + '\'' +
                ", sentidoDeVida=" + sentidoDeVida +
                '}';
    }

    //Builder para construir el Ser de manera flexible
    public static class SerBuilder {
        private String nombre;
        private double sentidoDeVida;

      public SerBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public SerBuilder conSentidoDeVida(double sentidoDeVida) {
            this.sentidoDeVida = sentidoDeVida;
            return this;
        }

        public Ser build() {
            return new Ser(this.nombre, this.sentidoDeVida);
        }
    }
}
