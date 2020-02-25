import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Scanner;

public class Oficina {
    private static final String DATOS_AUTOBUS = "autobuses.data";
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

    public void crearViaje(int codigo, String origen, String destino, Calendar fechaViaje, Autobus autobus ){
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

    private void cargarInformacionAutobus(){
        String leido;
        Scanner lector;

        try {
            //TODO 1 quitar este código
            BufferedReader ficheroEntrada =
                    new BufferedReader(
                            new FileReader(DATOS_AUTOBUS));

            lector = new Scanner(ficheroEntrada);
            while (lector.hasNext()){
                autobuses[totalAutobuses] = parseaAutobus(lector);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Autobus parseaAutobus(Scanner lector){
        int codigoAutobus;
        Asiento[] asientos;
        codigoAutobus = lector.nextInt();
        asientos = parseLineaAsientos(lector.nextLine());
        Autobus autobus = new Autobus(asientos, codigoAutobus);

        return autobus;
    }

    private static Asiento[] parseLineaAsientos(String linea){
        Scanner lectorAsiento = new Scanner(linea);
        Asiento[] asientos;
        //TODO 2 parseador de asientos
        return asientos = null;

    }
}
