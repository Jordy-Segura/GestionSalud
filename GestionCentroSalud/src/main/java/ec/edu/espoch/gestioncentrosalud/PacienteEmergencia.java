/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestioncentrosalud;

/**
 *
 * @author sahid
 */
public class PacienteEmergencia extends Paciente{
    public PacienteEmergencia(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
    }

    @Override
    public String getTipo() {
        return "Emergencia";
    }
}
