/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_3ra_evaluacion_honeycomb;

import SistemaDeGestionDeEstudiantes.Estudiante;
import SistemaDeGestionDeEstudiantes.StudentManagementSystem;

/**
 *
 * @author ricar
 */
public class EXAMEN_3RA_EVALUACION_HONEYCOMB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante("Ricardo", 21, "2° grado");
        Estudiante estudiante2 = new Estudiante("Ivan", 16, "2° grado");
        Estudiante estudiante3 = new Estudiante("Axel", 9, "2° grado");

        StudentManagementSystem system = new StudentManagementSystem();

        system.addStudent(estudiante1);
        system.addStudent(estudiante2);
        system.addStudent(estudiante3);

        system.storeData("estudiantes.dat");

        system = new StudentManagementSystem();

        system.loadData("estudiantes.dat");

        Estudiante estudianteRecuperado = system.getStudent(2);
        if (estudianteRecuperado != null) {
            System.out.println("Info:");
            System.out.println(estudianteRecuperado);
        } else {
            System.out.println("No se encontro el estudiante.");
        }
    }
    
}
