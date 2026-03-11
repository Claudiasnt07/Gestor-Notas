package src.service;

import persistence.RepositorioUsuarios;
import src.persistence.RepositorioNotas;
import utils.UtilHash;
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
}
