/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestioncentrosalud;

/**
 *
 * @author SO-LAB1-PC20
 */
public class PacienteGeneral extends Paciente {

    public PacienteGeneral(String nombre, int edad, String cedula) {
        super(nombre, edad, cedula);
    }

    public String GetTipo() {
        return "Consulta General";
   
    
    }

    @Override
    public String getTipo() {
     return "Consulta General";   
    
    }
}
