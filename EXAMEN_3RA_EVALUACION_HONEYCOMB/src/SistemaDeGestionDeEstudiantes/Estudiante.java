/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGestionDeEstudiantes;

import java.io.Serializable;

/**
 *
 * @author ricar
 */
public class Estudiante implements Serializable {
    private String nombre;
    private int numeroLista;
    private String grado;

    public Estudiante(String nombre, int numeroLista, String grado) {
        this.nombre = nombre;
        this.numeroLista = numeroLista;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public String getGrado() {
        return grado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número de lista: " + numeroLista + ", Grado: " + grado;
    }
}

