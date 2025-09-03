package modelotransporte;

public class Vehiculo { 
    private int id;
    private String estado;
    private String velocidadProm;
    private int capacidad;

    public Vehiculo(int id, String estado, String velocidadProm, int capacidad){
        this.id=id;
        this.estado=estado;
        this.velocidadProm=velocidadProm;
        this.capacidad=capacidad;
    }
    
    public int getId(){ 
        return id;
    }

    public void setEstado(String estado){
            this.estado = estado;
    
    }

    public String getEstado(){
        return estado;
    }

    public String getVelocidadProm(){
        return velocidadProm;
    }

    public int getCapacidad(){
        return capacidad;
    }
}
