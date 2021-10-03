/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

/**
 *
 * @author Maxi Ybañez
 */
public class Cliente {
    private long dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String domicilio;

    public Cliente(long dni, String nombre, String apellido, String ciudad, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    
    @Override
    public String toString() {
        return "dni=" + dni + "\n" + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", domicilio=" + domicilio ;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
