package modelo;

import dto.DatosSensorDTO;

/**
 *
 * @author David Escobar
 */
public class reporteMensaje {
    
    private DatosSensorDTO datos;
    private String date;

    public reporteMensaje(DatosSensorDTO datos, String date) {
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
