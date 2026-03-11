package src.controller;

import src.view.VentanaLogin;
import src.view.VentanaNotas;

import javax.swing.JOptionPane;

import src.service.ServicioUsuarios;

public class GestorAutenticacion {
    
    private VentanaLogin view;
    private src.service.ServicioUsuarios service = new src.service.ServicioUsuarios();

    public ControladorAutenticacion(VentanaLogin vista) {
        this.vista = vista;

        vista.botonLogin.addActionListener(e -> login());
        vista.botonRegistro.addActionListener(e -> registrar());
    }

    private void login() {
        String u = vista.usuario.getText();
        String p = new String(vista.password.getPassword());

        if (servicio.login(u, p)) {
            JOptionPane.showMessageDialog(vista, "Login correcto");

            vista.dispose();

            new ControladorNotas(new VentanaNotas(), u);

        } else {
            JOptionPane.showMessageDialog(vista, "Error de login");
        }
    }

    private void registrar() {
        String u = vista.usuario.getText();
        String p = new String(vista.password.getPassword());

        if (servicio.registrar(u, p)) {
            JOptionPane.showMessageDialog(vista, "Usuario registrado");
        } else {
            JOptionPane.showMessageDialog(vista, "Usuario ya existe");
        }
    }
}

