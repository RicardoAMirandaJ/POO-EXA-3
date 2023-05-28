/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeGestionDeEstudiantes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class StudentManagementSystem {
    private ArrayList<Estudiante> estudiantes;

    public StudentManagementSystem() {
        this.estudiantes = new ArrayList<>();
    }

    public void addStudent(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante getStudent(int rollNumber) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroLista() == rollNumber) {
                return estudiante;
            }
        }
        return null;
    }

    public void storeData(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(estudiantes);
            System.out.println("Datos almacenados en el archivo: " + filename);
        } catch (IOException e) {
            System.out.println("Error al almacenar los datos en el archivo: " + filename);
        }
    }

    @SuppressWarnings("unchecked")
    public void loadData(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            estudiantes = (ArrayList<Estudiante>) inputStream.readObject();
            System.out.println("Datos cargados desde el archivo: " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos desde el archivo: " + filename);
        }
    }
}