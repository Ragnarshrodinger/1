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
public class Persona {
    private String docIdentidad;
    private String tipoDocumento;
    private String apellido;
    private String nombre;
    private int edad;
    private String estado;

    public Persona() {
    }

    public Persona(String docIdentidad, String tipoDocumento, String apellido, String nombre, int edad, String estado) {
        this.docIdentidad = docIdentidad;
        this.tipoDocumento = tipoDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "docIdentidad=" + docIdentidad + ", tipoDocumento=" + tipoDocumento + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }
    
    
    
}
