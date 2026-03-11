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
}
