import java.util.Date;

public class Viaje {

    private int codigo;
    private String origen;
    private String destino;
    private Date fechaViaje;
    private Autobus autobus;


    public Viaje(int codigo, String origen, String destino, Date fechaViaje) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
    }

    public Viaje(int codigo, String origen, String destino, Date fechaViaje, Autobus autobus) {
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

    public void asignarAutobus(Autobus autobus){
        this.autobus = autobus;
    }



}
