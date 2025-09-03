package modelotransporte;



public class UsuarioAdmin extends Usuario{ 
    private String cargo;

    public UsuarioAdmin(String nombre, int cedula , String cargo){
        super(nombre,cedula);
        this.cargo=cargo;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
        
}

