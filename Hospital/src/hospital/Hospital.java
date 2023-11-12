/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author JESSICA
 */
public class Hospital {

    private ArrayList<Paciente>
            listaPacientes = new ArrayList<>();
    
    private ArrayList<Médico>
            listaMedicos = new ArrayList<>();
            
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hospital sistema = new Hospital();
        sistema.ejecutarMenu();   
     
    }
    
    
    private void ejecutarMenu() {
        
        Scanner scanner = new Scanner(System.in);
        int opcion ;
        
         do {
            System.out.println("Menú:");
            System.out.println("1. Registrar datos de pacientes");
            System.out.println("2. Eliminar datos de un paciente");
            System.out.println("3. Modificar datos de un paciente");
            System.out.println("4. Mostrar peso que más se repite");
            System.out.println("5. Mostrar cantidad de pacientes con peso que más se repite");
            System.out.println("6. Mostrar peso mayor y menor");
            System.out.println("7. Dividir rango de pesos y mostrar cantidad en cada rango");
            System.out.println("8. Mostrar lista de pacientes ordenados por apellidos");
            System.out.println("9. Indicar qué doctor atendió a un paciente");
            System.out.println("10. Buscar doctores por especialidad");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPaciente();
                    break;
                case 2:
                    eliminarPaciente();
                    break;
                case 3:
                    modificarPaciente();
                    break;
                case 4:
                    mostrarPesoMasRepite();
                    break;
                case 5:
                    mostrarCantidadPacientesPesoRepite();
                    break;
                case 6:
                    mostrarPesoMayorYMenor();
                    break;
                case 7:
                    dividirRangoPesos();
                    break;
                case 8:
                    mostrarListaPacientesOrdenados();
                    break;
                case 9:
                    indicarDoctorAtendio();
                    break;
                case 10:
                    buscarDoctoresPorEspecialidad();
                    break;
            }

        } while (opcion != 0);
    }

    private void registrarPaciente() {
       //completar
     
       
    }

    private void eliminarPaciente() {
        //falta
    }

    private void modificarPaciente() {
        //falta
    }

    private void mostrarPesoMasRepite() {
        //falta
    }

    private void mostrarCantidadPacientesPesoRepite() {
        //falta
    }

    private void mostrarPesoMayorYMenor() {
        //falta
    }

    private void dividirRangoPesos() {
        //falta
    }

    private void mostrarListaPacientesOrdenados() {
        //te 
    }

    private void indicarDoctorAtendio() {
        //hi
        Médico medico1 = new Médico(0, "Carlos Pérez", "Odontología");
        medico1.setNumdecolegiatura(4);
        medico1.setNombre("Manuel Lopez");
        medico1.setEspecialidad("Cardiología");
    }

    private void buscarDoctoresPorEspecialidad() {
        //mua
    }

    
    
    
}
