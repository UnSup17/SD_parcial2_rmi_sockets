package co.edu.unicauca.servidor.dto;

import java.io.Serializable;

public class DatosSensorDTO implements Serializable {
    private int frecuenciaCardiaca;
    private int tensionArterial;
    private int frecuenciaRespiratoria;
    private double temperatura;
    private int oxigeno;

    public DatosSensorDTO() { }
    public DatosSensorDTO(int frecuenciaCardiaca, int tensionArterial, int frecuenciaRespiratoria,
            double temperatura, int oxigeno) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.tensionArterial = tensionArterial;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.oxigeno = oxigeno;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(int tensionArterial) {
        this.tensionArterial = tensionArterial;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }
    
    @Override
    public String toString() {
        return "DatosSensorDTO [frecuenciaCardiaca=" + frecuenciaCardiaca + ", frecuenciaRespiratoria="
                + frecuenciaRespiratoria + ", oxigeno=" + oxigeno + ", temperatura=" + temperatura
                + ", tensionArterial=" + tensionArterial + "]";
    }
}