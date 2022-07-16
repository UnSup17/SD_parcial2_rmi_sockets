package co.edu.unicauca.servidor.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import co.edu.unicauca.servidor.dto.DatosSensorDTO;

public class GestionSensoresImpl extends UnicastRemoteObject implements GestionSensoresInt {
    private Map<Integer, DatosSensorDTO> datosHabitaciones;

    public GestionSensoresImpl() throws RemoteException {
        super();
        this.datosHabitaciones = new HashMap<Integer, DatosSensorDTO>();
    }

    @Override
    public boolean registrarSensor(int numHabitacion) throws RemoteException {
        System.out.println("Entrando a registrar Sensor...");
        datosHabitaciones.put(numHabitacion, null); //TODO revisar que en la llave (numHabitacion) ya no se encuentre un sensor registrado
        return true;
    }
    // Forma de recorrer el hashmap para 
    // for (Map.Entry<Integer, DatosSensorDTO> entry : datosHabitaciones.entrySet()) {
    //     System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue().toString());
    // }
    @Override
    public boolean enviarDatosSensor(int numHabitacion, DatosSensorDTO objDatosSensor) throws RemoteException {
        System.out.println("Recibiendo y analizando datos de habitacion: " + numHabitacion);
        datosHabitaciones.put(numHabitacion, objDatosSensor);
        if (!valoresDentroDeRango(objDatosSensor)) {
            //TODO notificarle a los clientesNotificacion
        }
        return false;
    }
    private boolean valoresDentroDeRango(DatosSensorDTO datos) {
        if (datos.getFrecuenciaCardiaca() < 60 || datos.getFrecuenciaCardiaca() > 80 ||
            datos.getFrecuenciaRespiratoria() < 12 || datos.getFrecuenciaRespiratoria() > 20 ||
            datos.getPresionSistolica() < 110 || datos.getPresionSistolica() > 140 ||
            datos.getPresionDiastolica() < 70 || datos.getPresionDiastolica() > 90 ||
            datos.getTemperatura() < 36.2 || datos.getTemperatura() > 37.2 ||
            datos.getOxigeno() < 95 || datos.getOxigeno() > 100) {
                return false;
        }
        return true;
    }
}