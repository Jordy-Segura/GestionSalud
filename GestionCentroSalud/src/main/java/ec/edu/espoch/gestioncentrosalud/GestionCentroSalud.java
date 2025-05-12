/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.gestioncentrosalud;

/**
 *
 * @author SO-LAB1-PC19
 */
public class GestionCentroSalud {

    public static void main(String[] args) {
       CentroSalud centro = new CentroSalud();

        // Registrar pacientes
        centro.registrarPaciente(new PacienteGeneral("Jordy Segura", 20, "1234567890"));
        centro.registrarPaciente(new PacienteEmergencia("Cristopher Munoz", 25, "0987654321"));
        centro.registrarPaciente(new PacienteGeneral("Josue Guerreo", 21, "1122334455"));
        centro.registrarPaciente(new PacienteEmergencia("Martha Ruiz", 60, "5566778899"));
        centro.registrarPaciente(new PacienteHospitalizado("Pedro Soto", 70, "6677889900"));
        
        centro.atenderEmergencia();
        centro.atenderConsultaGeneral();
        centro.atenderEmergencia();
        centro.atenderConsultaGeneral();

        centro.mostrarPacientesRegistrados();

        centro.generarReporteFinal();
    
    }
}
