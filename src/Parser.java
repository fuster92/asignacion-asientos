import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final String DATOS_AUTOBUS = "autobuses.data";
    private static final String DATOS_VIAJES = "viajes.data";

    private static final int VIAJE = 3;
    private static final int AUTOBUS = 2;
    private static final int ASIENTO = 1;

    /*
        Patron con el formato codigoViaje/Origen/Destino/AAAA-MM-DD-HH-MM/codigoAutobus
     */
    private static final String PATRON_VIAJE = "(\\d+)/(\\w+)/(\\w+)/(\\d{4})-(\\d{2})-(\\d{2})-(\\d{2})-(\\d{2})/(\\d+)";
    private static final String PATRON_AUTOBUS = "";
    private static final String PATRON_ASIENTO = "";
    Scanner lector;


    public Parser(String ruta, int tipo){

    }

    private void cargarInformacionAutobuses(){
        String leido;
        Scanner lector;

        try {
            //TODO acabar metodo cargarInformacion
            File ficheroDatosAutobus = new File(DATOS_AUTOBUS);
            lector = new Scanner(ficheroDatosAutobus);
            while (lector.hasNext()){
                //autobuses[totalAutobuses] = parseaAutobus(lector);
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

    //TODO cambiar los return
    public static void cargarInformacionViajes(){

        File ficheroDatosViajes = new File(DATOS_VIAJES);
        try {
            Scanner lector = new Scanner(ficheroDatosViajes);
            while(lector.hasNextLine()){
                parseaLineaViaje(lector.nextLine());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void parseaLineaViaje(String lineaViaje){
        Pattern patronViaje = Pattern.compile(PATRON_VIAJE);
        Matcher capturador = patronViaje.matcher(lineaViaje);
        while (capturador.find()){
            parseaViaje(capturador);
        }

    }

    public static void parseaViaje(Matcher m){
        //TODO retocar parseaViaje

        String[] fechas = {m.group()};

        return new Viaje(m.group(1), m.group(2), m.group(3), parseaFecha(m.));
        for (int i = 1; i < m.groupCount(); i++){
            System.out.println(m.group(i));
        }
    }

    private static Date parseaFecha(String[] args){
        int[] fechas = new int[args.length];
        for (int i = 0; i < args.length; i++){
            fechas[i] = Integer.parseInt(args[i]);
        }
        return new GregorianCalendar(fechas[0], fechas[1], fechas[2], fechas[3], fechas[4]).getTime();
    }
}