package src.view;

import javax.swing.*;

public class VentanaNotas extends JFrame {
    
    public DefaultListModel<String> modeloLista = new DefaultListModel<>();
    public JList<String> lista = new JList<>(modeloLista);

    public JTextField titulo = new JTextField();
    public JTextArea contenido = new JTextArea();

    public JButton crear = new JButton("Crear");
    public JButton editar = new JButton("Editar");
    public JButton eliminar = new JButton("Eliminar");

    public VentanaNotas() {
        setTitle("Gestor de notas");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollLista = new JScrollPane(lista);
        scrollLista.setBounds(20, 20, 150, 200);

        titulo.setBounds(200, 20, 250, 25);

        JScrollPane scrollContenido = new JScrollPane(contenido);
        scrollContenido.setBounds(200, 60, 250, 120);

        crear.setBounds(200, 200, 80, 30);
        editar.setBounds(290, 200, 80, 30);
        eliminar.setBounds(380, 200, 80, 30);

        add(scrollLista);
        add(titulo);
        add(scrollContenido);

        add(crear);
        add(editar);
        add(eliminar);

        setVisible(true);
    }
}
