public class Autobus {
    private Asiento[] asientos;
    //TODO Clase posicion para guardar la posicion de cada asiento dentro de su propio autobus?
    private int identificadorAutobus;

    public Autobus(int identificadorAutobus){
        this.identificadorAutobus = identificadorAutobus;
    }

    public Autobus(Asiento[] asientos, int identificadorAutobus) {
        this.asientos = asientos;
        this.identificadorAutobus = identificadorAutobus;
    }

    public void asignarAsiento(int numeroAsiento, Viajero viajero){

        Asiento asiento = asientos[numeroAsiento];
        asiento.asignarAsiento(viajero);

    }

    public void desasignarAsiento(int numeroAsiento){
        asientos[numeroAsiento].desasignarAsiento();
    }





}
