package model;

import interfaz.Actividad;

public class Ser {

    //atributos
    private String nombre;
    private double sentidoDeVida;


    public Ser(String nombre) {
        this.nombre = nombre;
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
