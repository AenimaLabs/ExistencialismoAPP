package model;

import actividades.Actividades;

public class Ser {

    //atributos
    private String nombre;
    private double sentidoDeVida;

    //constructor privado para el uso exclusivo de Builder
    private Ser(String nombre, double sentidoDeVida) {
        this.nombre = nombre;
        this.sentidoDeVida = sentidoDeVida;
    }

    //metodo de clase
    public void buscarSignificado(Actividades actividades) {
        System.out.println(nombre + " busca significado en " + actividades.getDescripcion());
        sentidoDeVida += actividades.getValorSentido();
        System.out.println("Sentido de vida actual: " + sentidoDeVida);
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

    @Override
    public String toString() {
        return "Ser{" +
                "nombre='" + nombre + '\'' +
                ", sentidoDeVida=" + sentidoDeVida +
                '}';
    }
}
