package src.controller;

import src.view.VentanaLogin;
import src.view.VentanaNotas;

import javax.swing.JOptionPane;

import src.service.ServicioUsuarios;

public class GestorAutenticacion {
    
    private VentanaLogin view;
    private src.service.ServicioUsuarios service = new src.service.ServicioUsuarios();

    public ControladorAutenticacion(VentanaLogin view) {
        this.view = view;

        view.botonLogin.addActionListener(e -> login());
        view.botonRegistro.addActionListener(e -> registrar());
    }

    private void login() {
        String u = view.usuario.getText();
        String p = new String(view.password.getPassword());

        if (service.login(u, p)) {
            JOptionPane.showMessageDialog(view, "Login correcto");

            view.dispose();

            new GestorNotas(new VentanaNotas(), u);

        } else {
            JOptionPane.showMessageDialog(view, "Error de login");
        }
    }

    private void registrar() {
        String u = view.usuario.getText();
        String p = new String(view.password.getPassword());

        if (service.registrar(u, p)) {
            JOptionPane.showMessageDialog(view, "Usuario registrado");
        } else {
            JOptionPane.showMessageDialog(view, "Usuario ya existe");
        }
    }
}

