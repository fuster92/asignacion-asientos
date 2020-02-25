import java.io.*;
import java.util.Scanner;

public class Autobus {
    private static int ASIENTOS_MAXIMOS = 65;

    private Asiento[] asientos;
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
