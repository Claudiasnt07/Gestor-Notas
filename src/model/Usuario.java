package src.model;

public class Usuario {
    
    private String nombre;
    private String hashPassword;

    public Usuario(String nombre, String hashPassword) {
        this.nombre = nombre;
        this.hashPassword = hashPassword;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHashPassword() {
        return hashPassword;
    }
}
