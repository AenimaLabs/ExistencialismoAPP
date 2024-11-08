package model;

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

    //constructor con parámetros
    public Ser(String nombre, double sentidoDeVida) {
        this.nombre = nombre;
        this.sentidoDeVida = 0;
    }


    //getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSentidoDeVida() {
        return sentidoDeVida;
    }

    public void setSentidoDeVida(double sentidoDeVida) {
        this.sentidoDeVida = sentidoDeVida;
    }

    //metodo de clase
    public void buscarSignificado (Actividad actividad){
        actividad.realizar();
        if (actividad.esSignificativo()){
            sentidoDeVida +=10;
            System.out.println(nombre + " ha encontrado un propósito en esta actividad");
        }else {
            System.out.println(nombre + " no ha encontrado un propósito en esta actividad");
        }
        System.out.println("Sentido de vida actual: " + sentidoDeVida);
    }

    @Override
    public String toString() {
        return "Ser{" +
                "nombre='" + nombre + '\'' +
                ", sentidoDeVida=" + sentidoDeVida +
                '}';
    }
}
