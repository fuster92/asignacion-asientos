public class Viajero {
    private String nombreViajero;
    private String dni;

    public Viajero(String nombreViajero, String dni) {
        this.nombreViajero = nombreViajero;
        this.dni = dni;
    }

    public String getNombreViajero() {
        return nombreViajero;
    }

    public String getDni(){
        return dni;
    }
}
