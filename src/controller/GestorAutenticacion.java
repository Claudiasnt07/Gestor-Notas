package src.controller;

import src.view.VentanaLogin;
import src.service.ServicioUsuarios;

public class GestorAutenticacion {
    
    private VentanaLogin view;
    private src.service.ServicioUsuarios service = new src.service.ServicioUsuarios();

    public ControladorAutenticacion(VentanaLogin vista) {
        this.vista = vista;

        vista.botonLogin.addActionListener(e -> login());
        vista.botonRegistro.addActionListener(e -> registrar());
    }
}

