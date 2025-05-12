/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestioncentrosalud;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author sahid
 */
public class CentroSalud {
    private Stack<PacienteEmergencia> pilaEmergencias = new Stack<>();
    private Queue<PacienteGeneral> colaConsulta = new LinkedList<>();
    private List<Paciente> listaRegistro = new ArrayList<>();
    private List<Paciente> listaAtendidos = new ArrayList<>();

    public void registrarPaciente(Paciente paciente) {
        listaRegistro.add(paciente);
        if (paciente instanceof PacienteEmergencia) {
            pilaEmergencias.push((PacienteEmergencia) paciente);
        } else if (paciente instanceof PacienteGeneral) {
            colaConsulta.add((PacienteGeneral) paciente);
        }
    }

  
      public void atenderEmergencia() {
        if (!pilaEmergencias.isEmpty()) {
            PacienteEmergencia paciente = pilaEmergencias.pop();
            listaAtendidos.add(paciente);
            System.out.println("Atendido (Emergencia): " + paciente);
        } else {
            System.out.println("No hay pacientes de emergencia.");
        }
    }

    public void atenderConsultaGeneral() {
        if (!colaConsulta.isEmpty()) {
            PacienteGeneral paciente = colaConsulta.poll();
            listaAtendidos.add(paciente);
            System.out.println("Atendido (Consulta General): " + paciente);
        } else {
            System.out.println("No hay pacientes de consulta general.");
        }
    }

    public void mostrarPacientesRegistrados() {
        System.out.println("\nPacientes registrados hoy:");
        for (Paciente p : listaRegistro) {
            System.out.println(p);
        }
    }

    public void generarReporteFinal() {
        System.out.println("\n=== Reporte Final de Pacientes Atendidos ===");
        for (Paciente p : listaAtendidos) {
            System.out.println(p);
        }
    }
 
}
