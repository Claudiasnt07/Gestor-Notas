package src.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class RepositorioUsuarios {
    
    private static final String ARCHIVO = "usuarios.txt";

    public void guardarUsuario(String usuario, String hash) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(usuario + ":" + hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Map<String, String> cargarUsuarios() {
        Map<String, String> usuarios = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
                usuarios.put(partes[0], partes[1]);
            }
        } catch (Exception e) {
        }

        return usuarios;
    }
}
