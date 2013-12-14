/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagsire;

/**
 *
 * @author Roberto
 */
public class Cliente {
    
    String nombre;
    String direccion;
    String ciudad;
    String nitcc;
    String telefono;
    String contacto;
    String telefCont;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNitcc() {
        return nitcc;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTelefCont() {
        return telefCont;
    }

    public Cliente(String nombre, String direccion, String ciudad, String nitcc, String telefono, String contacto, String telefCont) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nitcc = nitcc;
        this.telefono = telefono;
        this.contacto = contacto;
        this.telefCont = telefCont;
    }

}
