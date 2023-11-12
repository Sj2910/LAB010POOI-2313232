/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author JESSICA
 */
public class Paciente {
    
    private String dni;
    private String nombre;
    private String direccion;
    private double peso;
    private double temperatura;
    private Médico medicoAtiende;
    
    //constructor

    public Paciente(String dni, String nombre, String direccion, double peso, double temperatura, Médico medicoAtiende) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.peso = peso;
        this.temperatura = temperatura;
        this.medicoAtiende = medicoAtiende;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Médico getMedicoAtiende() {
        return medicoAtiende;
    }

    public void setMedicoAtiende(Médico medicoAtiende) {
        this.medicoAtiende = medicoAtiende;
    }

    

    

   
    
    
    
    
}
