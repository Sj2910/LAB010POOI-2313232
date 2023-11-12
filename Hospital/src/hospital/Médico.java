/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author JESSICA
 */
public class Médico {
    
    private int numdecolegiatura;
    private String nombre;
    private String especialidad;
    
    //constructor

    public Médico(int numdecolegiatura, String nombre, String especialidad) {
        this.numdecolegiatura = numdecolegiatura;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumdecolegiatura() {
        return numdecolegiatura;
    }

    public void setNumdecolegiatura(int numdecolegiatura) {
        this.numdecolegiatura = numdecolegiatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    
    
    
    
    
            
            
            
            
            
            
}
