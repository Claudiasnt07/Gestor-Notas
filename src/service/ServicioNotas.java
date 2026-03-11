package src.service;

import model.Nota;
import persistence.RepositorioNotas;
import java.util.*;

public class ServicioNotas {

    private List<Nota> notas;
    private RepositorioNotas repo = new RepositorioNotas();
    private String usuario;

}