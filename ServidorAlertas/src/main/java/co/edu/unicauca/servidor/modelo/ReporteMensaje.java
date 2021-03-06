package co.edu.unicauca.servidor.modelo;

import co.edu.unicauca.servidor.dto.DatosSensorDTO;

public class ReporteMensaje {
    private DatosSensorDTO datos;
    private String date;

    public ReporteMensaje(DatosSensorDTO datos, String date) {
        this.datos = datos;
        this.date = date;
    }

    public DatosSensorDTO getMensaje() {
        return datos;
    }

    public void setMensaje(DatosSensorDTO datos) {
        this.datos = datos;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}