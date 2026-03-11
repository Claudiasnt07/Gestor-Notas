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

    public void crearNota(String titulo, String contenido) {
        notas.add(new Nota(titulo, contenido));
        repo.guardarNotas(usuario, notas);
    }

    public void eliminarNota(int indice) {
        notas.remove(indice);
        repo.guardarNotas(usuario, notas);
    }

    public void editarNota(int indice, String titulo, String contenido) {
        Nota n = notas.get(indice);
        n.setTitulo(titulo);
        n.setContenido(contenido);
        repo.guardarNotas(usuario, notas);
    }
}