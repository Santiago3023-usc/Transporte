package modelotransporte;
public class Taxi extends Vehiculo  {
    private String conductor;
    private int tarifaBase;

    public Taxi(int id, String estado, String velocidadProm, int capacidad, String conductor, int tarifaBase) {
        super(id, estado, velocidadProm, capacidad);
        this.conductor = conductor;
        this.tarifaBase = tarifaBase;
    }
    
    public String getConductor(){
        return conductor;
    }

    public int getTarifaBase(){
        return tarifaBase;
     }

}
