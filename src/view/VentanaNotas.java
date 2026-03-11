package src.view;

import javax.swing.*;

public class VentanaNotas extends JFrame {
    
    public DefaultListModel<String> modeloLista = new DefaultListModel<>();
    public JList<String> lista = new JList<>(modeloLista);
}
