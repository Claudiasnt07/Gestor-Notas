package src.view;

import javax.swing.*;

public class VentanaLogin JFrame {
    
    public JTextField usuario = new JTextField();
    public JPasswordField password = new JPasswordField();

    public JButton botonLogin = new JButton("Login");
    public JButton botonRegistro = new JButton("Registrar");

    public VentanaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        usuario.setBounds(80, 20, 150, 25);
        password.setBounds(80, 60, 150, 25);

        botonLogin.setBounds(30, 110, 100, 30);
        botonRegistro.setBounds(150, 110, 100, 30);

        add(new JLabel("Usuario")).setBounds(20, 20, 80, 25);
        add(usuario);

        add(new JLabel("Password")).setBounds(20, 60, 80, 25);
        add(password);

        add(botonLogin);
        add(botonRegistro);

        setVisible(true);
}
