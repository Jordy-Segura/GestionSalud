/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestioncentrosalud;

/**
 *
 * @author SO-LAB1-PC19
 */
public abstract class Paciente {
    private static int contadorID = 1;
    private int id;
    private String nombre;
    private int edad;
    private String cedula;

    public Paciente(String nombre, int edad, String cedula) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Cedula: " + cedula + ", Tipo: " + getTipo();
    }
}
