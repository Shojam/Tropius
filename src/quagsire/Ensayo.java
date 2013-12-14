/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagsire;

/**
 *
 * @author Roberto
 */
public class Ensayo {
    
    Double tension;
    Double tensionEnsayo;
    Double corrienteFugaMax;
    Double corrienteFugaMedia;
    Double temperatura;
    Double humedad;
    String tiempo;
    String observaciones;

    public Double getTension() {
        return tension;
    }

    public Double getTensionEnsayo() {
        return tensionEnsayo;
    }

    public Double getCorrienteFugaMax() {
        return corrienteFugaMax;
    }

    public Double getCorrienteFugaMedia() {
        return corrienteFugaMedia;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Double getHumedad() {
        return humedad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Ensayo(Double tension, Double tensionEnsayo, Double corrienteFugaMax, Double corrienteFugaMedia, Double temperatura, Double humedad, String tiempo, String observaciones) {
        this.tension = tension;
        this.tensionEnsayo = tensionEnsayo;
        this.corrienteFugaMax = corrienteFugaMax;
        this.corrienteFugaMedia = corrienteFugaMedia;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.tiempo = tiempo;
        this.observaciones = observaciones;
    }
    
    
    
}
