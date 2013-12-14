/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagsire;

/**
 *
 * @author Roberto
 */
public class Orden {
    
    Cliente cliente;
    String fecha;
    String codigo;
    Equipo[] listaEquipos;

    public Cliente getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public Equipo[] getListaEquipos() {
        return listaEquipos;
    }

    public Orden(Cliente cliente, String fecha, String codigo, Equipo[] listaEquipos) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.codigo = codigo;
        this.listaEquipos = listaEquipos;
    }
    
    
    
}
