package src.persistence;

import java.io.FileWriter;
import java.io.PrintWriter;

public class RepositorioUsuarios {
    
    private static final String ARCHIVO = "usuarios.txt";

    public void guardarUsuario(String usuario, String hash) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(usuario + ":" + hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
