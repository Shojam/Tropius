/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagsire;

/**
 *
 * @author Roberto
 */
public class Equipo {
    
    String codigo;
    String tipoEquipo;
    String tipo;
    String clase;
    Double tension;
    String estilo;
    String color;
    String talla;
    String longitud;
    boolean perforacion;
    boolean inflado;
    Ensayo ensayo;

    public String getCodigo() {
        return codigo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getClase() {
        return clase;
    }

    public Double getTension() {
        return tension;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getColor() {
        return color;
    }

    public String getTalla() {
        return talla;
    }

    public String getLongitud() {
        return longitud;
    }

    public boolean isPerforacion() {
        return perforacion;
    }

    public boolean isInflado() {
        return inflado;
    }

    public Ensayo getEnsayo() {
        return ensayo;
    }

    public Equipo(String codigo, String tipoEquipo, String tipo, String clase, Double tension, String estilo, String color, String talla, String longitud, boolean perforacion, boolean inflado) {
        this.codigo = codigo;
        this.tipoEquipo = tipoEquipo;
        this.tipo = tipo;
        this.clase = clase;
        this.tension = tension;
        this.estilo = estilo;
        this.color = color;
        this.talla = talla;
        this.longitud = longitud;
        this.perforacion = perforacion;
        this.inflado = inflado;
    }
    
    
    
}
