/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.proyectobase;

import java.io.Serializable;

/**
 *
 * @author larapresa
 */
// Clase que hereda de Persona y añade el atributo curso
public class Estudiante extends Persona implements Serializable {
    
    private String curso;
    
    // Constructor
    public Estudiante(String nombre, String apellidos, String dni, String curso) {
        super(nombre, apellidos, dni);
        this.curso = curso;
    }
    
    // Método getter para el curso
    public String getCurso() {
        return curso;
    }
    
    // Método setter para el curso
    public void setCurso(String curso) {
        this.curso = curso;
    }
     @Override
    public String toString() {
        String contenido = "Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Curso: " + curso;
        return contenido;
    }
}
