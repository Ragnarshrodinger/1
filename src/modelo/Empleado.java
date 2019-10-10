/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Empleado extends Persona{
    private double sueldo;
    private String fechaNacimiento;
    private String cargo;

    public Empleado(double sueldo, String fechaNacimiento, String cargo) {
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
    }

    public Empleado(double sueldo, String fechaNacimiento, String cargo, String docIdentidad, String tipoDocumento, String apellido, String nombre, int edad, String estado) {
        super(docIdentidad, tipoDocumento, apellido, nombre, edad, estado);
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    

 
    
    
}
