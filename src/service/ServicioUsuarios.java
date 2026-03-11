package src.service;

import src.persistence.RepositorioUsuarios;
import src.persistence.RepositorioNotas;
import src.utils.UtilHash;
import java.util.Map;

public class ServicioUsuarios {
    
    private RepositorioUsuarios repo = new RepositorioUsuarios();

    public boolean registrar(String usuario, String password) {
        Map<String, String> usuarios = repo.cargarUsuarios();

        if (usuarios.containsKey(usuario)) {
            return false;
        }

        String hash = UtilHash.generarHash(password);

        repo.guardarUsuario(usuario, hash);

        return true;
    }

    public boolean login(String usuario, String password) {
        Map<String, String> usuarios = repo.cargarUsuarios();

        if (!usuarios.containsKey(usuario)) {
            return false;
        }

        String hash = UtilHash.generarHash(password);

        return usuarios.get(usuario).equals(hash);
    }

    public boolean login(String usuario, String password) {
        Map<String, String> usuarios = repo.cargarUsuarios();

        if (!usuarios.containsKey(usuario)) {
            return false;
        }

        String hash = UtilHash.generarHash(password);

        return usuarios.get(usuario).equals(hash);
    }
}
