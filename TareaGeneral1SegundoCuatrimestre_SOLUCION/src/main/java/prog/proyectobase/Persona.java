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
public class Persona implements Serializable {

    protected String nombre;
    protected String apellidos;
    protected String dni;

    // Constructores
    // -------------
    // Constructor
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    // Constructor copia
    public Persona(Persona persona) {
        this.nombre = persona.getNombre();
        this.apellidos = persona.getApellidos();
        this.dni = persona.getDni();
    }

    // Métodos get
    // -------------
    // Método getNombre
    protected String getNombre() {
        return nombre;
    }

    // Método getApellidos
    protected String getApellidos() {
        return apellidos;
    }

    // Método getFechaNacim
    protected String getDni() {
        return this.dni;
    }

    // Métodos set
    // -------------
    // Método setNombre
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setApellidos
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Método setFechaNacim
    protected void setFechaNacim(String dni) {
        this.dni = dni;
    }

    // -------------------------------------------------------
    // Método devolverContenidoString 
    @Override
    public String toString() {
        String contenido = "Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni;
        return contenido;
    }

}
