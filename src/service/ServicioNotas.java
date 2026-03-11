package src.service;

import model.Nota;
import persistence.RepositorioNotas;
import java.util.*;

public class ServicioNotas {

    private List<Nota> notas;
    private RepositorioNotas repo = new RepositorioNotas();
    private String usuario;

    public ServicioNotas(String usuario) {
        this.usuario = usuario;
        notas = repo.cargarNotas(usuario);
    }

    public List<Nota> getNotas() {
        return notas;
    }
}