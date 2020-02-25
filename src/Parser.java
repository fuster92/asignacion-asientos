import java.util.Scanner;

public class Parser {
    private static final int VIAJE = 3;
    private static final int AUTOBUS = 2;
    private static final int ASIENTO = 1;

    private static final String PATRON_FECHA = "[0-9]{4}-[01][0-9]-";
    private static final String PATRON_VIAJE = "\\d/\\w/\\w/" + PATRON_FECHA + "/\\d";
    private static final String PATRON_AUTOBUS = "";
    private static final String PATRON_ASIENTO = "";
    Scanner lector;


    public Parser(String ruta, int tipo){

    }
}
