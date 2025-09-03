package modelotransporte;

public class Autobus extends Vehiculo {

    private String ruta;
    private int numeroPasajeros;

    public Autobus(String id, int velocidadProm, int capacidad, String estado, String ruta, int numeroPasajeros) {
        super(id, velocidadProm, capacidad, estado);
        this.ruta = ruta;
        this.numeroPasajeros = numeroPasajeros;

    } 
} 
    

