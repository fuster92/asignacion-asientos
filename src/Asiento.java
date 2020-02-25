public class Asiento {

    private int codigoAsiento;
    private Viajero viajeroAsignado;
    private boolean asientoAsignado;

    public Asiento(int codigoAsiento, Viajero viajeroAsignado){
        this.codigoAsiento = codigoAsiento;
        this.viajeroAsignado = viajeroAsignado;
        this.asientoAsignado = true;
    }

    public Asiento(int codigoAsiento, Viajero viajeroAsignado, boolean asientoAsignado){
        this.codigoAsiento = codigoAsiento;
        this.viajeroAsignado = viajeroAsignado;
        this.asientoAsignado = asientoAsignado;
    }

    public void asignarAsiento(Viajero viajero){
        //TODO implementar asignarAsiento
    }

    public void desasignarAsiento(){
        //TODO implementar desasignarAsiento
    }

    public boolean estaAsignado(){
        return this.asientoAsignado;
    }
}
