import java.util.Calendar;

public class Viaje {

    private int codigo;
    private String origen;
    private String destino;
    private Calendar fechaViaje;
    private Autobus autobus;

    public Viaje(int codigo, String origen, String destino, Calendar fechaViaje, Autobus autobus) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.autobus = autobus;
    }

    public void asignarAsiento(int numero, Viajero viajero){
        autobus.asignarAsiento(numero, viajero);
    }

    public void desasignarAsiento(int numero){
        autobus.desasignarAsiento(numero);
    }



}
