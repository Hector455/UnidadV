/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class Persona {

    String nombre;
    int calificacion;

    public Persona(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Getter que devuelve la calificación
    public int calificacion() {
        return this.calificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", calificacion=" + calificacion + '}';
    }
}
