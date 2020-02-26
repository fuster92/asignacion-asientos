import java.util.Date;

public class Oficina {

    private static final int VIAJES_MAXIMOS = 100;
    private static final int AUTOBUSES_MAXIMOS = 100;

    private Viaje[] viajes;
    private int totalViajes;
    private Autobus[] autobuses;
    private int totalAutobuses;


    public Oficina(Viaje[] viajes, Autobus[] autobuses) {
        this.viajes = viajes;
        this.autobuses = autobuses;
    }

    //TODO preguntar si el codigo de viaje lo puedo utilizar como indice
    public void crearViaje(int codigo, String origen, String destino, Date fechaViaje, Autobus autobus ){
        viajes[totalViajes] = new Viaje(codigo, origen, destino, fechaViaje, autobus);
        totalViajes++;
        autobuses[totalAutobuses] = autobus;
        totalAutobuses++;
    }

    public void eliminarViaje(){

    }

    public void asignarAsiento(int codigoViaje, int numero, Viajero viajero){
        Viaje viaje = viajes[codigoViaje];
        viaje.asignarAsiento(numero, viajero);
    }

    public void desasignarAsiento(int codigoViaje, int numero){
        Viaje viaje = viajes[codigoViaje];
        viaje.desasignarAsiento(numero);
    }


}
